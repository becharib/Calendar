package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendarFrame extends JFrame {
	
	public CalendarFrame() {
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension(1000,800));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new GridLayout(3, 4));
		this.getContentPane().add(new Button("January"));
		this.getContentPane().add(new Button("February"));
		this.getContentPane().add(new Button("March"));
		this.getContentPane().add(new Button("April"));
		this.getContentPane().add(new Button("May"));
		this.getContentPane().add(new Button("June"));
		this.getContentPane().add(new Button("July"));
		this.getContentPane().add(new Button("August"));
		this.getContentPane().add(new Button("September"));
		this.getContentPane().add(new Button("October"));
		this.getContentPane().add(new Button("November"));
		this.getContentPane().add(new Button("December"));
		
	    
	}
}
