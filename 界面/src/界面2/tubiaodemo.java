package 界面2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import 修改图标.Mylookandfeel;
import 修改图标.uiutil;

public class tubiaodemo {

	public static void main(String[] args) {
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
		Button bt=new Button("数据转换");
		TextField t1=new TextField(20);
		TextArea t2=new TextArea(40,40);
		f1.add(t1);
		f1.add(bt, null);
		f1.add(t2);
		
		uiutil.setFrameImage(f1);
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			UIManager.setLookAndFeel(Mylookandfeel.jtattoo_noire);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
