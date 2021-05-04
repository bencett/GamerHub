package Absract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSellService {
	void sellNormal(Game game,Player player);
	void sellWithCampaign(Game game,Player player,Campaign campaign);
}
