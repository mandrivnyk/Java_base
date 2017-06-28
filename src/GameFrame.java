import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GameFrame {

    JPanel[][] arrayL = new JPanel[10][10];
    JPanel[][] arrayR = new JPanel[10][10];

    public GameFrame() {

        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new GridLayout(1, 2));

        JPanel left = new JPanel(new GridLayout(10, 10, 1, 1));
        left.setBorder(BorderFactory.createTitledBorder(new EmptyBorder(0, 0,
                0, 0), "Enemy"));
        ((TitledBorder) left.getBorder()).setTitleFont(new Font("Arial", Font.BOLD, 20));
        addCells(left, arrayL, Color.RED);

        JPanel right = new JPanel(new GridLayout(10, 10, 1, 1));
        right.setBorder(BorderFactory.createTitledBorder(new EmptyBorder(0, 0,
                0, 0), "You"));
        ((TitledBorder) right.getBorder()).setTitleFont(new Font("Arial", Font.BOLD, 20));
        addCells(right, arrayR, Color.BLUE);

        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        leftPanel.setLayout(new GridLayout(1, 1));
        leftPanel.add(left);

        JPanel rightPanel = new JPanel();
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        rightPanel.setLayout(new GridLayout(1, 1));
        rightPanel.add(right);

        frame.getContentPane().add(leftPanel);
        frame.getContentPane().add(rightPanel);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void addCells(JPanel panel, JPanel[][] array, Color color) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                JPanel p = new JPanel();
                p.setBackground(color);
                p.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                array[j][i] = p;

                panel.add(p);

            }
        }

    }

    public static void main(String[] args) {

        new GameFrame();

    }

}