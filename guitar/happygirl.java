package quizzes.q1.saba_gelashvili_2.guitar;

public class GuitarPlayer {

    private String name;

    public GuitarPlayer(String name) {
        this.name = name;
    }

    public void playGuitar() {
        System.out.println(name + " is playing the guitar!");
    }

    public static void main(String[] args) {
        GuitarPlayer player = new GuitarPlayer("happygirl");
        player.playGuitar();
    }
}
