package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJPanel extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JLabel instruccion;
    private JButton color;
    private JPanel panelColor;
    private JButton btnInfo;
    private JButton anterior;

    public MyJPanel() {
        setBounds(20, 20, 400, 350);
        setTitle("Práctica con JLabel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }

    public void iniciarComponentes() {
        colocarPanel();
        colocarTitulo();
        colocarEtiquetas();
        colocarBoton();
    }

    public void colocarPanel() {
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0, 0, 0));
        this.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(255, 125, 0));
        panel2.setBounds(0, 0, 395, 40);
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

                JOptionPane.showMessageDialog(null, "Los JPanel en Java son una de las herramientas\nmás útiles que contiene el entorno Java, consisten en\nobjetos contenedores que a su vez agrupan otros\nobjetos tales como botones, etiquetas, selectores, campos\npara texto, entre muchos otros, lo que hace\nes facilitar la agrupación de estos elementos de una manera más");
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


    public void colocarEtiquetas(){
        instruccion = new JLabel("Dele click al siguiente botón");
        instruccion.setForeground(new Color(255,255,255));
        instruccion.setBounds(30,50, 300,40);
        panel1.add(instruccion);
    }

    public void colocarBoton(){
        color = new JButton("JPasswordField");
        color.setBackground(new Color(255,125,0));
        color.setForeground(new Color(255,255,255));
        color.setBounds(30,88,150,35);
        panel1.add(color);

        panelColor = new JPanel();
        panelColor.setBackground(new Color(255, 125, 0));
        panelColor.setBounds(30, 140, 325, 150);
        panel1.add(panelColor);

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelColor.setBackground(new Color(46, 204, 113));
            }
        };
        color.addActionListener(oyente);
    }
}
