package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    
    JButton bouton;
     
    public MainFrame() {
        this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
        this.setTitle("CalendarApplication");
        this.setSize(new Dimension(1000,800));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        ImageIcon icon = new ImageIcon(new ImageIcon("img/calendar-icon.png").getImage().getScaledInstance(65, 65, Image.SCALE_DEFAULT));
        bouton = new Button(icon,new Dimension(1000,100),"  GO TO CALENDAR");
        this.add(bouton);
        this.bouton.addActionListener(this);
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.bouton) {
			this.dispose();
			new CalendarFrame();
			
		}
		
	}
 
}