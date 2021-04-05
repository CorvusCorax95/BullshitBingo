import Ui.Ui;
import Game.Game;

import static Game.Game.end_game;

public class Main {

    public static void main(String[] args) {


        Ui ui = new Ui();

        ui.initBoard();

        Game game = new Game();

        while (!end_game(ui.getBoard())) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



}
