package Quiz;

public class GameLogic {

    public void sleepFunction(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
