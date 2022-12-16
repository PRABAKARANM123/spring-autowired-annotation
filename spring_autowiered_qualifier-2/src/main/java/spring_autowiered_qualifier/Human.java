package spring_autowiered_qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	
	public Human() {
		System.out.println("No orgs constructor called");
	}
    
	public Human(Heart heart) {
    	System.out.println("One arqument Human constructor is called");
		this.heart = heart;
	}
	// @Autowired first it resolve with "byType". if byType fails then 
	// it goes with "byName"
	@Autowired
	public void setHeart(Heart heart) {
		System.out.println("Setter methed is called");
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
