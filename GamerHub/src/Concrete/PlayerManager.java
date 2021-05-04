package Concrete;
import Absract.PlayerService;
import Absract.UserCheckService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	UserCheckService checkService;
	
	public PlayerManager(UserCheckService checkService) {
		this.checkService=checkService;
	}
	
	@Override
	public void add(Player entity) {
		if (checkService.CheckIfRealPerson(entity)) {
			System.out.println("Tebrikler baþarýyla kayýt oldunuz.");
		}
		else {
			System.out.println("Kullanýcý doðrulanamadý.");
		}
		
	}

	@Override
	public void delete(Player entity) {
		System.out.println("Kullanýcý silindi.");
		
	}

	@Override
	public void update(Player entity) {
		System.out.println("Kullanýcý güncellendi.");
		
	}

	
	
}
