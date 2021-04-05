package Game;
import Ui.Ui;

import javax.swing.*;

public class Game {

    static public boolean end_game(JLabel[][] board){

        boolean win = false;
        // i = Zeile
        int i;
        // j = Spalte
        int j;
        /*
        // x o o o
        // x o o o
        // x o o o
        // x o o o

        for (int j = 0; j < 5; j++)
        {
                if (board[0][j] == green)
                    & (board[1][j] == green)
                    & (board[2][j] == green)
                    & (board[3][j] == green)
                {
                    win = true;
                }
                else
                    {
                        win = false;
                    }
        }

        // x x x x
        // o o o o
        // o o o o
        // o o o o
        for (int i = 0; i < 5; i++)
        {
                if (board[i][0] == green)
                    & (board[i][1] == green)
                    & (board[i][2] == green)
                    & (board[i][3] == green)
                {
                    win = true;
                }
                else
            {
                win = false;
            }
        }
        // x o o o
        // o x o o
        // o o x o
        // o o o x
*/
        return win;
    }
}
