package bg.synd.tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private JLabel statusLabel;

    private char whoseTurn;
    private boolean gameOver;
    private Cell[][] cells;

    public GameFrame() {
        this.whoseTurn = 'X';
        this.cells = new Cell[3][3];
        this.renderComponents();
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setTitle("Tic-tac-toe");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    private void renderComponents() {
        this.statusLabel = new JLabel("X's turn");
        JPanel cellsPanel = this.renderCellsPanel();
        super.add(cellsPanel, BorderLayout.CENTER);
        super.add(this.statusLabel, BorderLayout.SOUTH);
    }

    private JPanel renderCellsPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                panel.add(this.cells[i][j] = new Cell());
            }
        }
        return panel;
    }

    private boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.cells[i][j].getToken() == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasAwinner(char token) {
        // check rows
        for (int i = 0; i < 3; i++) {
            if (this.cells[i][0].getToken() == token && this.cells[i][1].getToken() == token
                    && this.cells[i][2].getToken() == token) {
                return true;
            }
        }
        // check columns
        for (int i = 0; i < 3; i++) {
            if (this.cells[0][i].getToken() == token && this.cells[1][i].getToken() == token
                    && this.cells[2][i].getToken() == token) {
                return true;
            }
        }
        // check diagonal
        if (this.cells[0][0].getToken() == token && this.cells[1][1].getToken() == token
                && this.cells[2][2].getToken() == token) {
            return true;
        }
        if (this.cells[0][2].getToken() == token && this.cells[1][1].getToken() == token
                && this.cells[2][0].getToken() == token) {
            return true;
        }
        return false;
    }

    private class Cell extends JComponent {
        private char token = ' ';

        public Cell() {
            super.setBorder(new LineBorder(Color.BLACK, 1));
            super.addMouseListener(new CellMouseAdapter());
        }

        public char getToken() {
            return this.token;
        }

        public void setToken(char token) {
            this.token = token;
            super.repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (this.token == 'X') {
                g.setColor(Color.RED);
                g.drawLine(10, 10, this.getWidth() - 10, this.getHeight() - 10);
                g.drawLine(this.getWidth() - 10, 10, 10, this.getHeight() - 10);
            }

            else if (this.token == 'O') {
                g.setColor(Color.BLUE);
                g.drawOval(10, 10, this.getWidth() - 20, this.getHeight() - 20);
            }
        }

        private class CellMouseAdapter extends MouseAdapter {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (GameFrame.this.gameOver) {
                    return;
                }
                if (Cell.this.token == ' ') {
                    Cell.this.setToken(GameFrame.this.whoseTurn);
                }
                if (GameFrame.this.hasAwinner(Cell.this.token)) {
                    GameFrame.this.statusLabel.setText(GameFrame.this.whoseTurn + " has won. Game over!");
                    GameFrame.this.gameOver = true;
                } else if (GameFrame.this.isFull()) {
                    GameFrame.this.statusLabel.setText("Tie game!");
                    GameFrame.this.gameOver = true;
                } else {
                    GameFrame.this.whoseTurn = (GameFrame.this.whoseTurn == 'X') ? 'O' : 'X';
                    GameFrame.this.statusLabel.setText(GameFrame.this.whoseTurn + "'s turn.");
                }
            }
        }
    }

}
