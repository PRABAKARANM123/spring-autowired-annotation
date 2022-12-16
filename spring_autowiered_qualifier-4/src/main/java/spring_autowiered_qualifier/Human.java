package spring_autowiered_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("animalHeart")
	private Heart heart;
	// if we are using @Autowired using before the dependency
	// no need to write setter method
	
    
	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("name of the animal is "+heart.getNameOfAnimal()+"number of heart present"+heart.getNoOfHeart());
		}
		else {
			System.out.println("Yor are Dead");
		}
		
	}

}
