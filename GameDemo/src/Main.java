import java.sql.Date;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManagement;
import Concrete.GameManagement;
import Concrete.GamerManagement;
import Concrete.SalesManagement;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1, "Loop Hero", 400);
		Game game2 = new Game(2, "Minecraft", 500);
		
		GameManagement gameManagement = new GameManagement();
		gameManagement.add(game1);
		
		Gamer gamer = new Gamer(1, "Ayşenur", "Tunç", new Date(1998, 9, 27), "2219");
		GamerManagement gamerManagement = new GamerManagement(new MernisServiceAdapter());
		gamerManagement.save(gamer);
		gamerManagement.delete(gamer);
		
		Campaign campaign = new Campaign(1,"Holiday Campaign", 50);
		CampaignManagement campaignManagement = new CampaignManagement();
		campaignManagement.add(campaign);
		
		SalesManagement salesManagement = new SalesManagement();
		salesManagement.buy(gamer, game1);
		salesManagement.buy(gamer, game2);

	}

}
