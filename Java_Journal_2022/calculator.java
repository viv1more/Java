// Java program to create a simple calculator
// with basic +, -, /, * using java swing elements
 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calculator extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;
 
    // create a textfield
    static JTextField l;
 
    // store operator and operands
    String s0, s1, s2;
 
    // default constructor
    calculator()
    {
        s0 = s1 = s2 = "";
    }
 
    // main function
    public static void main(String args[])
    {
        // create a frame
        f = new JFrame("calculator");
 
        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
 
        // create a object of class
        calculator c = new calculator();
 
        // create a textfield
        l = new JTextField(16);
 
        // set the textfield to non editable
        l.setEditable(false);
 
        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
 
        // create number buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
 
        // equals button
        beq1 = new JButton("=");
 
        // create operator buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");
 
        // create . button
        be = new JButton(".");
 
        // create a panel
        JPanel p = new JPanel();
 
        // add action listeners
        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);
 
        // add elements to panel
        p.add(l);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);
 
        // set Background of panel
        p.setBackground(Color.yellow);
 
        // add panel to frame
        f.add(p);
 
        f.setSize(200, 220);
        f.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            // set the value of text
            l.setText(s0 + s1 + s2 + "=" + te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = s;
 
                // make the operand blank
                s2 = "";
            }
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
    }
}
/*import javax.swing.*;
import java.awt.event.*;
 
 
class calculator implements ActionListener
{
JFrame f;
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
 
static double a=0,b=0,result=0;
static int operator=0;
 
calculator()
{
f=new JFrame("calculator");
t=new JTextField();
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b0=new JButton("0");
bdiv=new JButton("/");
bmul=new JButton("*");
bsub=new JButton("-");
badd=new JButton("+");
bdec=new JButton(".");
beq=new JButton("=");
bdel=new JButton("Delete");
bclr=new JButton("Clear");
t.setBounds(30,40,280,30);
b7.setBounds(40,100,50,40);
b8.setBounds(110,100,50,40);
b9.setBounds(180,100,50,40);
bdiv.setBounds(250,100,50,40);
b4.setBounds(40,170,50,40);
b5.setBounds(110,170,50,40);
b6.setBounds(180,170,50,40);
bmul.setBounds(250,170,50,40);
b1.setBounds(40,240,50,40);
b2.setBounds(110,240,50,40);
b3.setBounds(180,240,50,40);
bsub.setBounds(250,240,50,40);
bdec.setBounds(40,310,50,40);
b0.setBounds(110,310,50,40);
beq.setBounds(180,310,50,40);
badd.setBounds(250,310,50,40);
bdel.setBounds(60,380,100,40);
bclr.setBounds(180,380,100,40);
f.add(t);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(bdiv);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(bmul);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(bsub);
f.add(bdec);
f.add(b0);
f.add(beq);
f.add(badd);
f.add(bdel);
f.add(bclr);
f.setLayout(null);
f.setVisible(true);
f.setSize(350,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bdiv.addActionListener(this);
bmul.addActionListener(this);
bsub.addActionListener(this);
bdec.addActionListener(this);
beq.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);
}
 
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("1"));
if(e.getSource()==b2)
t.setText(t.getText().concat("2"));
if(e.getSource()==b3)
t.setText(t.getText().concat("3"));
if(e.getSource()==b4)
t.setText(t.getText().concat("4"));
if(e.getSource()==b5)
t.setText(t.getText().concat("5"));
if(e.getSource()==b6)
t.setText(t.getText().concat("6"));
if(e.getSource()==b7)
t.setText(t.getText().concat("7"));
if(e.getSource()==b8)
t.setText(t.getText().concat("8"));
if(e.getSource()==b9)
t.setText(t.getText().concat("9"));
if(e.getSource()==b0)
t.setText(t.getText().concat("0"));
if(e.getSource()==bdec)
t.setText(t.getText().concat("."));
if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
operator=1;
t.setText("");
}
if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
operator=2;
t.setText("");
}
if(e.getSource()==bmul)
{
a=Double.parseDouble(t.getText());
operator=3;
t.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
operator=4;
t.setText("");
}
if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(operator)
{
case 1: result=a+b;
break;
case 2: result=a-b;
break;
case 3: result=a*b;
break;
case 4: result=a/b;
break;
default: result=0;
}
t.setText(""+result);
}
if(e.getSource()==bclr)
t.setText("");
if(e.getSource()==bdel)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}
}
 
public static void main(String...s)
{
new calculator();
}
}
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
   private static JTextField inputBox;

   calculator(){}
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {          
      JFrame frame = new JFrame("calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      createUI(frame);
      frame.setSize(200, 200);            
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   private static void createUI(JFrame frame) {
      JPanel panel = new JPanel();
      calculator calculator = new calculator();
      GridBagLayout layout = new GridBagLayout();          
      GridBagConstraints gbc = new GridBagConstraints();
      panel.setLayout(layout);
       
      inputBox = new JTextField(10);        
      inputBox.setEditable(false);

      JButton button0 = new JButton("0");JButton button1 = new JButton("1");
      JButton button2 = new JButton("2");JButton button3 = new JButton("3");
      JButton button4 = new JButton("4");JButton button5 = new JButton("5");
      JButton button6 = new JButton("6");JButton button7 = new JButton("7");
      JButton button8 = new JButton("8");JButton button9 = new JButton("9");

      JButton buttonPlus = new JButton("+");JButton buttonMinus = new JButton("-");
      JButton buttonDivide = new JButton("/");JButton buttonMultiply = new JButton("x");
      JButton buttonClear = new JButton("C");JButton buttonDot = new JButton(".");
      JButton buttonEquals = new JButton("=");

      button1.addActionListener(calculator);button2.addActionListener(calculator);
      button3.addActionListener(calculator);button4.addActionListener(calculator);
      button5.addActionListener(calculator);button6.addActionListener(calculator);
      button7.addActionListener(calculator);button8.addActionListener(calculator);
      button9.addActionListener(calculator);button0.addActionListener(calculator);

      buttonPlus.addActionListener(calculator);buttonMinus.addActionListener(calculator);
      buttonDivide.addActionListener(calculator);buttonMultiply.addActionListener(calculator);
      buttonClear.addActionListener(calculator);buttonDot.addActionListener(calculator);
      buttonEquals.addActionListener(calculator);

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0; gbc.gridy = 0; panel.add(button1, gbc);        
      gbc.gridx = 1; gbc.gridy = 0; panel.add(button2, gbc);
      gbc.gridx = 2; gbc.gridy = 0; panel.add(button3, gbc);
      gbc.gridx = 3; gbc.gridy = 0; panel.add(buttonPlus, gbc);
      gbc.gridx = 0; gbc.gridy = 1; panel.add(button4, gbc);
      gbc.gridx = 1; gbc.gridy = 1; panel.add(button5, gbc);
      gbc.gridx = 2; gbc.gridy = 1; panel.add(button6, gbc);
      gbc.gridx = 3; gbc.gridy = 1; panel.add(buttonMinus, gbc);
      gbc.gridx = 0; gbc.gridy = 2; panel.add(button7, gbc);
      gbc.gridx = 1; gbc.gridy = 2; panel.add(button8, gbc);
      gbc.gridx = 2; gbc.gridy = 2; panel.add(button9, gbc);
      gbc.gridx = 3; gbc.gridy = 2; panel.add(buttonDivide, gbc);
      gbc.gridx = 0; gbc.gridy = 3; panel.add(buttonDot, gbc);
      gbc.gridx = 1; gbc.gridy = 3; panel.add(button0, gbc);
      gbc.gridx = 2; gbc.gridy = 3; panel.add(buttonClear, gbc);
      gbc.gridx = 3; gbc.gridy = 3; panel.add(buttonMultiply, gbc);
      gbc.gridwidth = 3;

      gbc.gridx = 0; gbc.gridy = 4; panel.add(inputBox, gbc);        
      gbc.gridx = 3; gbc.gridy = 4; panel.add(buttonEquals, gbc);
      frame.getContentPane().add(panel, BorderLayout.CENTER);        
   }

   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      if (command.charAt(0) == 'C') {                      
         inputBox.setText("");
      }else if (command.charAt(0) == '=') {                    
         inputBox.setText(evaluate(inputBox.getText()));
      }else {                                
         inputBox.setText(inputBox.getText() + command);
      }
   }
 
   public static String evaluate(String expression) {
      char[] arr = expression.toCharArray();
      String operand1 = "";String operand2 = "";String operator = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if(operator.isEmpty()){
               operand1 += arr[i];
            }else{
               operand2 += arr[i];
            }
         }  

         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }

      if (operator.equals("+"))
         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
      else if (operator.equals("-"))
         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
      else if (operator.equals("/"))
         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
      else
         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
      return operand1 + operator + operand2 + "=" +result;
   }    
} */