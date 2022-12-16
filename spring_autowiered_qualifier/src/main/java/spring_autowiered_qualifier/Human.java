package spring_autowiered_qualifier;

public class Human {
	private Heart heart;
    // Spring while creating Human class object any dependency 
	//present in human class meeting autowire="byName" 
	//criteria, Inject those bean to their respective dependency
	
	// Spring while creating Human class object any dependency 
	//present in human class meeting autowire="constructor" 
	//criteria(in beans.xml file), Inject those bean to 
	//their respective dependency
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
	// Spring while creating Human class object any dependency 
		//present in human class meeting autowire="byType" 
		//criteria(in beans.xml file), Inject those bean to 
		//their respective dependency
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if(heart != null) {
			heart.pump();
		}
		else {
			System.out.println("Yor are Dead");
		}
		
	}

}
