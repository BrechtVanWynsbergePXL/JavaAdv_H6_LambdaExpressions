package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;

public class GameCollection {

	@FunctionalInterface
	interface GameFilter{
		boolean checkGame(VideoGame game);
	}

	private List<VideoGame> videoGames = new ArrayList<>();

	public void addGame(VideoGame game) {
		videoGames.add(game);
	}


	public List selectGame(GameFilter filter){
		List<VideoGame> selectedVideoGames = new ArrayList<>();
		for (VideoGame videoGame: videoGames) {
			if(filter.checkGame(videoGame))
				selectedVideoGames.add(videoGame);
		}
		return selectedVideoGames;
	};

}
