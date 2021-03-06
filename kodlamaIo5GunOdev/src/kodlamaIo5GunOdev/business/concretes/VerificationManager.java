package kodlamaIo5GunOdev.business.concretes;

import java.util.ArrayList;

import kodlamaIo5GunOdev.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{
	
	ArrayList<String> verificatedEmails = new ArrayList<String>();
	
	@Override
	public void sendToVerifyEmail(String email) {
		//DOGRULANAN MAILI DOGRULAMA LISTESINE EKLIYORUZ
		verificatedEmails.add(email);
		System.out.println(email + "  dogrulandi.");	
		
	}

	@Override
	//LINKE SIMILASYON
	public void verifyEmail(String email) {
		System.out.println(email + " mailine dogrulama gönderildi.");
		
	}

	@Override
	//verificatedEmails listesindeki maili kontrol ediyor dogrulanmismi olup olmadiggini buluyor
	public boolean checkVerifyAccount(String email) {
		// CONTAINS ARAMA
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}
