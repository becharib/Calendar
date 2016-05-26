package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javax.swing.JLabel;

public class Window extends JFrame{
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Calendar");		
	    window.setTitle("Calendar");
		window.setSize(1000, 800);
	    window.setLocationRelativeTo(null);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    window.setVisible(true);
	    ImageIcon img = new ImageIcon("img/calendar-icon.png");
		window.setIconImage(img.getImage());
		window.setResizable(false);
		try{
		window.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./img/fond.png")))));
			}
		catch(IOException e)
		{
			System.out.println("Image doesn't exist");
		}
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		window.setSize(1000, 800);
		
		JButton quitter = new JButton("Quitter");
		
		}
	

}
