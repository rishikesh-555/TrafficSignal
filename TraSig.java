import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

class TraSig extends JFrame{
    TraSig(){
        setSize(500,500);
        setTitle("Traffic Signal");
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Label red=new Label("Change To Color Red");
        red.setBounds(50,100,200,30);
        Button b1=new Button("RED");
        b1.setBounds(300,100,100,30);
        b1.setBackground(Color.red);
        add(red);
        add(b1);
        
        Label orange=new Label("Change To Color Orange");
        orange.setBounds(50,200,200,30);
        Button b2=new Button("ORANGE");
        b2.setBounds(300,200,100,30);
        b2.setBackground(Color.orange);
        add(orange);
        add(b2);
        
        Label green=new Label("Change To Color Green");
        green.setBounds(50,300,200,30);
        Button b3=new Button("GREEN");
        b3.setBounds(300,300,100,30);
        b3.setBackground(Color.green);
        add(green);
        add(b3);
    }
    
    public static void main(String args[]){
        TraSig ts= new TraSig();
    }
}


