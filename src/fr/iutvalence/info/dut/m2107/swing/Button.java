package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Button extends JButton{
	
	private static final long serialVersionUID = 1L;
	
	Font f = new Font("Arial", Font.ITALIC + Font.BOLD, 25);

	public Button(ImageIcon img, Dimension size){
		super();
		this.setIcon(img);
		this.setPreferredSize(size);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setLayout(null);
	}
	
	public Button(ImageIcon img, Dimension size, String text){
		super(text);
		this.setIcon(img);
		this.setPreferredSize(size);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setForeground(Color.GRAY);
		this.setFont(f);
		this.setLayout(null);
	}

	public Button(ImageIcon img){
		this.setIcon(img);
		this.setBorderPainted(false);	
		this.setFocusPainted(false);
		this.setLayout(null);
	}
	
	public Button(Dimension size, String text){
		super(text);
		this.setPreferredSize(size);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setForeground(new Color(80,80,80));
		this.setFont(f);
		this.setLayout(null);
	}
	
	public Button(String text){
		super(text);
		this.setFocusPainted(false);
		this.setBorderPainted(true);
		this.setContentAreaFilled(true);
		this.setLayout(null);
		this.setForeground(Color.BLACK);
		this.setBackground(new Color(215,90,90));
	}
	
	public Button(int num){
		super(Integer.toString(num));
		this.setFocusPainted(false);
		this.setBorderPainted(true);
		this.setContentAreaFilled(true);
		this.setLayout(null);
		this.setForeground(Color.BLACK);
		this.setBackground(new Color(215,90,90));
	}
	
	public Button(ImageIcon img, String text) {
		super(text);
		this.setIcon(img);
		this.setBorderPainted(false);	
		this.setForeground(new Color(80,80,80));
		this.setFont(f);
		this.setLayout(null);
	}
}
