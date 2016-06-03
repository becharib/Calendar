package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.iutvalence.info.dut.m2107.Calendrier;

public class CalendarFrame extends JFrame implements ActionListener {
	
	Calendrier calendrier = MainFrame.getCalendrier();
	
	private Button precedent;
	private Button quitter;
	private JLabel label;
	
	private HashMap<String, Button> mapButtons;
	
	/**
	 * CalendarFrame constructor
	 * Frame which display months for a selected year
	 * @param annee
	 */
	
	public CalendarFrame(String annee) {
		this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
		this.setTitle("Calendar");
		this.setSize(new Dimension(1000,800));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		
		/**
		 * Creation of a Map of Buttons
		 */
		
		this.mapButtons = new HashMap<>();
		
		label = new JLabel(annee+" Calendar");
		this.add(label);
		
		Font f = new Font("Arial", Font.ITALIC + Font.BOLD, 50); 
		
		label.setBounds(325,10,500,80);
		label.setForeground(new Color(215,90,90));
		label.setFont(f);
		
		ImageIcon precedentIcon = new ImageIcon(new ImageIcon("img/back.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		precedent = new Button(precedentIcon);
		ImageIcon quitterIcon = new ImageIcon(new ImageIcon("img/quitter.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		quitter = new Button(quitterIcon);
		quitter.setBounds(950,730,30,30);
		precedent.setBounds(20,730,30,30);
		quitter.setBorderPainted(false);
        quitter.setContentAreaFilled(false);
        precedent.setBorderPainted(false);
        precedent.setContentAreaFilled(false);

		this.add(precedent);
		this.add(quitter);

		this.mapButtons.put("january", new Button("January"));
		this.mapButtons.put("february", new Button("February"));
		this.mapButtons.put("march", new Button("March"));
		this.mapButtons.put("april", new Button("April"));
		this.mapButtons.put("may", new Button("May"));
		this.mapButtons.put("june", new Button("June"));
		this.mapButtons.put("july", new Button("July"));
		this.mapButtons.put("august", new Button("August"));
		this.mapButtons.put("september", new Button("September"));
		this.mapButtons.put("october", new Button("October"));
		this.mapButtons.put("november", new Button("November"));
		this.mapButtons.put("december", new Button("December"));
		
		this.mapButtons.get("january").setBounds(100,100,200,200);
		this.mapButtons.get("february").setBounds(300,100,200,200);
		this.mapButtons.get("march").setBounds(500,100,200,200);
		this.mapButtons.get("april").setBounds(700,100,200,200);
		this.mapButtons.get("may").setBounds(100,300,200,200);
		this.mapButtons.get("june").setBounds(300,300,200,200);
		this.mapButtons.get("july").setBounds(500,300,200,200);
		this.mapButtons.get("august").setBounds(700,300,200,200);
		this.mapButtons.get("september").setBounds(100,500,200,200);
		this.mapButtons.get("october").setBounds(300,500,200,200);
		this.mapButtons.get("november").setBounds(500,500,200,200);
		this.mapButtons.get("december").setBounds(700,500,200,200);
		
		for(HashMap.Entry<String, Button> entry : this.mapButtons.entrySet())
		{
			entry.getValue().addActionListener(this);
		}
		
		for(HashMap.Entry<String, Button> entry : this.mapButtons.entrySet())
		{
			this.add(entry.getValue());
		}
		
		this.quitter.addActionListener(this);
		this.precedent.addActionListener(this);
		
		this.add(precedent);
		this.add(quitter);
		
		this.quitter.addActionListener(this);
		this.precedent.addActionListener(this);
	    
	}
	
	/**
	 * Method which allows to factorize the code for all year of the calendar
	 * @param e1
	 * @param x
	 */
	
	public void generateActionwithCalendar(ActionEvent e1, Object x){
		

		int annee = Integer.parseInt((String)x);
		
			if(e1.getSource() == this.mapButtons.get("january")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[0].getNbDay(),calendrier.getYear(annee).getMonthTab()[0].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("february")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[1].getNbDay(),calendrier.getYear(annee).getMonthTab()[1].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("march")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[2].getNbDay(),calendrier.getYear(annee).getMonthTab()[2].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("april")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[3].getNbDay(),calendrier.getYear(annee).getMonthTab()[3].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("may")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[4].getNbDay(),calendrier.getYear(annee).getMonthTab()[4].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("june")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[5].getNbDay(),calendrier.getYear(annee).getMonthTab()[5].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("july")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[6].getNbDay(),calendrier.getYear(annee).getMonthTab()[6].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("august")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[7].getNbDay(),calendrier.getYear(annee).getMonthTab()[7].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("september")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[8].getNbDay(),calendrier.getYear(annee).getMonthTab()[8].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("october")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[9].getNbDay(),calendrier.getYear(annee).getMonthTab()[9].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("november")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[10].getNbDay(),calendrier.getYear(annee).getMonthTab()[10].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
			if(e1.getSource() == this.mapButtons.get("december")) {
				new MonthFrame(calendrier.getYear(annee).getMonthTab()[11].getNbDay(),calendrier.getYear(annee).getMonthTab()[11].getName(),Integer.toString(calendrier.getYear(annee).getNum()));
			}
		}

	/**
	 * Interactions with Buttons
	 */
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		
		Object e0 = e1.getSource();
		if (e0 == this.quitter) {
			System.exit(0);
		}
		
		else if (e0 == this.precedent) {
			this.dispose();
		}
		
		
		else		
			generateActionwithCalendar(e1, MenuComboBox.choixannee.getSelectedItem());
		}

	}