package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    
    private static final long serialVersionUID = 1L;
     
    public MainFrame() {
        this.setContentPane(new ImagePanel(new ImageIcon("img/fond.png").getImage()));
        this.setSize(new Dimension(1000,800));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
 
}