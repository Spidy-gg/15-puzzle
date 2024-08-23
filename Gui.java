//using https://www.youtube.com/watch?v=Kmgo00avvEw&t=239s as tutorial 

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.Border;
    
public class Gui {
    JFrame frame;
    JLabel label;
    ImageIcon logo;
    Color background;
    Border border;

    
    
    public Gui() {
        frame = new JFrame();
        logo = new ImageIcon("summer 2.JPG");
        label = new JLabel();
        background = new Color(0,0,0,240);
        border = BorderFactory.createLineBorder(Color.green,5);
     

        

        frame.setTitle("15-PUZZLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(background);
        //frame.setLayout(null);
        
        logo.setImage(logo.getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH));
        

        //label.setBounds(100,100,600,600);
        label.setForeground(Color.white);
        //label.setBackground(Color.green);
        label.setBorder(border);
        //label.setOpaque(true);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        label.setIconTextGap(10);
        label.setText("15-Puzzle");
        label.setIcon(logo);
        label.setHorizontalTextPosition(JLabel.CENTER); //of image icon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        
        
        frame.add(label);
        frame.setVisible(true);
        frame.pack();
    }
}
