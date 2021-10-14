package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJRadioButton extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JLabel saludo;
    private JLabel titulo2;
    private JTextField cajaTexto;
    private JRadioButton azul;
    private JRadioButton rojo;
    private JRadioButton verde;
    private ButtonGroup group;
    private JButton btnInfo;
    private JButton anterior;


    public MyJRadioButton(){
        setBounds(20,20,400,350);
        setTitle("Práctica con JRadioButton");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }

    public void iniciarComponentes(){
        colocarPanel();
        colocarPanel2();
        colocarTitulo();
        colocarEtiqueta();
        colocarCajaTexto();
        colocarBoton();
        colocarTitulo2();
    }

    public void colocarPanel(){
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0,0,0));
        this.add(panel1);
    }

    public void colocarPanel2(){
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,125,0));
        panel2.setBounds(0,0,390,40);
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

                JOptionPane.showMessageDialog(null, "Conocido también como botón de opción o botón de\nradio es un tipo de widget utilizado en interfaces\ngráficas de usuario que permite elegir una sola opción\nde un conjunto predeterminado de estas.");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitulo(){
        titulo = new JLabel("ELECCIÓN DE COLORES");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(110,5,200,30);
        panel2.add(titulo);
    }

    public void colocarTitulo2(){
        titulo2 = new JLabel("Color de preferencia");
        titulo2.setBackground(new Color(255,125,0));
        titulo2.setForeground(new Color(255,255,255));
        titulo2.setFont(new Font("Arial",1,20));
        panel2.add(titulo2);
    }

    public void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("INGRESE SU NOMBRE");
        etiqueta.setForeground(new Color(255,255,255));
        etiqueta.setBounds(30,65,200,30);
        panel1.add(etiqueta);
    }

    public void colocarCajaTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30,100,300,30);
        panel1.add(cajaTexto);
    }

    public void colocarBoton(){

        azul = new JRadioButton("COLOR AZUL!!");
        azul.setBackground(new Color(0,0,0));
        azul.setForeground(new Color(255,255,255));
        azul.setBounds(30,140,150,40);
        panel1.add(azul);

        rojo = new JRadioButton("COLOR ROJO!!");
        rojo.setBackground(new Color(0,0,0));
        rojo.setForeground(new Color(255,255,255));
        rojo.setBounds(30,170,150,40);
        panel1.add(rojo);

        verde = new JRadioButton("COLOR VERDE!!");
        verde.setForeground(new Color(255,255,255));
        verde.setBackground(new Color(0,0,0));
        verde.setBounds(30,200,150,40);
        panel1.add(verde);

        group = new ButtonGroup();
        group.add(azul);
        group.add(rojo);
        group.add(verde);

        saludo = new JLabel();
        saludo.setBounds(30,240,320,40);
        saludo.setFont(new Font("Arial",1,18));
        panel1.add(saludo);

        ActionListener colorAzul = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setForeground(new Color(2,20,150));
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };

        ActionListener colorRojo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setForeground(new Color(255,0,0));
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };

        ActionListener colorVerde = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setForeground(new Color(4, 125, 55));
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };

        azul.addActionListener(colorAzul);
        rojo.addActionListener(colorRojo);
        verde.addActionListener(colorVerde);

    }


}

