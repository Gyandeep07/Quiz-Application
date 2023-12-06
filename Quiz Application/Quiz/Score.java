package Quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
           setBounds(400,150,750,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Quiz//icons//score.png"));
Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(0,200,300,250);
  add(image);
  JLabel heading=new JLabel("Thankyou "+name+" for playing Simple Minds");
  heading.setBounds(45,30,700,30);
  heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
heading.setForeground(new Color(30,144,254));
  add(heading);

   JLabel lblscore=new JLabel("Your Score is : ="+score);
  lblscore.setBounds(350,200,300,30);
  lblscore.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
lblscore.setForeground(new Color(30,144,254));
  add(lblscore);
 JButton  Submit=new JButton("Play Again");
  Submit.setBounds(400,270,220,30);
  Submit.setFont(new Font("Viner Hand ITC",Font.BOLD,22));
  Submit.setBackground(new Color(30,144,255));
  Submit.setForeground(Color.WHITE);
  Submit.addActionListener(this);
  add(Submit);
  setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
setVisible(false);
new Login();
    }
    public static void main(String[] args) {
        new Score("user",0);
    }
}
