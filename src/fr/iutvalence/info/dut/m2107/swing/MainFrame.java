package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {
    
	private JButton bouton;
    private JButton quitterButton;
     
    public MainFrame() {
        this.setTitle("CalendarApplication");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000,800));
        this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        ImageIcon icon = new ImageIcon(new ImageIcon("img/calendar-icon.png").getImage().getScaledInstance(65, 65, Image.SCALE_DEFAULT));
        bouton = new Button(icon,"  GO TO CALENDAR");
        bouton.setLayout(null);
        bouton.setBounds(0, 20, 1000, 100);
        bouton.setFocusPainted(false);
        bouton.setBackground(new Color(215,90,90));
        ImageIcon quitter = new ImageIcon(new ImageIcon("img/quitter.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        quitterButton = new Button(quitter);
        quitterButton.setBounds(950,730,30,30);
        quitterButton.setBorderPainted(false);
        quitterButton.setContentAreaFilled(false);
        /*JButton test = new JButton("nike");
        this.add(test);
        test.setLayout(null);
        test.setBounds(500,600,50,50);*/
        this.add(quitterButton);
        this.quitterButton.addActionListener(this);
        this.bouton.addActionListener(this);
        this.add(bouton); 
        this.setVisible(true);
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.bouton) {
			new MenuComboBox();
		}
			 
		if (e.getSource() == this.quitterButton)
		{	
			System.exit(0);
		}
		}
	
}