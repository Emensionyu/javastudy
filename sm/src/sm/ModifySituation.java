package sm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Hashtable;
import java.util.*;
public class ModifySituation extends JPanel implements ActionListener
{ 
  Hashtable 基本信息表=null;                           
  JTextField 学号,姓名,专业,年级,出生;                 
  JRadioButton 男,女;
  ButtonGroup group=null;
  JButton 开始修改,录入修改,重置;
  FileInputStream inOne=null;
  ObjectInputStream inTwo=null;
  FileOutputStream outOne=null;
  ObjectOutputStream outTwo=null;
  File file=null;                                           
  public ModifySituation(File file)
  {
   this.file=file;
   学号=new JTextField(10);
   姓名=new JTextField(10);                                
   专业=new JTextField(10);
   年级=new JTextField(10);
   出生=new JTextField(10);
   group=new ButtonGroup();
   男=new JRadioButton("男",true);
   女=new JRadioButton("女",false);
   group.add(男);
   group.add(女);
   开始修改=new JButton("开始修改");
   录入修改=new JButton("录入修改");
   录入修改.setEnabled(false);
   重置=new JButton("重置");
   学号.addActionListener(this);
   开始修改.addActionListener(this);
   录入修改.addActionListener(this);
   重置.addActionListener(this);
   Box box1=Box.createHorizontalBox();
   box1.add(new JLabel("输入要修改的学号:",JLabel.CENTER));
   box1.add(学号); box1.add(开始修改);
   Box box2=Box.createHorizontalBox();              
   box2.add(new JLabel("新（）姓名:",JLabel.CENTER));
   box2.add(姓名);
   Box box3=Box.createHorizontalBox();              
   box3.add(new JLabel("（新）性别:",JLabel.CENTER));
   box3.add(男);
   box3.add(女);
   Box box4=Box.createHorizontalBox();              
   box4.add(new JLabel("（新）专业:",JLabel.CENTER));
   box4.add(专业);
   Box box5=Box.createHorizontalBox();              
   box5.add(new JLabel("（新）年级:",JLabel.CENTER));
   box5.add(年级);
   Box box6=Box.createHorizontalBox();              
   box6.add(new JLabel("（新）出生:",JLabel.CENTER));
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
   pSouth.add(录入修改);
   pSouth.add(重置);
   add(pSouth,BorderLayout.SOUTH);
   validate();
  }

 public void actionPerformed(ActionEvent e)
  {
    
                                       
if(e.getSource()==重置)
      {
              
           //................部分源代码省略.................

              
                      
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
                   String warning="该生基本信息已存在,请到修改页面修改!";
                    
                   JOptionPane.showMessageDialog(this,warning,"警告",JOptionPane.WARNING_MESSAGE);
                 }
              else
                 {  
                   String m="基本信息将被录入!";
                   int ok=JOptionPane.showConfirmDialog(this,m,"确认",JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.INFORMATION_MESSAGE);
                  if(ok==JOptionPane.YES_OPTION)
                    {
                     String name=姓名.getText();
                     String discipling=专业.getText();
                     String grade=年级.getText();
                     String borth=出生.getText();
                     String sex=null;
                        if(男.isSelected())
                           {
                             sex=男.getText();
                           }
                        else
                           {
                             sex=女.getText();
                           }
                     Student  学生 = new Student();
                     学生.setNumber(number);
                     学生.setName(name);
                     学生.setDiscipling(discipling);
                     学生.setGrade(grade);
                     学生.setBorth(borth);
                     学生.setSex(sex);
                       try{
                           outOne=new FileOutputStream(file);
                           outTwo=new ObjectOutputStream(outOne);
                           ///基本信息表.put(number,学生);
                           outTwo.writeObject(基本信息表);
                           outTwo.close();
                           outOne.close();
                           学号.setText(null);                               
                           姓名.setText(null);                                
                           专业.setText(null);
                           年级.setText(null);
                           出生.setText(null);
                          }
                       catch(Exception ee)
                          { 
                           System.out.println(ee);
                          }
                   
                   }
                } 
            }
  }
 }
