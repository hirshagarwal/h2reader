package com.h2micro.h2reader;

import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Graphics{
	Dimension buttonSize = new Dimension(20, 20);
	Dimension frameSize = new Dimension(100, 100);
	JFrame frame = new JFrame("Title");
	JPanel panel = new JPanel();
	
	public Graphics(){
		frame.setTitle("H2 Reader");
		frame.setSize(500, 500);
		frame.setLocation(10, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setup();
	}
	
	public void setup(){
		JButton btn = new JButton("Test");
		JTextArea text = new JTextArea(20, 20);
		
		btn.setSize(buttonSize);
		text.setSize(frameSize);
		
		panel.add(btn);
		panel.add(text);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	

}
