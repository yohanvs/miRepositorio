
package prácticas;

import javax.swing.*;
import java.awt.event.*;

public class Practica8 extends JFrame implements ActionListener{

    private JTextField textfield1, textfield2;
    private JLabel label1, label2, label3;
    private JButton boton1;
    
    public Practica8(){
    
        setLayout(null);
        label1 = new JLabel("valor 1:");
        label1.setBounds(50,5,100,30);
        add(label1);
        
        label2 = new JLabel("valor 2;");
        label2.setBounds(50,35,100,30);
        add(label2);
        
        label3 = new JLabel("Resultado: ");
        label3.setBounds(120,80,100,30);
        add(label3);
        
        textfield1 = new JTextField();
        textfield1.setBounds(120,10,150,20);
        add(textfield1);
        
        textfield2 = new JTextField();
        textfield2.setBounds(120,40,150,20);
        add(textfield2);
        
        boton1 = new JButton("Sumar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource() == boton1) {
            int valor1 = 0, valor2 = 0, resultado = 0;
            
            valor1 = Integer.parseInt(textfield1.getText());
            valor2 = Integer.parseInt(textfield2.getText());
            
            resultado = valor1 + valor2;
            
            label3.setText("Resultado: " + resultado);
        }
    }
    
    public static void main(String args[]){
    
        Practica8 p1 = new Practica8();
        p1.setBounds(0,0,300,150);
        p1.setVisible(true);
        p1.setResizable(false);
        p1.setLocationRelativeTo(null);
        
    
    }
}


