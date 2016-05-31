package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	 
    private static final long serialVersionUID = 1L;
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        JPanel panel = new JPanel();
        panel.add(new Button(new ImageIcon("/img/calendar-icon.png"),new Dimension(1000,100)));
        frame.add(panel);
    }
 
    private Image img;
     
    public ImagePanel(Image img){
        this.img = img;
        this.setSize(new Dimension(1000,800));
    }
     
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}
