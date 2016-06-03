package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.iutvalence.info.dut.m2107.Calendrier;

public class MenuComboBox extends JFrame implements ActionListener {
	
	Calendrier calendrier = MainFrame.getCalendrier();
	
	private Button valider;
	private MainFrame frame;
	static JComboBox<String> choixannee;
	private JLabel label;
	private Button back;
	private Button continuer;
	
	/**
	 * Combobox constructor
	 */
	
	public MenuComboBox() {
	this.setTitle("Year Choices ");
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setSize(new Dimension(300,220));
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
    this.setLayout(null);
    
    /**
     * Creation of a label on the top of JcomboBox 
     */
    
    label = new JLabel("Choose a year ");
    label.setBounds(107,50,128,50);
    
    this.choixannee = new JComboBox<String>();
    this.choixannee.addItem("2016");
    this.choixannee.addItem("2017");
    this.choixannee.addItem("2018");
    this.choixannee.addItem("2019");
    this.choixannee.addItem("2020");
    this.choixannee.addItem("2021");
    this.choixannee.addItem("2022");
    this.choixannee.addItem("2023");
    this.choixannee.setBounds(113,90,70,20);
    
    /**
     * Buttons to continue and exit
     */
    
    ImageIcon precedentIcon = new ImageIcon(new ImageIcon("img/back.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
	back = new Button(precedentIcon);
	ImageIcon continuerIcon = new ImageIcon(new ImageIcon("img/valider.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
	continuer = new Button(continuerIcon);
	continuer.setBounds(260,160,30,30);
	back.setBounds(7,160,30,30);
	continuer.setBorderPainted(false);
    continuer.setContentAreaFilled(false);
    back.setBorderPainted(false);
    back.setContentAreaFilled(false);
    
    /**
     * Action Listener for Buttons back exit and the choice of year
     */
    this.back.addActionListener(this);
	this.continuer.addActionListener(this);
	this.choixannee.addActionListener(this);
        
    this.add(continuer);
    this.add(back);
    this.add(label);
    this.add(choixannee);
    this.setVisible(true);
    
	}

	
	@Override
	/**
	 * Interaction with Buttons
	 */
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.back) {
			this.dispose();
		}
		
		if ( choixannee.getSelectedItem() == "2016" && e.getSource() == this.continuer) {
			String annee = new String("2016");
			new CalendarFrame(annee);
			this.dispose();
		}
			
		if ( choixannee.getSelectedItem() == "2017" && e.getSource() == this.continuer) {
			String annee = new String("2017");
			new CalendarFrame(annee);
			this.dispose();
		}
		
		if ( choixannee.getSelectedItem() == "2018" && e.getSource() == this.continuer) {
			String annee = new String("2018");
			new CalendarFrame(annee);
			this.dispose();
		}
		
		if ( choixannee.getSelectedItem() == "2019" && e.getSource() == this.continuer) {
			String annee = new String("2019");
			new CalendarFrame(annee);
			this.dispose();
		}
		
		if ( choixannee.getSelectedItem() == "2020" && e.getSource() == this.continuer) {
			String annee = new String("2020");
			new CalendarFrame(annee);
			this.dispose();
		}
		
		if ( choixannee.getSelectedItem() == "2021" && e.getSource() == this.continuer) {
			String annee = new String("2021");
			new CalendarFrame(annee);
			this.dispose();
		}
		
		if ( choixannee.getSelectedItem() == "2022" && e.getSource() == this.continuer) {
			String annee = new String("2022");
			new CalendarFrame(annee);
			this.dispose();
		}
		
		if ( choixannee.getSelectedItem() == "2023" && e.getSource() == this.continuer) {
			String annee = new String("2023");
			new CalendarFrame(annee);
			this.dispose();
		}

	}
}
