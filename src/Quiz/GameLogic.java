package Quiz;

public class GameLogic {


    public void sleepFunction(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
