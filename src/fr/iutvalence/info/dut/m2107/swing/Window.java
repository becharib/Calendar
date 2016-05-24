package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{
	
	public static void main(String[] args) {
		
		Window window = new Window();		
	    window.setTitle("Calendar");
	    window.setSize(1000, 800);
	    window.setLocationRelativeTo(null);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    window.setVisible(true);
	    ImageIcon img = new ImageIcon("img/calendar-icon.png");
		window.setIconImage(img.getImage());
		window.setResizable(false);
		window.getContentPane().setBackground(Color.ORANGE);
	}
	
}
