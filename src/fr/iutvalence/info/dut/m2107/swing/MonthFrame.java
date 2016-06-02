package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MonthFrame extends JFrame implements ActionListener {
	
	private int joursint;
	private String jourstring;
	private JLabel label;
	Button back;
	Button exit;
	
	public MonthFrame(int joursint, String mois, String annee){
		
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension(1000,800));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		if (joursint == 28 ){
	    	ArrayList<Button> liste = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste.add(new Button(i+1));
	    		this.add(liste.get(i));
	    	}
	    	
	    	liste.get(0).setBounds(1,100,142,114);
	    	liste.get(1).setBounds(143,100,142,114);
	    	liste.get(2).setBounds(285,100,142,114);
	    	liste.get(3).setBounds(427,100,142,114);
	    	liste.get(4).setBounds(569,100,142,114);
	    	liste.get(5).setBounds(711,100,142,114);
	    	liste.get(6).setBounds(853,100,142,114);
	    	liste.get(7).setBounds(1,214,142,114);
	    	liste.get(8).setBounds(143,214,142,114);
	    	liste.get(9).setBounds(285,214,142,114);
	    	liste.get(10).setBounds(427,214,142,114);
	    	liste.get(11).setBounds(569,214,142,114);
	    	liste.get(12).setBounds(711,214,142,114);
	    	liste.get(13).setBounds(853,214,142,114);
	    	liste.get(14).setBounds(1,328,142,114);
	    	liste.get(15).setBounds(143,328,142,114);
	    	liste.get(16).setBounds(285,328,142,114);
	    	liste.get(17).setBounds(427,328,142,114);
	    	liste.get(18).setBounds(569,328,142,114);
	    	liste.get(19).setBounds(711,328,142,114);
	    	liste.get(20).setBounds(853,328,142,114);
	    	liste.get(21).setBounds(1,442,142,114);
	    	liste.get(22).setBounds(143,442,142,114);
	    	liste.get(23).setBounds(285,442,142,114);
	    	liste.get(24).setBounds(427,442,142,114);
	    	liste.get(25).setBounds(569,442,142,114);
	    	liste.get(26).setBounds(711,442,142,114);
	    	liste.get(27).setBounds(853,442,142,114);
	    	}
		
		if (joursint == 29){
	    	ArrayList<Button> liste = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste.add(new Button(i+1));
	    		this.add(liste.get(i));
	    	}
	    	
	    	liste.get(0).setBounds(1,100,142,114);
	    	liste.get(1).setBounds(143,100,142,114);
	    	liste.get(2).setBounds(285,100,142,114);
	    	liste.get(3).setBounds(427,100,142,114);
	    	liste.get(4).setBounds(569,100,142,114);
	    	liste.get(5).setBounds(711,100,142,114);
	    	liste.get(6).setBounds(853,100,142,114);
	    	liste.get(7).setBounds(1,214,142,114);
	    	liste.get(8).setBounds(143,214,142,114);
	    	liste.get(9).setBounds(285,214,142,114);
	    	liste.get(10).setBounds(427,214,142,114);
	    	liste.get(11).setBounds(569,214,142,114);
	    	liste.get(12).setBounds(711,214,142,114);
	    	liste.get(13).setBounds(853,214,142,114);
	    	liste.get(14).setBounds(1,328,142,114);
	    	liste.get(15).setBounds(143,328,142,114);
	    	liste.get(16).setBounds(285,328,142,114);
	    	liste.get(17).setBounds(427,328,142,114);
	    	liste.get(18).setBounds(569,328,142,114);
	    	liste.get(19).setBounds(711,328,142,114);
	    	liste.get(20).setBounds(853,328,142,114);
	    	liste.get(21).setBounds(1,442,142,114);
	    	liste.get(22).setBounds(143,442,142,114);
	    	liste.get(23).setBounds(285,442,142,114);
	    	liste.get(24).setBounds(427,442,142,114);
	    	liste.get(25).setBounds(569,442,142,114);
	    	liste.get(26).setBounds(711,442,142,114);
	    	liste.get(27).setBounds(853,442,142,114);
	    	liste.get(28).setBounds(1,556,142,114);
	    	}
		
	    if (joursint == 30){
	    	ArrayList<Button> liste = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste.add(new Button(i+1));
	    		this.add(liste.get(i));
	    	}
	    	
	    	liste.get(0).setBounds(1,100,142,114);
	    	liste.get(1).setBounds(143,100,142,114);
	    	liste.get(2).setBounds(285,100,142,114);
	    	liste.get(3).setBounds(427,100,142,114);
	    	liste.get(4).setBounds(569,100,142,114);
	    	liste.get(5).setBounds(711,100,142,114);
	    	liste.get(6).setBounds(853,100,142,114);
	    	liste.get(7).setBounds(1,214,142,114);
	    	liste.get(8).setBounds(143,214,142,114);
	    	liste.get(9).setBounds(285,214,142,114);
	    	liste.get(10).setBounds(427,214,142,114);
	    	liste.get(11).setBounds(569,214,142,114);
	    	liste.get(12).setBounds(711,214,142,114);
	    	liste.get(13).setBounds(853,214,142,114);
	    	liste.get(14).setBounds(1,328,142,114);
	    	liste.get(15).setBounds(143,328,142,114);
	    	liste.get(16).setBounds(285,328,142,114);
	    	liste.get(17).setBounds(427,328,142,114);
	    	liste.get(18).setBounds(569,328,142,114);
	    	liste.get(19).setBounds(711,328,142,114);
	    	liste.get(20).setBounds(853,328,142,114);
	    	liste.get(21).setBounds(1,442,142,114);
	    	liste.get(22).setBounds(143,442,142,114);
	    	liste.get(23).setBounds(285,442,142,114);
	    	liste.get(24).setBounds(427,442,142,114);
	    	liste.get(25).setBounds(569,442,142,114);
	    	liste.get(26).setBounds(711,442,142,114);
	    	liste.get(27).setBounds(853,442,142,114);
	    	liste.get(28).setBounds(1,556,142,114);
	    	liste.get(29).setBounds(143,556,142,114);
	    	}
	    
	    if (joursint == 31){
	    	ArrayList<Button> liste = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste.add(new Button(i+1));
	    		this.add(liste.get(i));
	    	}
	    	
	    	liste.get(0).setBounds(1,100,142,114);
	    	liste.get(1).setBounds(143,100,142,114);
	    	liste.get(2).setBounds(285,100,142,114);
	    	liste.get(3).setBounds(427,100,142,114);
	    	liste.get(4).setBounds(569,100,142,114);
	    	liste.get(5).setBounds(711,100,142,114);
	    	liste.get(6).setBounds(853,100,142,114);
	    	liste.get(7).setBounds(1,214,142,114);
	    	liste.get(8).setBounds(143,214,142,114);
	    	liste.get(9).setBounds(285,214,142,114);
	    	liste.get(10).setBounds(427,214,142,114);
	    	liste.get(11).setBounds(569,214,142,114);
	    	liste.get(12).setBounds(711,214,142,114);
	    	liste.get(13).setBounds(853,214,142,114);
	    	liste.get(14).setBounds(1,328,142,114);
	    	liste.get(15).setBounds(143,328,142,114);
	    	liste.get(16).setBounds(285,328,142,114);
	    	liste.get(17).setBounds(427,328,142,114);
	    	liste.get(18).setBounds(569,328,142,114);
	    	liste.get(19).setBounds(711,328,142,114);
	    	liste.get(20).setBounds(853,328,142,114);
	    	liste.get(21).setBounds(1,442,142,114);
	    	liste.get(22).setBounds(143,442,142,114);
	    	liste.get(23).setBounds(285,442,142,114);
	    	liste.get(24).setBounds(427,442,142,114);
	    	liste.get(25).setBounds(569,442,142,114);
	    	liste.get(26).setBounds(711,442,142,114);
	    	liste.get(27).setBounds(853,442,142,114);
	    	liste.get(28).setBounds(1,556,142,114);
	    	liste.get(29).setBounds(143,556,142,114);
	    	liste.get(30).setBounds(285,556,142,114);
	    	}
	    
	    label = new JLabel(mois+ " "+annee);
	    Font f = new Font("Arial", Font.ITALIC + Font.BOLD, 50); 
	    label.setBounds(5,5,500,80);
		label.setForeground(new Color(215,90,90));
		label.setFont(f);
		this.add(label);
		
		ImageIcon precedentIcon = new ImageIcon(new ImageIcon("img/back.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		back = new Button(precedentIcon);
		ImageIcon quitterIcon = new ImageIcon(new ImageIcon("img/quitter.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		exit = new Button(quitterIcon);
		exit.setBounds(950,730,30,30);
		back.setBounds(20,730,30,30);
		exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
		
		this.add(back);
		this.add(exit);
		
		this.exit.addActionListener(this);
		this.back.addActionListener(this);
	    
	    this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.back) {
			this.dispose();
		}
		
		if (e.getSource() == this.exit) {
			System.exit(0);
		}
		
	}
}
