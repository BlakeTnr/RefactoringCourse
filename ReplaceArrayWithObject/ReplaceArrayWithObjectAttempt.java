package ReplaceArrayWithObject;

import java.util.ArrayList;

/*
What the solution did

My solution was arguably better

They just stored 1 game (or they called Performance)
This doesn't really makes sense, and they didn't really
refactor the displayScores method, maybe cause we
didn't have the full implemenetation details
*/

class Tournament {
    ArrayList<Game> games = new ArrayList<>();
    
    public Tournament() {
        Game game = new Game("Liverpool", 15);
        games.add(game);
    }

    public void displayScores() {
        for(Game game : games) {
            game.displayScore();
        }
    }
}

class Game {
    String name;
    int score;
    
    // Hmmm does this actually need name and score?
    public Game(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void displayScore() {
        // stuff down here
    }
}