
package prácticas;

import javax.swing.*;
import java.awt.event.*;
public class Practica7 extends JFrame implements ActionListener{
    
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    
    public Practica7 (){
        setLayout(null);
        label1 = new JLabel("Usuario:");
        label1.setBounds(10,10,100,30);
        add(label1);
        
        textfield1 = new JTextField();
        textfield1.setBounds(120,17,150,20);
        add(textfield1);
        
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1) {
            String texto = textfield1.getText();
            setTitle(texto);
        }
    }
    public static void main(String args[]){
    
    Practica7 pa1 = new Practica7();
    pa1.setBounds(0,0,300,150);
    pa1.setVisible(true);
    pa1.setResizable(false);
    pa1.setLocationRelativeTo(null);
    
}
}

