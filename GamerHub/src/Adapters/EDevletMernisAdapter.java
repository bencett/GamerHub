package Adapters;
import Absract.UserCheckService;
import Entities.Player;

public class EDevletMernisAdapter {
	
	UserCheckService userCheckService;
	
	public EDevletMernisAdapter(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}
	//k�t� kod ama sim�le etmek yeterli diye b�yle yazd�m
	
	Player player = new Player();
	
	void validate() {
		if (userCheckService.CheckIfRealPerson(player)) {
			
		}
	}
}
