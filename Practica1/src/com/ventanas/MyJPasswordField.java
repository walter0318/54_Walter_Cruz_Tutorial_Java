package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJPasswordField extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JLabel usuario;
    private JTextField txtUsuario;
    private JLabel contraseña;
    private JPasswordField txtPassword;
    private JButton enviar;
    private JButton btnInfo;
    private JButton anterior;


    public MyJPasswordField(){
        setBounds(20,20,400,350);
        setTitle("Práctica con JPasswordField");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }

    public void iniciarComponentes(){
        colocarPanel();
        colocarTitutlo();
        colocarUsuario();
        colocaretiqueta();
        colocarButton();

    }

    public void colocarPanel() {
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0,0,0));
        this.add(panel1);

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

                JOptionPane.showMessageDialog(null, "Cuando vamos a escribir una contraseña o alguna\notra palabra que deseamos que no aparezca visualmente\nen el campo sino más bien algún caracter\n(lo más común son unos puntitos), existe lo\nllamado JPasswordField.");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitutlo(){
        titulo = new JLabel("VERIFICACIÓN DE CONTRASEÑA");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(95,5,200,30);
        panel2.add(titulo);
    }

    public void colocarUsuario(){
        usuario = new JLabel("INGRESE SU USUARIO");
        usuario.setForeground(new Color(255,255,255));
        usuario.setBounds(30,55,200,30);
        panel1.add(usuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(30,90,300,30);
        panel1.add(txtUsuario);
    }

    public void colocaretiqueta(){
        contraseña = new JLabel("INGRESE SU CONTRASEÑA");
        contraseña.setBackground(new Color(0,0,0));
        contraseña.setForeground(new Color(255,255,255));
        contraseña.setBounds(30,120,250,40);
        panel1.add(contraseña);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(30,155,300,30);
        panel1.add(txtPassword);
    }

    public void colocarButton(){
        enviar = new JButton("ENVIAR");
        enviar.setBackground(new Color(255,125,0));
        enviar.setForeground(new Color(255,255,255));
        enviar.setBounds(30,200,100,40);
        panel1.add(enviar);


        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] texto = txtPassword.getPassword();
                int longitud = texto.length;
                if (longitud < 8){
                    JOptionPane.showMessageDialog(null,"Su contraseña tiene que ser mayor a 8 caracteres");
                }else {
                    JOptionPane.showMessageDialog(null,"Bienvenido");
                }
            }
        };

        enviar.addActionListener(oyente);
    }


}
