package 窗体关闭事件;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frameclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f1 = new Frame("吴世勋凡人就是你");
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
		Button bt=new Button("数据转换");
		TextField t1=new TextField(20);
		TextArea t2=new TextArea(40,40);
		f1.add(t1);
		f1.add(bt, null);
		f1.add(t2);
		
//	bt.addActionListener(new ActionListener() {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			String s1=t1.getText();
//			t1.setText(null);
//			t2.append(s1+"\r\n");
//			t1.requestFocus();
//			
//		}
		bt.addMouseListener(new MouseAdapter() {
			public void MouseEntered() {
				f1.setBackground(Color.blue);
				
			}
			
		});
		

			
	

	}

}
