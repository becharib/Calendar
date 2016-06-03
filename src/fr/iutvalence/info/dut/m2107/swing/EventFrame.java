package fr.iutvalence.info.dut.m2107.swing;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class EventFrame extends JFrame implements ActionListener{
	
	/**
	 * EventFrame constructor
	 */
	
	Button out;
	
	public EventFrame(){
		this.setTitle("Event ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,250));
        this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        
        /**
         * Add Label and TextField to the Frame
         */
        
        JLabel titrelabel = new JLabel("Event title :");
        JLabel lieulabel = new JLabel("Event location :");
        TextField titre = new TextField();
        TextField lieu = new TextField();
        this.add(lieulabel);
        this.add(titrelabel);
        this.add(titre);
        this.add(lieu);
        titrelabel.setBounds(10,10,65,10);
        lieulabel.setBounds(10,50,85,10);
        lieu.setBounds(100,45,200,25);
        titre.setBounds(80,3,220,25);
   
        // TODO -- Associate an Event set by the user to a date in the calendar
        
        ImageIcon exit = new ImageIcon(new ImageIcon("img/quitter.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
    	out = new Button(exit);
    	this.add(out);
    	out.setBounds(450,180,30,30);
    	
    	this.out.addActionListener(this);
        
        this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == out){
			this.dispose();
		}
		
	}
	
	
}
