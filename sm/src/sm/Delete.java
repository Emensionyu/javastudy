package sm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Hashtable;

public class Delete extends JPanel implements ActionListener
{ 
  Hashtable ������Ϣ��=null;                           
  JTextField ѧ��,����,רҵ,�꼶,����;                 
  JRadioButton ��,Ů;
  JButton ɾ��;
  ButtonGroup group=null;
  FileInputStream inOne=null;
  ObjectInputStream inTwo=null;
  FileOutputStream outOne=null;
  ObjectOutputStream outTwo=null;
  File file=null;                                           
  public Delete(File file)
  {
   this.file=file;
   ѧ��=new JTextField(10);
   ɾ��=new JButton("ɾ��");
   ѧ��.addActionListener(this);
   ɾ��.addActionListener(this);
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
   ɾ��=new JButton("ɾ��");
   ѧ��.addActionListener(this);
  // ��ʼ�޸�.addActionListener(this);
  // ¼���޸�.addActionListener(this);
   ɾ��.addActionListener(this);
   Box box1=Box.createHorizontalBox();
   box1.add(new JLabel("����Ҫɾ����ѧ��:",JLabel.CENTER));
   box1.add(ѧ��); box1.add(ɾ��);
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
   box5.add(new JLabel("���꼶:",JLabel.CENTER));
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
    
                                       
if(e.getSource()==ɾ��)
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
                   String warning="����������Ϣ�Ѵ���,�뵽�޸�ҳ���޸�!";
                    
                   JOptionPane.showMessageDialog(this,warning,"����",JOptionPane.WARNING_MESSAGE);
                 }
              else
                 {  
                   String m="������Ϣ����¼��!";
                   int ok=JOptionPane.showConfirmDialog(this,m,"ȷ��",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
//................����Դ����ʡ��.................


                  if(ok==JOptionPane.YES_OPTION)
                     {
                                       
 ������Ϣ��.remove(number);
                       try
                        {
                          outOne=new FileOutputStream(file);
                          outTwo=new ObjectOutputStream(outOne);
                          outTwo.writeObject(������Ϣ��);
                          outTwo.close();
                          outOne.close();
                          ѧ��.setText(null);
                          ����.setText(null);                                
                          רҵ.setText(null);
                          �꼶.setText(null);
                          ����.setText(null);
                        }
                       catch(Exception ee)
                        { 
                         System.out.println(ee);
                        }
                     }
                   else if(ok==JOptionPane.NO_OPTION)
                     {
                        ѧ��.setText(null);
                        ����.setText(null);
                        רҵ.setText(null);
                        �꼶.setText(null);
                        ����.setText(null);
                     }
                 }
              
                 { 
                  String warning="��ѧ�Ų�����!";
                  JOptionPane.showMessageDialog(this,warning,"����",JOptionPane.WARNING_MESSAGE);
                 }
            }
        else
            { 
              String warning="����Ҫ����ѧ��!";
              JOptionPane.showMessageDialog(this,warning,"����",JOptionPane.WARNING_MESSAGE);
            }
      } 
  }
