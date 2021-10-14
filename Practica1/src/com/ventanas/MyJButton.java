package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJButton extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JLabel N1;
    private JTextField txtN1;
    private JLabel N2;
    private JTextField txtN2;
    private JButton sumar;
    private JTextField resultado;
    private JButton btnInfo;
    private JButton anterior;

    public MyJButton(){
        setBounds(20,20,400,350);
        setTitle("Práctica con JButton");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarTitulo();
        colocarN1();
        colocarN2();
        colocarBoton();
    }

    public void colocarPanel(){
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0,0,0));
        this.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,125,0));
        panel2.setBounds(0,0,395,40);
        panel1.add(panel2);

        anterior = new JButton("⮜");
        anterior.setToolTipText("Regresar al menu principal");
        anterior.setFont(new Font("serif",Font.BOLD,15));
        anterior.setBackground(new Color(255,125,0));
        anterior.setForeground(new Color(255,255,255));
        anterior.setBounds(0,0,50,40);
        panel2.add(anterior);

        ActionListener antes = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Principal vP = new Principal();
                vP.setVisible(true);
                dispose();
            }
        };
        anterior.addActionListener(antes);

        btnInfo = new JButton("❓");
        btnInfo.setToolTipText("Ver información del widget");
        btnInfo.setFont(new Font("serif",Font.BOLD,15));
        btnInfo.setBackground(new Color(255,125,0));
        btnInfo.setForeground(new Color(255,255,255));
        btnInfo.setBounds(335,0,50,40);
        panel2.add(btnInfo);

        ActionListener info = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Un botón es un componente en el que el usuario hace clic\npara desencadenar cierta acción. Una aplicación de Java\npuede utilizar varios tipos de botones, incluyendo botones\nde comando, casillas de verificación, botones interruptores y botones\nde opción. Los botones de comando se crean con la clase JButton");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitulo(){
        titulo = new JLabel("SUMA DE DOS NÚMEROS");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(120,5,200,30);
        panel2.add(titulo);
    }

    public void colocarN1(){
        N1 = new JLabel("Ingrese el primer número");
        N1.setForeground(new Color(255,255,255));
        N1.setBounds(30,50, 200,40);
        panel1.add(N1);

        txtN1 = new JTextField();
        txtN1.setBounds(30,85, 200,27);
        panel1.add(txtN1);

    }

    public void colocarN2(){
        N2 = new JLabel("Ingrese el segundo número");
        N2.setForeground(new Color(255,255,255));
        N2.setBounds(30,110, 200,40);
        panel1.add(N2);

        txtN2 = new JTextField();
        txtN2.setBounds(30,150,200,27);
        panel1.add(txtN2);

    }

    public void colocarBoton(){
        sumar = new JButton("Sumar");
        sumar.setForeground(new Color(255,255,255));
        sumar.setBackground(new Color(255,125,0));
        sumar.setBounds(30,190, 120,30);
        panel1.add(sumar);

        resultado = new JTextField();
        resultado.setBounds(30,240,200,27);
        resultado.setEnabled(false);
        panel1.add(resultado);

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int total = n1 + n2;
                resultado.setText(String.valueOf(total));
            }
        };

        sumar.addActionListener(oyente);
    }


}
