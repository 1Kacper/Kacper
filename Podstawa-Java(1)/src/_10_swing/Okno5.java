package _10_swing;

import javax.swing.*;
import java.awt.*;

public class Okno5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setTitle("Nasze drugie okno");

        LayoutManager layout = new FlowLayout();
        frame.setLayout(layout);


        JLabel label = new JLabel("Madison");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setForeground(Color.BLUE);
        Color kolorTla = new Color(0x0BEBFF);
        label.setOpaque(true);
        label.setBackground(kolorTla);
        frame.add(label);



        JButton button = new JButton("OK");
        button.setFont(new Font("Ariel",Font.BOLD,40));
        frame.add(button);

        JButton button2 = new JButton("LOL");
        button.setFont(new Font("Ariel",Font.ITALIC,32));
        frame.add(button2);


        frame.setVisible(true);
    }
}
