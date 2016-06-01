package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CalendarFrame extends JFrame implements ActionListener {
	
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
	Button precedent;
	Button quitter;
	
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
		this.add(precedent);
		this.add(quitter);
		
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
		
		this.quitter.addActionListener(this);
		this.precedent.addActionListener(this);
	    
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		
		if (e1.getSource() == this.quitter) {
			System.exit(0);
		}
		
		if (e1.getSource() == this.precedent) {
			this.dispose();
			new MainFrame();
		}
	}
}
