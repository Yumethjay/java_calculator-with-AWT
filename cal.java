package gui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {
    public void windowClosing (WindowEvent windowevent) {
        System.exit(0);
    }
}

class Testcalculator implements ActionListener {
    
    TextField textfield;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25;
    String output,input,operator;
    Double  fdv,sdv,total;
    //Color custom1 = new Color(178, 190, 181);
    //Color custom2 = new Color(100, 40, 111);
    //Color custom3 = new Color(98, 80, 151);
    //Color custom4 = new Color(68, 90, 163);
    //Color custom5 = new Color(80, 110, 102);
    
    
    Testcalculator () {
        Frame frame = new Frame();
        frame.addWindowListener(new close() );
        frame.setBackground(Color.black);
        frame.setTitle("Java calculator v.1.0.0.1");
        frame.setResizable(false);
        //frame.CENTER_ALIGNMENT;
        frame.setSize(500,400);
        Font font1 = new Font("Poppins",Font.BOLD,30);
        Font font2 = new Font("Quicksand",Font.BOLD,10);
        Font font3 = new Font("Quicksand",Font.BOLD,40);
        
        MenuBar mb = new MenuBar();
        
        Menu m1 = new Menu("View");
        MenuItem mistandard = new MenuItem("Standard");
        MenuItem miscientific = new MenuItem("Scientific");      
        MenuItem migraphical = new MenuItem("Graphical"); 
        MenuItem miprogrammer = new MenuItem("Programmer"); 
        m1.add(mistandard);
        m1.add(miscientific);
        m1.add(migraphical);
        m1.add(miprogrammer);
        
        Menu m2 = new Menu("Edit");
        MenuItem micopy = new MenuItem("Copy");
        MenuItem mipaste = new MenuItem("paste");
        MenuItem micut = new MenuItem("Cut");
        m2.add(micopy);
        m2.add(mipaste);
        m2.add(micut);
        
        Menu m3 = new Menu("Converter");
        MenuItem micurrency = new MenuItem("Currency");
        MenuItem micolume = new MenuItem("Volume");
        MenuItem milength = new MenuItem("Length");
        m3.add(micurrency);
        m3.add(micolume);
        m3.add(milength);
        
        Menu m4 = new Menu("About");
        MenuItem miversion = new MenuItem("Current Version");
        MenuItem midev = new MenuItem("Developers");
        MenuItem micheck = new MenuItem("Check updates");
        MenuItem mifeed = new MenuItem("Send Feedback");
        m4.add(miversion);
        m4.add(midev);
        m4.add(micheck);
        m4.add(mifeed);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        
        frame.setMenuBar(mb);
        
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout gl = new GridLayout(5,4,4,4);
        p2.setLayout(gl);
        p2.setBackground(Color.darkGray);
        
        textfield = new TextField(20);
        textfield.setFont(font3);
        textfield.setEditable(true);
        textfield.setForeground(Color.DARK_GRAY);
        textfield.setBackground(Color.white);
        textfield.setText("0");
        
        p1.add(textfield);
        
        // numbers and symbol
        btn1 = new Button("C");
        btn2 = new Button("%");
        btn3 = new Button("√");
        btn4 = new Button("/");
        btn5 = new Button("7");
        btn6 = new Button("8");
        btn7 = new Button("9");
        btn8 = new Button("*");
        btn9 = new Button("4");
        btn10 = new Button("5");
        btn11 = new Button("6");
        btn12 = new Button("-");
        btn13 = new Button("1");
        btn14 = new Button("2");
        btn15 = new Button("3");
        btn16 = new Button("+");
        btn17 = new Button(",");
        btn18 = new Button("0");
        btn19 = new Button(".");
        btn20 = new Button("=");
        
        // button color
       btn1.setForeground(Color.white);
       btn2.setForeground(Color.white);
       btn3.setForeground(Color.white);
       btn4.setForeground(Color.white);
       btn5.setForeground(Color.white);
       btn6.setForeground(Color.white);
       btn7.setForeground(Color.white);
       btn8.setForeground(Color.white);
       btn9.setForeground(Color.white);
       btn10.setForeground(Color.white);
       btn11.setForeground(Color.white);
       btn12.setForeground(Color.white);
       btn13.setForeground(Color.white);
       btn14.setForeground(Color.white);
       btn15.setForeground(Color.white);
       btn16.setForeground(Color.white);
       btn17.setForeground(Color.white);
       btn18.setForeground(Color.white);
       btn19.setForeground(Color.white);
       btn20.setForeground(Color.white);
       
       // button background color
       btn1.setBackground(Color.black);
       btn2.setBackground(Color.black);
       btn3.setBackground(Color.black);
       btn4.setBackground(Color.black);
       btn5.setBackground(Color.black);
       btn6.setBackground(Color.black);
       btn7.setBackground(Color.black);
       btn8.setBackground(Color.black);
       btn9.setBackground(Color.black);
       btn10.setBackground(Color.black);
       btn11.setBackground(Color.black);
       btn12.setBackground(Color.black);
       btn13.setBackground(Color.black);
       btn14.setBackground(Color.black);
       btn15.setBackground(Color.black);
       btn16.setBackground(Color.black);
       btn17.setBackground(Color.black);
       btn18.setBackground(Color.black);
       btn19.setBackground(Color.black);
       btn20.setBackground(Color.black);
       
       // font size for fbuttons
       btn1.setFont(font1);
       btn2.setFont(font1);
       btn3.setFont(font1);
       btn4.setFont(font1);
       btn5.setFont(font1);
       btn6.setFont(font1);
       btn7.setFont(font1);
       btn8.setFont(font1);
       btn9.setFont(font1);
       btn10.setFont(font1);
       btn11.setFont(font1);
       btn12.setFont(font1);
       btn13.setFont(font1);
       btn14.setFont(font1);
       btn15.setFont(font1);
       btn16.setFont(font1);
       btn17.setFont(font1);
       btn18.setFont(font1);
       btn19.setFont(font1);
       btn20.setFont(font1);
       
       // button assign to the panel
       p2.add(btn1);
       p2.add(btn2);
       p2.add(btn3);
       p2.add(btn4);
       p2.add(btn5);
       p2.add(btn6);
       p2.add(btn7);
       p2.add(btn8);
       p2.add(btn9);
       p2.add(btn10);
       p2.add(btn11);
       p2.add(btn12);
       p2.add(btn13);
       p2.add(btn14);
       p2.add(btn15);
       p2.add(btn16);
       p2.add(btn17);
       p2.add(btn18);
       p2.add(btn19);
       p2.add(btn20);
       
       // Action listners
       btn1.addActionListener(this );
       btn2.addActionListener(this );
       btn3.addActionListener(this );
       btn4.addActionListener(this );
       btn5.addActionListener(this );
       btn6.addActionListener(this );
       btn7.addActionListener(this );
       btn8.addActionListener(this );
       btn9.addActionListener(this );
       btn10.addActionListener(this );
       btn11.addActionListener(this );
       btn12.addActionListener(this );
       btn13.addActionListener(this );
       btn14.addActionListener(this );
       btn15.addActionListener(this );
       btn16.addActionListener(this );
       btn17.addActionListener(this );
       btn18.addActionListener(this );
       btn19.addActionListener(this );
       btn20.addActionListener(this );
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
    
    public void actionPerformed  (ActionEvent d) {
        
        if (textfield.getText().equals("0")) {
            textfield.setText("");
        }
        
           Object o = d.getSource();

               if (o.equals(btn1)) {
                   textfield.setText("0"); // set 0 to textfield

               } else if (o.equals(btn2)) { // %
                   output = textfield.getText();
                    operator = btn2.getLabel();
                    textfield.setText("");
                   
               }else if (o.equals(btn3)) { // √
                   output = textfield.getText();
                   operator = btn3.getLabel();
                   textfield.setText("");
                   
               }else if (o.equals(btn4)) { // /
                   output = textfield.getText();
                   operator = btn4.getLabel();
                   textfield.setText("");
                   
               }else if (o.equals(btn8)) { // *
                   output = textfield.getText();
                   operator = btn8 .getLabel();
                   textfield.setText("");
                   
               }else if (o.equals(btn12)) { // -
                   output = textfield.getText();
                   operator = btn12.getLabel();
                   textfield.setText("");
                   
               }else if (o.equals(btn16)) { // +
                   output = textfield.getText();
                   operator = btn16.getLabel();
                   textfield.setText("");
                   
               }else if (o.equals(btn20)) { // =
                   input = textfield.getText();
                   fdv = Double.parseDouble(output);
                   sdv = Double.parseDouble(input);
                   
                   // Operations
                   textfield.setText("");
                   if (operator.equals("+")) {
                       total = fdv + sdv; 
                       textfield.setText(total + "");
                       
                   } else if(operator.equals("-")) {
                       total = fdv - sdv; 
                       textfield.setText(total + "");
                       
                   }else if(operator.equals("*")) {
                       total = fdv * sdv; 
                       textfield.setText(total + "");
                       
                   }else if(operator.equals("/")) {
                       total = fdv / sdv; 
                       textfield.setText(total + "");
                       
                   }else if(operator.equals("%")){
                       total = fdv * (sdv / 100);
                       textfield.setText(total.toString());
                       
                   }else if(operator.equals("√")){
                        fdv = Double.parseDouble(output);
                        total = Math.sqrt(fdv);
                        textfield.setText(total.toString());
                   }
                   
                   
               }else if (o.equals(btn5)) { 
                   textfield.setText(textfield.getText() + btn5.getLabel() );
                   
               }else if (o.equals(btn6)) { 
                   textfield.setText(textfield.getText() + btn6.getLabel() );
                   
               }else if (o.equals(btn7)) { 
                   textfield.setText(textfield.getText() + btn7.getLabel() );
                   
               }else if (o.equals(btn15)) { 
                   textfield.setText(textfield.getText() + btn15.getLabel() );
                   
               }else if (o.equals(btn17)) { 
                   textfield.setText(textfield.getText() + btn17.getLabel() );
                   
               }else if (o.equals(btn9)) { 
                   textfield.setText(textfield.getText() + btn9.getLabel() );
                   
               }else if (o.equals(btn10)) { 
                   textfield.setText(textfield.getText() + btn10.getLabel() );
                   
               }else if (o.equals(btn11)) { 
                   textfield.setText(textfield.getText() + btn11.getLabel() );
                   
               }else if (o.equals(btn13)) { 
                   textfield.setText(textfield.getText() + btn13.getLabel() );
                   
               }else if (o.equals(btn14)) { 
                   textfield.setText(textfield.getText() + btn14.getLabel() );
                   
               }else if (o.equals(btn18)) { 
                   textfield.setText(textfield.getText() + btn18.getLabel() );
                   
               }else if (o.equals(btn19)) { 
                   textfield.setText(textfield.getText() + btn19.getLabel() );
                   
               }

        }

    private String toString(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}


public class calculator {
    public static void main(String[] args) {
        new Testcalculator();
    }
}
