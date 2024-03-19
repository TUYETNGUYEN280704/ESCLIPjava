package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.face_model;

public class face_View extends JFrame{
	
	private face_model face_model_1;
	private JButton  jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JButton jButton_clear;
	private JButton jButton_value;
	
	public face_View() {
		this.face_model_1 = new face_model();
		this.init(); // ham khoi taoo
		this.setVisible(true);//cho phep hien thi ra man hinh
	}
	
	public void init() {
		this.setTitle("NGUYEN THI HONG TUYET");
		this.setSize(300,300);
		this.setLocationRelativeTo(null); // wwin nam giua man hinh
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// tat la hhet
		
		
		
		// taoj jbutton
		jButton_up = new JButton("up");
		jButton_down = new JButton("down");
		jButton_reset = new JButton("reset");
		jButton_clear = new JButton("clear");
		
		
		// tao ipanel chua cac jbutton
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jButton_down, BorderLayout.EAST);
		jPanel.add(jButton_reset, BorderLayout.SOUTH);
		jPanel.add(jButton_value, BorderLayout.CENTER);
	}

	
	

}
