package Concrete;

import Absract.UserCheckService;
import Entities.Player;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		if (player.getPlayerFirstName()=="�etin"&& player.getPlayerLastName()=="�r�n"&&
			player.getNationalityId()=="27215594094"&&player.getDateOfBirth().getYear()==1999) 
		{
			return true;
		}
		else {
			return false;
		}
	}

}
