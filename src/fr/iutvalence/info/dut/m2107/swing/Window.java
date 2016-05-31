package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.ImageIcon;

import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javax.swing.JLabel;

public class Window extends JFrame {
	
	public Window(){
        this.setContentPane(new ImagePanel(new ImageIcon("/img/fond.png").getImage()));
        this.setSize(new Dimension(1000,800));
        this.setVisible(true);
    }
	
	public static void main(String[] args) {
		new Window();
	}
}
