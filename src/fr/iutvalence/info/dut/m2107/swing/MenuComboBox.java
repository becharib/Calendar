package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuComboBox extends JFrame implements ActionListener {
	
	private Button valider;
	private MainFrame frame;
	private JComboBox<String> choixannee;
	private JLabel label;
	private Button back;
	private Button continuer;
	
	public MenuComboBox() {
	this.setTitle("Choix d'une année");
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setSize(new Dimension(300,220));
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
    this.setLayout(null);
    
    label = new JLabel("Choisissez une année ");
    label.setBounds(85,50,128,50);
    
    choixannee = new JComboBox<String>();
    choixannee.addItem("2016");
    choixannee.addItem("2017");
    choixannee.addItem("2018");
    choixannee.addItem("2019");
    choixannee.addItem("2020");
    choixannee.addItem("2021");
    choixannee.addItem("2022");
    choixannee.addItem("2023");
    choixannee.setBounds(113,90,70,20);
    
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
    
    this.back.addActionListener(this);
	this.continuer.addActionListener(this);
        
    this.add(continuer);
    this.add(back);
    this.add(label);
    this.add(choixannee);
    this.setVisible(true);
    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.back) {
			this.dispose();
		}
		
		if (e.getSource() == this.continuer) {
			this.dispose();
			new CalendarFrame();
		}
			
			
		
	}
}
