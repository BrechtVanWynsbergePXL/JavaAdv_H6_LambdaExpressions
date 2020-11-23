package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;

public class GameBrowser implements GameCollection.GameFilter {

	private GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		GameCollection.GameFilter filterForFreeGames = game -> {
			if (game.getPrice() == 0) return true;
			else return false;
		};
		return gameCollection.selectGame(filterForFreeGames);
	}

	public List<VideoGame> showGamesInGenre(String action) {
		GameCollection.GameFilter filterForGenre = game -> {
			if(game.getGenres().contains(action)) return true;
			else return false;
		};
		return gameCollection.selectGame(filterForGenre);
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		GameCollection.GameFilter filterOnString = new GameCollection.GameFilter() {
			@Override
			public boolean checkGame(VideoGame game) {
				if(game.getName().toLowerCase().contains(cd.toLowerCase())){
					return true;
				} else {
					return false;
				}
			}
		};
		return gameCollection.selectGame(filterOnString);
	}

	@Override
	public boolean checkGame(VideoGame game) {
		return false;
	}
}
