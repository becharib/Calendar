package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MonthFrame extends JFrame {

	public MonthFrame(String jours){
		
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension(1000,800));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		
	    for(int i=1; i<=Integer(jours); i++ ){
	    	
	    }
	    
	}
	
}
