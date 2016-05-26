package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
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
	
	private MainFrame theFrame;
	private Button toCalendarbutton;
	
	public Window(MainFrame mainframe, Button button) {
		this.theFrame=mainframe;
		this.toCalendarbutton=button;	
	}
	
	public static void main(String[] args) {
		/*MainFrame.BasicFrame();*/
		/*MainFrame fen = new MainFrame("Calendar", new Dimension(1000,800), "img/fond.png");*/
		/*ImageIcon img = new ImageIcon(new ImageIcon("img/black.png").getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT));
	    Button bouton = new Button(img, new Dimension(1000,68), "  GO TO CALENDAR");
	    
	    JPanel p = new JPanel();
	    p.add(bouton);
	    
	    MainFrame main = new MainFrame("Calendar", new Dimension(1000,800), "img/fond.png");
		main.add(p);*/
		
		/*ImageIcon img = new ImageIcon(new ImageIcon("img/black.png").getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT));
	    JButton bouton = new Button(img, new Dimension(1000,100), "  GO TO CALENDAR");
		JPanel panel = new JPanel();
		panel.add(bouton);
		
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(1000,800));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1000,800));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.add(panel);*/
		
		JFrame frame = new JFrame();
		JLabel label = new JLabel(new ImageIcon("img/fond.png"));
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(new Dimension(1000,800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon(new ImageIcon("img/black.png").getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT));
		JButton bouton = new Button(img, new Dimension(1000,68), "  GO TO CALENDAR");
		label.add(bouton);
		
		/*new Window(new MainFrame("Calendar", new Dimension(1000,800), "img/fond.png"),new Button(img, new Dimension(1000,68), "  GO TO CALENDAR"));*/
		
	}
}
