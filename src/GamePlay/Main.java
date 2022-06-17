package GamePlay;
import DataStructures.*;

public class Main {
	
	
	
	public static void main(String[] args) {	
		double totalTurns = 0.0;
		double drawcap = 80000.0;
		double drawnum = 0.0;
		double numberOfGames = 1000.0;
		for (int x = 0; x < numberOfGames; x ++) {
			Game game = new Game();
			game.dealDeck();
			int turns = 0;
			while (game.getGameBoolean()) {
				game.playersFlipCards();
				turns ++;
				if (turns == drawcap) {
					game.gameOver();
					drawnum ++;
					turns = 0;
				}
			}	
			totalTurns += turns;
		}		
		System.out.println("Number of Games: " + numberOfGames);
		totalTurns = totalTurns / (numberOfGames - drawnum);
		System.out.println("Turn Average: " + totalTurns);
		System.out.println("Percentage of games ending in draw: " + (drawnum / numberOfGames) * 100.0);
	}


	
}