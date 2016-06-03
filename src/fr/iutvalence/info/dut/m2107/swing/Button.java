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
	
	Font f = new Font("Arial", Font.ITALIC + Font.BOLD, 25);
	
	/**
	 * Button constructor, to obtain a button with an image and a precise size
	 * @param img
	 * @param size
	 */

	public Button(ImageIcon img, Dimension size){
		super();
		this.setIcon(img);
		this.setPreferredSize(size);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setLayout(null);
	}
	
	/**
	 * Button constructor, to obtain a button with an image, a precise size and a text (color:gray)
	 * @param img
	 * @param size
	 * @param text
	 */
	
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

	/**
	 * Button constructor, to obtain a button with an image
	 * @param img
	 */
	
	public Button(ImageIcon img){
		this.setIcon(img);
		this.setBorderPainted(false);	
		this.setFocusPainted(false);
		this.setLayout(null);
	}
	
	/**
	 * Button constructor, to obtain a button with a precise size and a text
	 * @param size
	 * @param text
	 */
	
	public Button(Dimension size, String text){
		super(text);
		this.setPreferredSize(size);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setForeground(new Color(80,80,80));
		this.setFont(f);
		this.setLayout(null);
	}
	
	/**
	 * Button constructor, to obtain a button with a text in a pink background
	 * @param text
	 */
	
	public Button(String text){
		super(text);
		this.setFocusPainted(false);
		this.setBorderPainted(true);
		this.setContentAreaFilled(true);
		this.setLayout(null);
		this.setForeground(Color.BLACK);
		this.setBackground(new Color(215,90,90));
	}
	
	/**
	 * Button constructor, to obtain a button with a number in a pink background
	 * @param num
	 */
	
	public Button(int num){
		super(Integer.toString(num));
		this.setFocusPainted(false);
		this.setBorderPainted(true);
		this.setContentAreaFilled(true);
		this.setLayout(null);
		this.setForeground(Color.BLACK);
		this.setBackground(new Color(215,90,90));
	}
	
	/**
	 * Button constructor, to obtain a Button with an image and a text
	 * @param img
	 * @param text
	 */
	
	public Button(ImageIcon img, String text) {
		super(text);
		this.setIcon(img);
		this.setBorderPainted(false);	
		this.setForeground(new Color(80,80,80));
		this.setFont(f);
		this.setLayout(null);
	}
}
