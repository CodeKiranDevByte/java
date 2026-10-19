class GameCharacter {
    String rank;
    int health;

    // No-Argument Constructor written by you
    GameCharacter() {
        rank = "Rookie";
        health = 100; // Starting health for every new player
    }

    void showStatus() {
        System.out.println("Player Rank: " + rank + " | Health: " + health);
    }
}

public class NoArgumentCon {
    public static void main(String[] args) {
        // This automatically assigns "Rookie" and 100
        GameCharacter player1 = new GameCharacter();
        GameCharacter player2 = new GameCharacter();

        player1.showStatus();
        player2.showStatus();
    }
}