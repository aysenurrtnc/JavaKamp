package Adapter;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class FakeGamerCheckService implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}
	

}
