package Adapters;
import Absract.UserCheckService;
import Entities.Player;

public class EDevletMernisAdapter {
	
	UserCheckService userCheckService;
	
	public EDevletMernisAdapter(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}
	//kötü kod ama simüle etmek yeterli diye böyle yazdým
	
	Player player = new Player();
	
	void validate() {
		if (userCheckService.CheckIfRealPerson(player)) {
			
		}
	}
}
