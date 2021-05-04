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
			System.out.println("Tebrikler ba�ar�yla kay�t oldunuz.");
		}
		else {
			System.out.println("Kullan�c� do�rulanamad�.");
		}
		
	}

	@Override
	public void delete(Player entity) {
		System.out.println("Kullan�c� silindi.");
		
	}

	@Override
	public void update(Player entity) {
		System.out.println("Kullan�c� g�ncellendi.");
		
	}

	
	
}
