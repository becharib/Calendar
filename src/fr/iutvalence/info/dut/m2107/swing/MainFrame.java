package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private String letitre;
	private Dimension ladimension;
	private String cheminfond;
	private String couleurfond;
	
	public MainFrame(String title, Dimension dim, String pathfond) {
		this.letitre=title;
		this.ladimension=dim;
		this.cheminfond=pathfond;
		
		this.setTitle(title);
		this.setSize(dim);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
		ImageIcon img = new ImageIcon(pathfond);
		this.setIconImage(img.getImage());
		this.setResizable(false);
		try{
			this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(pathfond)))));
				}
			catch(IOException e)
			{
				System.out.println("Image doesn't exist");
			}
			this.setResizable(false);
			this.pack();
			this.setVisible(true);			
			this.setSize(dim);
	}
	
	public void MainFrameWithColor(String title, Dimension dim, String color) {
		this.letitre=title;
		this.ladimension=dim;
		this.couleurfond=color;
		
		this.setTitle(title);
		this.setSize(dim);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
		/*this.setBackground(Color.color);*/
	}
	
	public static void MainFrame() {

		JFrame window = new JFrame("Calendar");	
	    window.setTitle("Calendar");
		window.setSize(1000, 800);
	    window.setLocationRelativeTo(null);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    window.setVisible(true);
	    ImageIcon img = new ImageIcon("img/calendar-icon.png");
	    window.setIconImage(img.getImage());
		window.setResizable(false);
		try{
		window.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("img/fond.png")))));
			}
		catch(IOException e)
		{
			System.out.println("Image does not exist");
		}
		window.setResizable(false);
		window.pack();
		window.setVisible(true);			
		window.setSize(1000, 800);
	}
	
}
