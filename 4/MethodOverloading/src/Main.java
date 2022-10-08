public class Main {
    public static void main(String[] args) {
        int newscore = calculateScore("Tim", 5);
        System.out.println("New score is " + newscore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player name is " + playerName + " Score is " + score + " point");
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player Score is " + score + " point");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("No Unnamed player ");
        return 0;
    }


}