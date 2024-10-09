//using https://www.youtube.com/watch?v=Kmgo00avvEw&t=239s as tutorial 

import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.lang.Thread;

import java.awt.Color;
import java.awt.Dimension;
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
     

        
        frame.setLayout(null);
        frame.setTitle("15-PUZZLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(background);
        frame.setMinimumSize(new Dimension(900,900));
        
        
        logo.setImage(logo.getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH));
        

        label.setBounds(150,150,600,600);
        label.setForeground(Color.white);
        label.setBorder(border);
        //label.setOpaque(true);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        label.setIconTextGap(10);
        label.setText("15-Puzzle");
        label.setIcon(logo);
        label.setHorizontalTextPosition(JLabel.CENTER); //of image icon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);


        
        

        frame.add(label);
        frame.setVisible(true);
        frame.pack();



        /*try {
            File temp = new File("temp.txt");
            temp.createNewFile();
            FileWriter typer = new FileWriter("temp.txt");
            while(true) {
                try {
                    Thread.sleep(200); 
                } catch (Exception e) {
                    System.out.println("hi");
                }
                typer.write(frame.getSize() + "\n"); }

        } catch (IOException e) {
            System.out.println("asdfasd");
        } */

        
    }
}
