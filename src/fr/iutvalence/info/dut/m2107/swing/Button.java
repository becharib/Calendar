package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Button extends JButton{
	
	private static final long serialVersionUID = 1L;

	public Button(ImageIcon img, Dimension size){
		super();
		this.setIcon(img);
		this.setPreferredSize(size);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
	}
	
	public Button(ImageIcon img, Dimension size, String text){
		super(text);
		this.setIcon(img);
		this.setPreferredSize(size);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setForeground(Color.GRAY);
	}

}
