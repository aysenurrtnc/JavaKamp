package Concrete;

import Abstract.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManagement implements SaleManager{

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println("Id number: " + gamer.getId() + " " + "Purchased game :" + game.getGameName());
		
	}

	@Override
	public void campaignBuy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Id number: " + gamer.getId() + " " + "Purchased game :" + game.getGameName() + "discount rate : " + campaign.getDiscount());
		
	}

	

}
