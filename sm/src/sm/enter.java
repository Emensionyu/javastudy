package sm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class enter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
	
			public void run() {
				try {
					enter frame = new enter();
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
	public enter() {
		setTitle("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		setAutoRequestFocus(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u554A\u65B9\u73B0\u5728\u662F\u77ED\u53D1\u8FD8\u662F\u957F\u53D1");
		label.setBounds(0, 0, 434, 15);
		getContentPane().add(label);
		
		JButton button = new JButton("\u77ED\u53D1");
		button.setBounds(76, 45, 57, 62);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		getContentPane().add(button);
		
		JButton button_1 = new JButton("\u957F\u53D1");
		button_1.setBounds(242, 45, 57, 62);
		button_1.setHorizontalAlignment(SwingConstants.LEADING);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(button_1);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("ËÎÌו", Font.PLAIN, 30));
		lblA.setBounds(31, 56, 46, 40);
		getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("ËÎÌו", Font.PLAIN, 30));
		lblB.setBounds(184, 45, 54, 62);
		getContentPane().add(lblB);
		
	
	}
}
