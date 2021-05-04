package Concrete;

import Abstract.GameManager;
import Entities.Game;

public class GameManagement implements GameManager{

	@Override
	public void add(Game game) {
		System.out.println("Game added! " + "Game Id: " + game.getId() + " Game name: " + game.getGameName() + " Game price: " + game.getGamePrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated! " + "Game Id: " + game.getId() + " Game name: " + game.getGameName() + " Game price: " + game.getGamePrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted! " + "Game Id: " + game.getId() + " Game name: " + game.getGameName() + " Game price: " + game.getGamePrice());
		
	}

}
