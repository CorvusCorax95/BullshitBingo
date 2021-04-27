package Game;
import Ui.Ui;

import javax.swing.*;
import java.awt.*;

public class Game {

    static boolean endGame = false;

    static public boolean isEndGame() {
        return endGame;
    }

    static public void setEndGame(boolean endGame) {
        endGame = endGame;
    }

    static public boolean end_round(JLabel[][] board){

        boolean winRound = false;
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
                    winRound = true;
                }
                else
                    {
                        winRound = false;
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
                    winRound = true;
                }
                else
            {
                winRound = false;
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

         winRound = true;
        }
        else
        {
            winRound = false;
        }

         if ((board[3][0].getBackground() == Color.GREEN) &
            (board[2][1].getBackground() == Color.GREEN) &
            (board[1][2].getBackground() == Color.GREEN) &
            (board[0][3].getBackground() == Color.GREEN)) {

             winRound = true;
         }
         else
         {
             winRound = false;
         }

    return winRound;
    }

}
