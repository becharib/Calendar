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
		this.setVisible(true);
		this.setLayout(new GridLayout(3, 4));
		JButton bouton = new JButton("Bilal");
		bouton.setBackground(new Color(254,231,240));
		this.getContentPane().add(bouton);
	    this.getContentPane().add(new JButton("2"));
	    this.getContentPane().add(new JButton("3"));
	    this.getContentPane().add(new JButton("4"));
	    this.getContentPane().add(new JButton("5"));
	    this.getContentPane().add(new JButton("1"));
	    this.getContentPane().add(new JButton("2"));
	    this.getContentPane().add(new JButton("3"));
	    this.getContentPane().add(new JButton("4"));
	    this.getContentPane().add(new JButton("5"));
	    this.getContentPane().add(new JButton("5"));
	    this.getContentPane().add(new JButton("5"));
	    
	}
}
