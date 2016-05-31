package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CalendarFrame extends JFrame {
	
	public CalendarFrame() {
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension( 1000, 800) );
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
