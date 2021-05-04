package Concrete;
import Absract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game entity) {
		System.out.println("Oyun eklendi.");
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println("Oyun silindi.");
		
	}

	@Override
	public void update(Game entity) {
		System.out.println("Oyun güncellendi.");
		
	}

}
