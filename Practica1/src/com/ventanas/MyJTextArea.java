package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJTextArea extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JButton anterior;
    private JButton btnInfo;
    private JLabel nombre;
    private JTextField txtNombre;
    private JLabel apellido;
    private JTextField txtApellido;
    private JButton btnEnviar;
    private JTextArea lienso;
    String texto = "";

    public MyJTextArea(){
        setBounds(20,20,600,350);
        setTitle("Práctica con JTextArea");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarTitulo();
        colocarNombre();
        colocarApellido();
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

                JOptionPane.showMessageDialog(null, "Permite mostrar o imprimir gran cantidad de texto\nen una ventana, o pedirle al usuario que lo\ningrese y realizar diversas operaciones con el.");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitulo(){
        titulo = new JLabel("INGRESO DE USUARIO");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(210,5,200,30);
        panel2.add(titulo);
    }

    public void colocarNombre(){
        nombre = new JLabel("Ingrese su nombre");
        nombre.setForeground(new Color(255,255,255));
        nombre.setBounds(30,50,200,40);
        panel1.add(nombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(30,90,200,28);
        panel1.add(txtNombre);
    }

    public void colocarApellido(){
        apellido = new JLabel("Ingrese su apellido");
        apellido.setForeground(new Color(255,255,255));
        apellido.setBounds(30,120,200,40);
        panel1.add(apellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(30,160,200,28);
        panel1.add(txtApellido);
    }
    public void colocarBoton(){
        btnEnviar = new JButton("Subir");
        btnEnviar.setForeground(new Color(255,255,255));
        btnEnviar.setBackground(new Color(255,125,0));
        btnEnviar.setBounds(30,220,90,35);
        panel1.add(btnEnviar);

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto += txtNombre.getText() + " " + txtApellido.getText() + "\n";
                lienso.setText(texto);
                txtNombre.setText("");
                txtApellido.setText("");
            }
        };
        btnEnviar.addActionListener(oyente);
    }
    public void colocarlienso(){
        lienso = new JTextArea();
        lienso.setBounds(300,70,250,180);
        panel1.add(lienso);
    }

}
