package 按钮添加鼠标事件;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class mousebutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1 = new JFrame("吴世勋凡人就是你");
		f1.setBounds(200, 200, 300, 300);
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowClosing(e);
				System.exit(0);
			}

		});
		
		f1.setLayout(new FlowLayout());
		Button bt=new Button("蓝色");
		f1.add(bt);
//		bt.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				f1.setBackground(Color.blue);
//				
//			}
//
//			
//		});
//		

	
	bt.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			f1.setBackground(Color.GREEN);
		}

		
	});
f1.setVisible(true);
	
		
	

}}
