package Quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back,about;
    JTextField tfname;
    Login(){
        setSize(1200,500);
        setLocation(200,150);
setLayout(null);
getContentPane().setBackground(Color.WHITE);

ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Quiz//icons//login.jpeg"));
JLabel image=new JLabel(i1);
image.setBounds(0,0,600,500);
  add(image);

JLabel heading=new JLabel("Simple Minds");
heading.setBounds(750,60,300,45);
heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
heading.setForeground(new Color(30,144,254));
add(heading);

JLabel name=new JLabel("Enter Your Name");
name.setBounds(810,150,300,20);
name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
name.setForeground(new Color(30,144,254));
add(name);
 tfname=new JTextField();
tfname.setBounds(735,200,300,25);
tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
add(tfname);

 rules=new JButton("Rules");
rules.setBounds(735,270,120,25);
rules.setBackground(new Color(30,144,254));
rules.setForeground(Color.WHITE);
rules.addActionListener(this);
add(rules);

 back=new JButton("Back");
back.setBounds(880,270,120,25);
back.setBackground(new Color(30,144,254));
back.addActionListener(this);

back.setForeground(Color.WHITE);
add(back);

about=new JButton("About");
about.setBounds(1020,270,120,25);
about.setBackground(new Color(30,144,254));
about.addActionListener(this);

about.setForeground(Color.WHITE);
add(about);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
         setVisible(false);
         new Rules(name);
        }else if(ae.getSource()==about){

            setVisible(false);
            new About();
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
