package cn.itcast.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.itcast.dao.Userdao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.pojo.User;
import cn.itcast.util.uiutil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registFrame frame = new registFrame();
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
	public registFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(82, 56, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(82, 97, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(165, 53, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 94, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText().trim();
				String password=textField_1.getText().trim();
				User user=new User();
				user.setUsername(username);
				user.setPassword(password);
				Userdao ud=new UserDaoImpl(); 
				ud.regist(user);
				JOptionPane.showMessageDialog(button, this,"注册成功，欢迎来到登入界面", getDefaultCloseOperation());
				
				gologin();
			}

			private void gologin() {
				// TODO Auto-generated method stub
				LoginFrame lf=new LoginFrame();
				lf.setVisible(true);
				this.dispose();
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		button.setBounds(58, 168, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.setBounds(196, 168, 93, 23);
		contentPane.add(button_1);
		init();
		
	}
	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("注册界面");
		uiutil.setFrameImage(this);
		
	}
}
