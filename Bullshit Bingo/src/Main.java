import Ui.Ui;
import Game.Game;

import static Game.Game.end_round;
import static Game.Game.isEndGame;

/*
 * This is the main class, putting everything together
*/

public class Main {

    public static void main(String[] args) {

        Ui ui = new Ui();

        ui.initBoard();

        Game game = new Game();

        /*
        * Timeout
        */
        while(! isEndGame()) {
             while (!end_round(ui.getBoard())) {
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
        }
    }

}
