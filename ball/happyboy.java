package quizzes.q1.saba_gelashvili_2.ball;

public class HappyBoy {

    private String name;

    public HappyBoy(String name) {
        this.name = name;
    }

    public void playWithBall() {
        System.out.println(name + " is playing with the ball!");
    }

    public static void main(String[] args) {
        HappyBoy boy = new HappyBoy("happyboy");
        boy.playWithBall();
    }
}
