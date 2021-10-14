package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJLabel extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JButton btnInfo;
    private JButton anterior;
    private JLabel info1;

    public MyJLabel(){
        setBounds(20,20,460,350);
        setTitle("Práctica con JLabel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarTitulo();
        colocarInfo();
    }

    public void colocarPanel(){
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0,0,0));
        this.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,125,0));
        panel2.setBounds(0,0,445,40);
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
        btnInfo.setBounds(395,0,50,40);
        panel2.add(btnInfo);

        ActionListener info = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Es uno de los widgets más utilizados\nen interfaces, su función es poder agregar\nimágenes e íconos de una manera más fácil.");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitulo(){
        titulo = new JLabel("INTERPRETACIÓN DE LOS jLABEL");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(125,5,250,30);
        panel2.add(titulo);
    }

    public void colocarInfo(){
        info1 = new JLabel("");
        info1.setText("<html>Los JLabel son textos que podemos colocar en un Frame, pero además de textos podemos colocar imágenes (animadas o no) para darle una buena presentación a nuestra ventana, los JLabel a mi parecer son esenciales al momento de crear una interfaz de usuario.<html>");
        info1.setLayout(null);
        info1.setForeground(new Color(255,255,255));
        info1.setBounds(30,80,395,100);
        panel1.add(info1);
    }
}
