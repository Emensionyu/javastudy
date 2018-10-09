package sm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Inquest extends JDialog implements ActionListener
{ 
  Hashtable 基本信息表=null;                           
  JTextField 学号,姓名,专业,年级,出生;                 
                                        
JRadioButton 男,女;
 JButton 查询;
  ButtonGroup group=null;
  FileInputStream inOne=null;
  ObjectInputStream inTwo=null;
  File file=null;                                           
  public Inquest(JFrame f,File file)
  {
  // ................部分源代码省略.................
  this.file=file;
   学号=new JTextField(10);
   查询=new JButton("查询");
   学号.addActionListener(this);
   查询.addActionListener(this);
   姓名=new JTextField(10);
   姓名.setEditable(false);
   专业=new JTextField(10);
   专业.setEditable(false);
   年级=new JTextField(10);
   年级.setEditable(false);
   出生=new JTextField(10);
   出生.setEditable(false);
   group=new ButtonGroup();
   男=new JRadioButton("男",false);
   女=new JRadioButton("女",false);

   group.add(男);
   group.add(女);
   //开始修改=new JButton("开始修改");
  // 录入修改=new JButton("录入修改");
   //录入修改.setEnabled(false);
   查询=new JButton("查询");
   学号.addActionListener(this);
  // 开始修改.addActionListener(this);
  // 录入修改.addActionListener(this);
   查询.addActionListener(this);
   Box box1=Box.createHorizontalBox();
   box1.add(new JLabel("输入要查询的学号:",JLabel.CENTER));
   box1.add(学号); box1.add(查询);
   Box box2=Box.createHorizontalBox();              
   box2.add(new JLabel("姓名:",JLabel.CENTER));
   box2.add(姓名);
   Box box3=Box.createHorizontalBox();              
   box3.add(new JLabel("性别:",JLabel.CENTER));
   box3.add(男);
   box3.add(女);
   Box box4=Box.createHorizontalBox();              
   box4.add(new JLabel("专业:",JLabel.CENTER));
   box4.add(专业);
   Box box5=Box.createHorizontalBox();              
   box5.add(new JLabel("年级:",JLabel.CENTER));
   box5.add(年级);
   Box box6=Box.createHorizontalBox();              
   box6.add(new JLabel("出生:",JLabel.CENTER));
   box6.add(出生);
   Box boxH=Box.createVerticalBox();              
   boxH.add(box1);
   boxH.add(box2);
   boxH.add(box3);
   boxH.add(box4);
   boxH.add(box5);
   boxH.add(box6);
   boxH.add(Box.createVerticalGlue());          
   JPanel pCenter=new JPanel();
   pCenter.add(boxH);
   setLayout(new BorderLayout());
   add(pCenter,BorderLayout.CENTER);
   JPanel pSouth=new JPanel();
   //pSouth.add(录入修改);
   //pSouth.add(重置);
   add(pSouth,BorderLayout.SOUTH);
   validate();
  }

 public void actionPerformed(ActionEvent e)
  {
    
                                       
if(e.getSource()==查询)
      {
              
                       学号.setText(null);
                       姓名.setText(null);                                
                       专业.setText(null);
                       年级.setText(null);
                       出生.setText(null);
                      }
                    String number="";
        				number=学号.getText();
        
         if(number.length()>0)
            {
              try {
                    inOne=new FileInputStream(file);
                    inTwo=new ObjectInputStream(inOne);
                    基本信息表=(Hashtable)inTwo.readObject();

                    inOne.close();
                    inTwo.close();
                  }
               catch(Exception ee)
                   {
                   }
              if(基本信息表.containsKey(number))          
                 {
                   Student stu=(Student)基本信息表.get(number);
                   姓名.setText(stu.getName());
                   专业.setText(stu.getDisciping());
                   年级.setText(stu.getGrade());
                   出生.setText(stu.getBorth()); 
                   if(stu.getSex().equals("男"))
                      {
                        男.setSelected(true);
                      }
                    else
                      {
                        女.setSelected(true);
                      }
   
                 }
              else
                 { 
                  String warning="该学号不存在!";
                
      } 
  }
  }}
