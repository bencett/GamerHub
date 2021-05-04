import java.time.LocalDate;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSellManager;
import Concrete.PlayerManager;import Concrete.UserCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		Player cetin = new Player(1,"27215594094","Çetin","Ürün",LocalDate.of(1999, 4, 22));
		Player alex = new Player(2,"12345678912","Alex","De Souza",LocalDate.of(1986, 7, 14));
		Player ozan = new Player(3,"98765432198","Ozan","Tufan",LocalDate.of(1995, 2, 25));
		Player[] players = {cetin,alex,ozan};
		
		System.out.println("-------------------------------------Player--------------------------------------");
		
		PlayerManager playerManager = new PlayerManager(new UserCheckManager());
		for (Player player:players) {
			playerManager.add(player);
			
		}
		
		Game lastOfUs = new Game(1,"Last Of Us",25);
		Game callOfDuty = new Game(1,"Call Of Duty",45);
		Game witcher = new Game(1,"Witcher",15);
		Game[] games = {lastOfUs,callOfDuty,witcher};
		
		System.out.println("-------------------------------------Game--------------------------------------");
		
		GameManager gameManager = new GameManager();
		
		for (Game game:games) {
			gameManager.add(game);
			
		}
		
		Campaign ramazan = new Campaign(1,"Ramazan");
		Campaign yilbasi = new Campaign(2,"Yýlbaþý");
		Campaign karaCuma = new Campaign(3,"Kara Cuma");
		Campaign[] campaigns = {ramazan,yilbasi,karaCuma};
		
		System.out.println("-------------------------------------Campaign--------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		
		for (Campaign campaign:campaigns) {
			campaignManager.add(campaign);
			
		}
		
		System.out.println("-------------------------------------GameSell--------------------------------------");
		
		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.sellNormal(witcher, ozan);
		gameSellManager.sellWithCampaign(callOfDuty, cetin, karaCuma);
		gameSellManager.sellNormal(lastOfUs, alex);
	}

}
