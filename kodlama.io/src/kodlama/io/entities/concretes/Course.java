package kodlama.io.entities.concretes;

public class Course {
	
	private int id;
	private int categoryId;
	private String name;
	private String img;
	private Instructor instructor;
	private Category category;

	public Course() {
		super();
	}
	
	public Course(int id,int categoryId, String name, String img, Instructor instructor,Category category) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.img = img;
		this.instructor = instructor;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", categoryId=" + categoryId + ", name=" + name + ", img=" + img + ", instructor="
				+ instructor + ", category=" + category + "]";
	}


	
	
}
