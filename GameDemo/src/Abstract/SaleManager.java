package Abstract;import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public interface SaleManager {
	
	void buy(Gamer gamer, Game game);
	
	void campaignBuy(Gamer gamer, Game game, Campaign campaign);
	

}
