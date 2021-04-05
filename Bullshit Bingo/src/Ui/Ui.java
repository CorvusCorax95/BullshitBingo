package Ui;

import javax.swing.*;

public class Ui {
    private JPanel rootPane;
    private final JFrame mainFrame;

    private JLabel[][] board = null;

    public Ui() {
        mainFrame = new JFrame();
        mainFrame.setTitle("Bullshit Bingo!");

        mainFrame.setSize(Constants.MAIN_WIDTH, Constants.MAIN_HEIGHT);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new JLabel[Constants.COLUMNS][Constants.LINES];

    }

}
