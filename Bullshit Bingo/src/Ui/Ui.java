package Ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ui implements MouseListener {
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

    public void initBoard() {

        this.mainFrame.setVisible(false);
        this.mainFrame.getContentPane().removeAll();
        for (int i = 0; i < Constants.LINES; i++) {
            for (int j = 0; j < Constants.COLUMNS; j++) {
                board[i][j] = new JLabel();
                board[i][j].setName("board" + i + j);
                board[i][j].setBounds(j * 100 + 50, i * 100, 100, 100);
                board[i][j].setText("place holder");
                board[i][j].addMouseListener(this);
                mainFrame.getContentPane().add(board[i][j]);

            }
        }
        mainFrame.getContentPane().revalidate();
        mainFrame.getContentPane().repaint();
        mainFrame.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        e.getComponent().setBackground(Color.GREEN);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
