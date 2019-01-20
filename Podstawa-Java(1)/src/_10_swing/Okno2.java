package _10_swing;

import javax.swing.*;

public class Okno2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setTitle("Nasze Pierwsze Okno");

        JLabel label = new JLabel("Madison");
        frame.add(label);
        frame.setVisible(true);
    }
}
