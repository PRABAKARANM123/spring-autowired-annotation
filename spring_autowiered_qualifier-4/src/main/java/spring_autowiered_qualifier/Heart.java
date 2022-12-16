package spring_autowiered_qualifier;

public class Heart {
	public String nameOfAnimal;
	public int noOfHeart;
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	public int getNoOfHeart() {
		return noOfHeart;
	}
	
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}


	public void pump() {
		System.out.println("Heart is pumping");
		System.out.println("You are Alive...");
	}

}
