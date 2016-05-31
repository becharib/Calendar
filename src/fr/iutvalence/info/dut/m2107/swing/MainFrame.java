package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    
    JButton bouton;
    JButton quitterButton;
     
    public MainFrame() {
        this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
        this.setTitle("CalendarApplication");
        this.setSize(new Dimension(1000,800));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        ImageIcon icon = new ImageIcon(new ImageIcon("img/calendar-icon.png").getImage().getScaledInstance(65, 65, Image.SCALE_DEFAULT));
        bouton = new Button(icon,"  GO TO CALENDAR");
        bouton.setLayout(null);
        bouton.setBounds(0, 20, 1000, 100);
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
        
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.bouton) {
			this.dispose();
			new CalendarFrame();
		}
			 
		if (e.getSource() == this.quitterButton)
		{	
			System.exit(0);
		}
		}
	
}