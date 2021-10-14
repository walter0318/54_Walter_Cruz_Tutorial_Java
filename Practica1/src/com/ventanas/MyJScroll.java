package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJScroll extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JButton anterior;
    private JButton btnInfo;
    private JLabel titulo2;
    private JTextField txtTitulo;
    private JButton btnEnviar;
    private JTextArea lienso;
    private JScrollPane barra;
    String texto = "";

    public MyJScroll(){
        setBounds(20,20,600,350);
        setTitle("Práctica con JScroll");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarTitulo();
        colocarNombre();
        colocarBoton();
        colocarlienso();
    }
    public void colocarPanel(){
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0,0,0));
        this.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,125,0));
        panel2.setBounds(0,0,585,40);
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
        btnInfo.setBounds(535,0,50,40);
        panel2.add(btnInfo);

        ActionListener info = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "JScrollPane es un contenedor para componentes que necesiten\nredimensionarse a través una barra deslizable tanto\nvertical como horizontalmente, el componente no cambian\nsu tamaño original solo lo que se muestra\nal final en la pantalla.");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitulo(){
        titulo = new JLabel("ESCRITURA DE RESUMENES");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(190,5,200,30);
        panel2.add(titulo);
    }

    public void colocarNombre(){
        titulo2 = new JLabel("Ingrese el nombre del titulo");
        titulo2.setForeground(new Color(255,255,255));
        titulo2.setBounds(30,50,200,40);
        panel1.add(titulo2);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(30,90,200,28);
        panel1.add(txtTitulo);
    }

    public void colocarBoton(){
        btnEnviar = new JButton("Insertar");
        btnEnviar.setForeground(new Color(255,255,255));
        btnEnviar.setBackground(new Color(255,125,0));
        btnEnviar.setBounds(30,150,90,35);
        panel1.add(btnEnviar);

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto = txtTitulo.getText() + "\n";
                lienso.setText(texto);
                txtTitulo.setText("");
                txtTitulo.setEnabled(false);
            }
        };
        btnEnviar.addActionListener(oyente);
    }
    public void colocarlienso(){
        lienso = new JTextArea();
        barra = new JScrollPane(lienso);
        barra.setBounds(300,70,250,180);
        panel1.add(barra);
    }

}


