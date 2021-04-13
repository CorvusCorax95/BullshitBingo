package Game;
import Ui.Ui;

import javax.swing.*;
import java.awt.*;

public class Game {

    static public boolean end_game(JLabel[][] board){

        boolean win = false;
        // i = Zeile
        int i = 0;
        // j = Spalte
        int j = 0;

        // x o o o
        // x o o o
        // x o o o
        // x o o o

        for (j = 0; j < 4; j++)
        {
                if ((board[0][j].getBackground() == Color.GREEN)
                    & (board[1][j].getBackground() == Color.GREEN)
                    & (board[2][j].getBackground() == Color.GREEN)
                    & (board[3][j].getBackground() == Color.GREEN))
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
        for (i = 0; i < 4; i++)
        {
                if ((board[i][0].getBackground() == Color.GREEN)
                    & (board[i][1].getBackground() == Color.GREEN)
                    & (board[i][2].getBackground() == Color.GREEN)
                    & (board[i][3].getBackground() == Color.GREEN))
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

        // o o o x
        // o o x o
        // o x o o
        // x o o o

        if ((board[0][0].getBackground() == Color.GREEN) &
            (board[1][1].getBackground() == Color.GREEN) &
            (board[2][2].getBackground() == Color.GREEN) &
            (board[3][3].getBackground() == Color.GREEN)) {

         win = true;

        }

         if ((board[3][0].getBackground() == Color.GREEN) &
            (board[2][1].getBackground() == Color.GREEN) &
            (board[1][2].getBackground() == Color.GREEN) &
            (board[0][3].getBackground() == Color.GREEN)) {

             win = true;

         }

    System.out.println(win);
    return win;
    }

}
