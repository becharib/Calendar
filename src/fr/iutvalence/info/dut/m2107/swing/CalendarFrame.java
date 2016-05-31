package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendarFrame extends JFrame {
	
	Button january;
	Button february;
	Button march;
	Button april;
	Button may;
	Button june;
	Button july;
	Button august;
	Button september;
	Button october;
	Button november;
	Button december;
	
	public CalendarFrame() {
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension(1000,800));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		
		january = new Button("January");
		february = new Button("February");
		march = new Button("March");
		april = new Button("April");
		may = new Button("May");
		june = new Button("June");
		july = new Button("July");
		august = new Button("August");
		september = new Button("September");
		october = new Button("October");
		november = new Button("November");
		december = new Button("December");
		
		this.add(january);
		this.add(february);
		this.add(march);
		this.add(april);
		this.add(may);
		this.add(june);
		this.add(july);
		this.add(august);
		this.add(september);
		this.add(october);
		this.add(november);
		this.add(december);
		
		january.setBounds(100,100,200,200);
		february.setBounds(300,100,200,200);
		march.setBounds(500,100,200,200);
		april.setBounds(700,100,200,200);
		may.setBounds(100,300,200,200);
		june.setBounds(300,300,200,200);
		july.setBounds(500,300,200,200);
		august.setBounds(700,300,200,200);
		september.setBounds(100,500,200,200);
		october.setBounds(300,500,200,200);
		november.setBounds(500,500,200,200);
		december.setBounds(700,500,200,200);
	    
	}
}
