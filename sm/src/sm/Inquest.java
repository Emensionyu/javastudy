package sm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Inquest extends JDialog implements ActionListener
{ 
  Hashtable ������Ϣ��=null;                           
  JTextField ѧ��,����,רҵ,�꼶,����;                 
                                        
JRadioButton ��,Ů;
 JButton ��ѯ;
  ButtonGroup group=null;
  FileInputStream inOne=null;
  ObjectInputStream inTwo=null;
  File file=null;                                           
  public Inquest(JFrame f,File file)
  {
  // ................����Դ����ʡ��.................
  this.file=file;
   ѧ��=new JTextField(10);
   ��ѯ=new JButton("��ѯ");
   ѧ��.addActionListener(this);
   ��ѯ.addActionListener(this);
   ����=new JTextField(10);
   ����.setEditable(false);
   רҵ=new JTextField(10);
   רҵ.setEditable(false);
   �꼶=new JTextField(10);
   �꼶.setEditable(false);
   ����=new JTextField(10);
   ����.setEditable(false);
   group=new ButtonGroup();
   ��=new JRadioButton("��",false);
   Ů=new JRadioButton("Ů",false);

   group.add(��);
   group.add(Ů);
   //��ʼ�޸�=new JButton("��ʼ�޸�");
  // ¼���޸�=new JButton("¼���޸�");
   //¼���޸�.setEnabled(false);
   ��ѯ=new JButton("��ѯ");
   ѧ��.addActionListener(this);
  // ��ʼ�޸�.addActionListener(this);
  // ¼���޸�.addActionListener(this);
   ��ѯ.addActionListener(this);
   Box box1=Box.createHorizontalBox();
   box1.add(new JLabel("����Ҫ��ѯ��ѧ��:",JLabel.CENTER));
   box1.add(ѧ��); box1.add(��ѯ);
   Box box2=Box.createHorizontalBox();              
   box2.add(new JLabel("����:",JLabel.CENTER));
   box2.add(����);
   Box box3=Box.createHorizontalBox();              
   box3.add(new JLabel("�Ա�:",JLabel.CENTER));
   box3.add(��);
   box3.add(Ů);
   Box box4=Box.createHorizontalBox();              
   box4.add(new JLabel("רҵ:",JLabel.CENTER));
   box4.add(רҵ);
   Box box5=Box.createHorizontalBox();              
   box5.add(new JLabel("�꼶:",JLabel.CENTER));
   box5.add(�꼶);
   Box box6=Box.createHorizontalBox();              
   box6.add(new JLabel("����:",JLabel.CENTER));
   box6.add(����);
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
   //pSouth.add(¼���޸�);
   //pSouth.add(����);
   add(pSouth,BorderLayout.SOUTH);
   validate();
  }

 public void actionPerformed(ActionEvent e)
  {
    
                                       
if(e.getSource()==��ѯ)
      {
              
                       ѧ��.setText(null);
                       ����.setText(null);                                
                       רҵ.setText(null);
                       �꼶.setText(null);
                       ����.setText(null);
                      }
                    String number="";
        				number=ѧ��.getText();
        
         if(number.length()>0)
            {
              try {
                    inOne=new FileInputStream(file);
                    inTwo=new ObjectInputStream(inOne);
                    ������Ϣ��=(Hashtable)inTwo.readObject();

                    inOne.close();
                    inTwo.close();
                  }
               catch(Exception ee)
                   {
                   }
              if(������Ϣ��.containsKey(number))          
                 {
                   Student stu=(Student)������Ϣ��.get(number);
                   ����.setText(stu.getName());
                   רҵ.setText(stu.getDisciping());
                   �꼶.setText(stu.getGrade());
                   ����.setText(stu.getBorth()); 
                   if(stu.getSex().equals("��"))
                      {
                        ��.setSelected(true);
                      }
                    else
                      {
                        Ů.setSelected(true);
                      }
   
                 }
              else
                 { 
                  String warning="��ѧ�Ų�����!";
                
      } 
  }
  }}
