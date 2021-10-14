package com.ventanas;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJSlider extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JSlider control;
    private JLabel nombre;
    private JTextField txtnombre;
    private JLabel tamaño;
    private JLabel saludo;
    private JButton enviar;
    private JButton btnInfo;
    private JButton anterior;

    public MyJSlider(){
        setBounds(20,20,550,380);
        setTitle("Práctica con JSlider");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarTitutlo();
        colocarSlider();
        colocarSaludo();
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
        panel2.setBounds(0,0,540,40);
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
        btnInfo.setBounds(485,0,50,40);
        panel2.add(btnInfo);

        ActionListener info = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Se utiliza un JSlider para permitir que el\nusuario introduzca un valor numérico limitado por una\nvalor máximo y un valor mínimo. Mediante la utilización\nde un Slider en vez de text field, se eliminan\nerrores de entrada.");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitutlo(){
        titulo = new JLabel("TAMAÑO DEL TEXTO INGRESADO");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(155,5,250,30);
        panel2.add(titulo);
    }

    public void colocarSaludo(){
        nombre = new JLabel("Ingrese su nombre");
        nombre.setForeground(new Color(255,255,255));
        nombre.setBounds(30,50,540,40);
        panel1.add(nombre);

        txtnombre = new JTextField();
        txtnombre.setBounds(30,85,300,28);
        panel1.add(txtnombre);
    }

    private void colocarBoton(){
        enviar = new JButton("ENVIAR");
        enviar.setBackground(new Color(255,125,0));
        enviar.setForeground(new Color(255,255,255));
        enviar.setBounds(380,83,90,34);
        panel1.add(enviar);

        saludo = new JLabel();
        saludo.setBounds(30,200,400,40);
        saludo.setForeground(new Color(255,125,0));
        saludo.setFont(new Font("serif",1,18));
        panel1.add(saludo);


        ActionListener oyentes = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText(txtnombre.getText());
            }
        };

        enviar.addActionListener(oyentes);
    }


    private void colocarSlider(){
        tamaño = new JLabel("Elija el tamaño del texto");
        tamaño.setForeground(new Color(255,255,255));
        tamaño.setBounds(30,110,540,40);
        panel1.add(tamaño);

        control = new JSlider(8,40,11);
        control.setBounds(30,150,200,20);
        control.setBackground(new Color(0,0,0));
        panel1.add(control);

        ChangeListener oyente = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                saludo.setFont(new Font("serif", Font.PLAIN, control.getValue()));
            }
        };

        control.addChangeListener(oyente);
    }


}
