package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
	private Button toHomePagebutton;
	
	public Window(MainFrame mainframe, Button button) {
		this.theFrame=mainframe;
		this.setBackground(Color.GRAY);
		this.setSize(1024, 768);
		
		this.toHomePagebutton = new Button(new ImageIcon("img/button.png"), new Dimension(1024,68), "  GO TO HOMEPAGE");
		this.toHomePagebutton.setFont(new Font("LAO UI", 1, 32));
		this.toHomePagebutton.setBackground(new Color(231, 76, 60));
	  	this.toHomePagebutton.addActionListener((ActionListener) button);
	}
	
	public static void main(String[] args) {
		/* MainFrame.MainFrame(); */
		new MainFrame("Calendar", new Dimension(1000,800), "img/fond.png");
	}
}
