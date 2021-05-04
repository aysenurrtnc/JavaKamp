package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerManager;
import Entities.Gamer;

public class GamerManagement implements GamerManager {
	
	private GamerCheckService gamerCheckService;
	
	
	public GamerManagement(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	
	@Override
	public void save(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Successfully registiration " + gamer.getFirstName());
			
		}else {
			System.out.println("Invalid registiration");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Successfully deleted" + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Successfully updated " + gamer.getFirstName());
			
		}else {
			System.out.println("Invalid updated");
		}
		
		
	}

}
