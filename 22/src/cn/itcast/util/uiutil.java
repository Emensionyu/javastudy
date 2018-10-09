package cn.itcast.util;

import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;



public class uiutil {
	private uiutil() {}
	public static void setFrameImage(JFrame f1) {
		Toolkit tk=Toolkit.getDefaultToolkit();
		java.awt.Image	i=tk.getImage("src\\img\\20180111232133_GsCnK.jpeg");
		f1.setIconImage(i);
	}

}
