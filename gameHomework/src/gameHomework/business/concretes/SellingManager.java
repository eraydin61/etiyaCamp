package gameHomework.business.concretes;

import java.util.ArrayList;

import gameHomework.business.abstracts.CampaingService;
import gameHomework.business.abstracts.SellingService;
import gameHomework.dataAccess.concretes.HibernateSellingDao;
import gameHomework.entities.concretes.Campaing;
import gameHomework.entities.concretes.Game;
import gameHomework.entities.concretes.Gamer;
import gameHomework.entities.concretes.Selling;


public class SellingManager implements SellingService {
	
	HibernateSellingDao hibernateSellingDao;

	public SellingManager( HibernateSellingDao hibernateSellingDao) {
		this.hibernateSellingDao = hibernateSellingDao;
	}
	
	@Override
	public void campaingSales(Game game,Gamer gamer) {
		
		this.hibernateSellingDao.campaingSellingAdd(game,gamer);
		
	}
	
	@Override
	public void sales(Game game, Gamer gamer) {
		this.hibernateSellingDao.sellingAdd(game, gamer);
		
	}

	@Override
	public ArrayList<Selling> sellingList() {
		return this.hibernateSellingDao.list();
	}

	

}
