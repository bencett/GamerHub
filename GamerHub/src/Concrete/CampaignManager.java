package Concrete;
import Absract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign entity) {
		System.out.println("Kampanya eklendi.");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Kampanya silindi.");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Kampanya güncellendi.");
		
	}

	
}
