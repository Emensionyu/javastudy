package cn.itcast.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.itcast.util.uiutil;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final LayoutManager FlowLayOut = null;
	private final JLabel label = new JLabel("√‹¬Î");
	private JTextField textField1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setBounds(33, 55, 48, 15);
		getContentPane().add(label_1);
		label.setBounds(33, 91, 48, 22);
		getContentPane().add(label);
		
		textField1 = new JTextField();
		textField1.setBounds(130, 52, 108, 21);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 92, 108, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("◊¢≤·");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registFrame rf=new registFrame();
				this.setVisible(false);
				rf.setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		button.setBounds(49, 157, 93, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registFrame lf=new registFrame();
				lf.setVisible(true);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		button_1.setBounds(298, 157, 93, 23);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u767B\u5165");
		button_2.setBounds(169, 157, 93, 23);
		getContentPane().add(button_2);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("µ«»ÎΩÁ√Ê");
		uiutil.setFrameImage(this);
		this.setResizable(false);
		
	}
}
