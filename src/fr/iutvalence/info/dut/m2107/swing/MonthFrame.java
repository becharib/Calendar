package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.iutvalence.info.dut.m2107.Calendrier;

public class MonthFrame extends JFrame implements ActionListener {
	
	Calendrier calendrier = MainFrame.getCalendrier();
	
	private int joursint;
	private String jourstring;
	private JLabel label;
	ArrayList<Button> liste31;
	ArrayList<Button> liste30;
	ArrayList<Button> liste29;
	ArrayList<Button> liste28;
	Button back;
	Button exit;
	
	/**
	 * MonthFrame constructor
	 * Frame which display days for a year and a month selected
	 * @param joursint
	 * @param mois
	 * @param annee
	 */
	
	public MonthFrame(int joursint, String mois, String annee){
		
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension(1000,800));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		if (joursint == 28 ){
	    	liste28 = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste28.add(new Button(i+1));
	    		this.add(liste28.get(i));
	    	}
	    	
	    	liste28.get(0).setBounds(1,100,142,114);
	    	liste28.get(1).setBounds(143,100,142,114);
	    	liste28.get(2).setBounds(285,100,142,114);
	    	liste28.get(3).setBounds(427,100,142,114);
	    	liste28.get(4).setBounds(569,100,142,114);
	    	liste28.get(5).setBounds(711,100,142,114);
	    	liste28.get(6).setBounds(853,100,142,114);
	    	liste28.get(7).setBounds(1,214,142,114);
	    	liste28.get(8).setBounds(143,214,142,114);
	    	liste28.get(9).setBounds(285,214,142,114);
	    	liste28.get(10).setBounds(427,214,142,114);
	    	liste28.get(11).setBounds(569,214,142,114);
	    	liste28.get(12).setBounds(711,214,142,114);
	    	liste28.get(13).setBounds(853,214,142,114);
	    	liste28.get(14).setBounds(1,328,142,114);
	    	liste28.get(15).setBounds(143,328,142,114);
	    	liste28.get(16).setBounds(285,328,142,114);
	    	liste28.get(17).setBounds(427,328,142,114);
	    	liste28.get(18).setBounds(569,328,142,114);
	    	liste28.get(19).setBounds(711,328,142,114);
	    	liste28.get(20).setBounds(853,328,142,114);
	    	liste28.get(21).setBounds(1,442,142,114);
	    	liste28.get(22).setBounds(143,442,142,114);
	    	liste28.get(23).setBounds(285,442,142,114);
	    	liste28.get(24).setBounds(427,442,142,114);
	    	liste28.get(25).setBounds(569,442,142,114);
	    	liste28.get(26).setBounds(711,442,142,114);
	    	liste28.get(27).setBounds(853,442,142,114);
	    	}
		
		if (joursint == 29){
	    	liste29 = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste29.add(new Button(i+1));
	    		this.add(liste29.get(i));
	    	}
	    	
	    	liste29.get(0).setBounds(1,100,142,114);
	    	liste29.get(1).setBounds(143,100,142,114);
	    	liste29.get(2).setBounds(285,100,142,114);
	    	liste29.get(3).setBounds(427,100,142,114);
	    	liste29.get(4).setBounds(569,100,142,114);
	    	liste29.get(5).setBounds(711,100,142,114);
	    	liste29.get(6).setBounds(853,100,142,114);
	    	liste29.get(7).setBounds(1,214,142,114);
	    	liste29.get(8).setBounds(143,214,142,114);
	    	liste29.get(9).setBounds(285,214,142,114);
	    	liste29.get(10).setBounds(427,214,142,114);
	    	liste29.get(11).setBounds(569,214,142,114);
	    	liste29.get(12).setBounds(711,214,142,114);
	    	liste29.get(13).setBounds(853,214,142,114);
	    	liste29.get(14).setBounds(1,328,142,114);
	    	liste29.get(15).setBounds(143,328,142,114);
	    	liste29.get(16).setBounds(285,328,142,114);
	    	liste29.get(17).setBounds(427,328,142,114);
	    	liste29.get(18).setBounds(569,328,142,114);
	    	liste29.get(19).setBounds(711,328,142,114);
	    	liste29.get(20).setBounds(853,328,142,114);
	    	liste29.get(21).setBounds(1,442,142,114);
	    	liste29.get(22).setBounds(143,442,142,114);
	    	liste29.get(23).setBounds(285,442,142,114);
	    	liste29.get(24).setBounds(427,442,142,114);
	    	liste29.get(25).setBounds(569,442,142,114);
	    	liste29.get(26).setBounds(711,442,142,114);
	    	liste29.get(27).setBounds(853,442,142,114);
	    	liste29.get(28).setBounds(1,556,142,114);
	    	}
		
	    if (joursint == 30){
	    	liste30 = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste30.add(new Button(i+1));
	    		this.add(liste30.get(i));
	    	}
	    	
	    	liste30.get(0).setBounds(1,100,142,114);
	    	liste30.get(1).setBounds(143,100,142,114);
	    	liste30.get(2).setBounds(285,100,142,114);
	    	liste30.get(3).setBounds(427,100,142,114);
	    	liste30.get(4).setBounds(569,100,142,114);
	    	liste30.get(5).setBounds(711,100,142,114);
	    	liste30.get(6).setBounds(853,100,142,114);
	    	liste30.get(7).setBounds(1,214,142,114);
	    	liste30.get(8).setBounds(143,214,142,114);
	    	liste30.get(9).setBounds(285,214,142,114);
	    	liste30.get(10).setBounds(427,214,142,114);
	    	liste30.get(11).setBounds(569,214,142,114);
	    	liste30.get(12).setBounds(711,214,142,114);
	    	liste30.get(13).setBounds(853,214,142,114);
	    	liste30.get(14).setBounds(1,328,142,114);
	    	liste30.get(15).setBounds(143,328,142,114);
	    	liste30.get(16).setBounds(285,328,142,114);
	    	liste30.get(17).setBounds(427,328,142,114);
	    	liste30.get(18).setBounds(569,328,142,114);
	    	liste30.get(19).setBounds(711,328,142,114);
	    	liste30.get(20).setBounds(853,328,142,114);
	    	liste30.get(21).setBounds(1,442,142,114);
	    	liste30.get(22).setBounds(143,442,142,114);
	    	liste30.get(23).setBounds(285,442,142,114);
	    	liste30.get(24).setBounds(427,442,142,114);
	    	liste30.get(25).setBounds(569,442,142,114);
	    	liste30.get(26).setBounds(711,442,142,114);
	    	liste30.get(27).setBounds(853,442,142,114);
	    	liste30.get(28).setBounds(1,556,142,114);
	    	liste30.get(29).setBounds(143,556,142,114);
	    	}
	    
	    if (joursint == 31){
	    	liste31 = new ArrayList<Button>();
	    	
	    	for(int i=0;i<=joursint;i++)
	    	{
	    		liste31.add(new Button(i+1));
	    		this.add(liste31.get(i));
	    	}
	    	
	    	liste31.get(0).setBounds(1,100,142,114);
	    	liste31.get(1).setBounds(143,100,142,114);
	    	liste31.get(2).setBounds(285,100,142,114);
	    	liste31.get(3).setBounds(427,100,142,114);
	    	liste31.get(4).setBounds(569,100,142,114);
	    	liste31.get(5).setBounds(711,100,142,114);
	    	liste31.get(6).setBounds(853,100,142,114);
	    	liste31.get(7).setBounds(1,214,142,114);
	    	liste31.get(8).setBounds(143,214,142,114);
	    	liste31.get(9).setBounds(285,214,142,114);
	    	liste31.get(10).setBounds(427,214,142,114);
	    	liste31.get(11).setBounds(569,214,142,114);
	    	liste31.get(12).setBounds(711,214,142,114);
	    	liste31.get(13).setBounds(853,214,142,114);
	    	liste31.get(14).setBounds(1,328,142,114);
	    	liste31.get(15).setBounds(143,328,142,114);
	    	liste31.get(16).setBounds(285,328,142,114);
	    	liste31.get(17).setBounds(427,328,142,114);
	    	liste31.get(18).setBounds(569,328,142,114);
	    	liste31.get(19).setBounds(711,328,142,114);
	    	liste31.get(20).setBounds(853,328,142,114);
	    	liste31.get(21).setBounds(1,442,142,114);
	    	liste31.get(22).setBounds(143,442,142,114);
	    	liste31.get(23).setBounds(285,442,142,114);
	    	liste31.get(24).setBounds(427,442,142,114);
	    	liste31.get(25).setBounds(569,442,142,114);
	    	liste31.get(26).setBounds(711,442,142,114);
	    	liste31.get(27).setBounds(853,442,142,114);
	    	liste31.get(28).setBounds(1,556,142,114);
	    	liste31.get(29).setBounds(143,556,142,114);
	    	liste31.get(30).setBounds(285,556,142,114);
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
		
		/*for(int i=2016;i<2024;i++){
			for(int j=1;j<=12;j++){
				for(int k=1;k<=calendrier.getYear(i).getMonthTab()[j].getNbDay(); k++){
					if(calendrier.getYear(i).getMonthTab()[j].getDay(k).isPublicHolidayBool()){
						if(calendrier.getYear(i).getMonthTab()[j].getNbDay() == 28){
							liste28.get(k-1).setBackground(Color.GRAY);
						}
						else if(calendrier.getYear(i).getMonthTab()[j].getNbDay() == 29){
							liste29.get(k-1).setBackground(Color.GRAY);
						}
						else if(calendrier.getYear(i).getMonthTab()[j].getNbDay() == 30){
							liste30.get(k-1).setBackground(Color.GRAY);
						}
						else if(calendrier.getYear(i).getMonthTab()[j].getNbDay() == 31){
							liste31.get(k-1).setBackground(Color.GRAY);
						}
						}
					}
				}
			}
			
			*********************** Afficher les jours fériés en gris(fonctionnel à moitié)
			*
			*/ 
	}
	
	/**
	 * Interactions with Buttons
	 */

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
