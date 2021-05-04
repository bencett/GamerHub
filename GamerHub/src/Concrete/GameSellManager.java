package Concrete;

import Absract.GameSellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSellManager implements GameSellService{

	@Override
	public void sellNormal(Game game, Player player) {
		System.out.println("Sevgili " + player.getPlayerFirstName() + " " + 
				game.getGameName()+" oyununu aldýn. Ýyi eðlenceler.");
		
	}

	@Override
	public void sellWithCampaign(Game game, Player player, Campaign campaign) {
		System.out.println("Sevgili "+ player.getPlayerFirstName()+ " "+ game.getGameName()+" oyununu "+
	campaign.getCampaignType()+" kampanyasý ile birlikte aldýn. Ýyi eðlenceler.");
		
	}

}
