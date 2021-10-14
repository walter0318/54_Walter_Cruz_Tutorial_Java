package com.ventanas;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJSpinner extends JFrame {
    private JLabel titulo;
    private JSpinner spinner;
    private JPanel panel1;
    private JPanel panel2;
    private JButton btnInfo;
    private JButton anterior;
    private JLabel impresion;
    private JLabel etiqueta;
    private JButton boton;

    public MyJSpinner(){
        setBounds(20,20,400,350);
        setTitle("Práctica con JSpinner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarTitutlo();
        colocarSpinner();
        colocaretiqueta();
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

                JOptionPane.showMessageDialog(null, "La clase JSpinner nos permite crear cuadros como el\nsiguiente: Estos elementos son muy comunes en los programas.\nA través de los dos botones triangulares se puede hacer\nque el valor del cuadro aumente o disminuya. También se\npuede escribir directamente un valor dentro del cuadro");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitutlo(){
        titulo = new JLabel("VERIFICACIÓN DE EDAD INGRESADA");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(82,5,230,30);
        panel2.add(titulo);
    }

    public void colocaretiqueta(){
        etiqueta = new JLabel("Ingrese su edad  corresspondiente");
        etiqueta.setForeground(new Color(255,255,255));
        etiqueta.setBounds(30,50,540,40);
        panel1.add(etiqueta);
    }
    public void colocarSpinner(){
        spinner = new JSpinner();
        spinner.setBackground(new Color(255,125,0));
        spinner.setBounds(30,95,90,28);
        panel1.add(spinner);



    }
    public void colocarBoton(){
        boton = new JButton("Verificar");
        boton.setBackground(new Color(255,125,0));
        boton.setForeground(new Color(255,255,255));;
        boton.setBounds(30,140,90,28);
        panel1.add(boton);

        impresion = new JLabel("");
        impresion.setForeground(new Color(255,255,255));
        impresion.setFont(new Font("arial",Font.PLAIN, 19));
        impresion.setBounds(30,190,540,28);
        panel1.add(impresion);

        ActionListener leer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = (int) spinner.getValue();
                if (numero>0 && numero<5){
                    impresion.setText("Usted pertence a la primera infancia");
                }else if (numero<11){
                    impresion.setText("Usted pertence a la infancia");
                }else if (numero<18){
                    impresion.setText("Usted pertence a la adolescencia");
                }else if (numero<26){
                    impresion.setText("Usted pertence a la juventud");
                }else if (numero<59){
                    impresion.setText("Usted pertence a la adultez");
                }else if (numero>=60){
                    impresion.setText("Usted pertence a la vejez");
                }
            }
        };
        boton.addActionListener(leer);
    }
}
