import domain.BlackjackGame;
import domain.Casino;
import view.InputView;
import view.ResultView;

public class Application {
    public static void main(String[] args) throws Exception {
        try(InputView inputView = new InputView()){
            new Casino(inputView, new ResultView()).play(new BlackjackGame());
        }

    }
}