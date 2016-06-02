package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MonthFrame extends JFrame {
	
	private int joursint;
	private String jourstring;
	
	public MonthFrame(String jours){
		
		this.jourstring=jours;
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension(1000,800));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		joursint = Integer.parseInt(jourstring);
		
		if (jourstring == "28"){
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
		
		if (jourstring == "29"){
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
		
	    if (jourstring == "30"){
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
	    
	    if (jourstring == "31"){
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
	    
	    this.setVisible(true);
	}
}
