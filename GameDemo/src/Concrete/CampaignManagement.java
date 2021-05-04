package Concrete;

import Abstract.CampaignManager;
import Entities.Campaign;

public class CampaignManagement implements CampaignManager{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign added to the system : " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted from the system : " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Uptated campaign : " + campaign.getCampaignName());		
	}

}
