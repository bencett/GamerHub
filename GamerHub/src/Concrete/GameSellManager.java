package Concrete;

import Absract.GameSellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSellManager implements GameSellService{

	@Override
	public void sellNormal(Game game, Player player) {
		System.out.println("Sevgili " + player.getPlayerFirstName() + " " + 
				game.getGameName()+" oyununu ald�n. �yi e�lenceler.");
		
	}

	@Override
	public void sellWithCampaign(Game game, Player player, Campaign campaign) {
		System.out.println("Sevgili "+ player.getPlayerFirstName()+ " "+ game.getGameName()+" oyununu "+
	campaign.getCampaignType()+" kampanyas� ile birlikte ald�n. �yi e�lenceler.");
		
	}

}
