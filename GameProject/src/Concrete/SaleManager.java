package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void saleWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getName() +" oyunu sat���na " + campaign.getName() +  " ba�ar�yla uyguland�.");
		
	}

	@Override
	public void saleGame(Game game) {
		System.out.println(game.getName() + " : sat�� basar�yla uyguland�");
		
	}

}
