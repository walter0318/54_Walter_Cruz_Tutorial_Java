package com.ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJCheckBox extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JButton anterior;
    private JButton btnInfo;
    private JLabel nombre;
    private JTextField txtnombre;
    private JCheckBox check1;
    private JCheckBox check2;
    private JCheckBox check3;
    private JCheckBox check4;
    private JButton mostrar;

    public MyJCheckBox() {
        setBounds(20, 20, 400, 310);
        setTitle("Práctica con JCheckBox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        startc();
        setResizable(false);
    }

    public void startc() {
        colocarPanel();
        colocarTitulo();
        colocarBotones();
        colocarBoton();
    }

    public void colocarPanel() {
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0, 0, 0));
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

                JOptionPane.showMessageDialog(null, "El control JCheckBox permite implementar un cuadro de selección\n(básicamente un botón de dos estados). Ejemplo: Crear un programa\nque muestre 3 objetos de la clase JCheckBox con etiquetas de tres\nidiomas y mostrar en un JLabel los idiomas seleccionados.\nOtro control visual muy común es el JRadioButton");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitulo(){
        titulo = new JLabel("LISTADO DE IDIOMAS");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(130,5,200,30);
        panel2.add(titulo);
    }



    public void colocarBotones() {

        JLabel etiqueta2 = new JLabel("Elige los idiomas que quieres estudiar:");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setBounds(30, 50, 250, 30);
        panel1.add(etiqueta2);

        check1 = new JCheckBox("Español");
        check1.setBackground(new Color(0, 0, 0));
        check1.setForeground(new Color(255, 255, 255));
        check1.setBounds(30, 90, 90, 40);
        panel1.add(check1);

        check2 = new JCheckBox("Mandarin");
        check2.setBackground(new Color(0, 0, 0));
        check2.setForeground(new Color(255, 255, 255));
        check2.setBounds(30, 120, 90, 40);
        panel1.add(check2);

        check3 = new JCheckBox("Italiano");
        check3.setBackground(new Color(0, 0, 0));
        check3.setForeground(new Color(255, 255, 255));
        check3.setBounds(140, 90, 90, 40);
        panel1.add(check3);

        check4 = new JCheckBox("Ingles");
        check4.setBackground(new Color(0, 0, 0));
        check4.setForeground(new Color(255, 255, 255));
        check4.setBounds(140, 120, 90, 40);
        panel1.add(check4);

    }
    public void colocarBoton(){
        mostrar = new JButton("Mostrar");
        mostrar.setBackground(new Color(255, 125, 0));
        mostrar.setForeground(new Color(255, 255, 255));
        mostrar.setBounds(30, 180, 90, 32);
        panel1.add(mostrar);


        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idioma = "";
                if (check1.isSelected()){
                    idioma += "Español\n";
                }
                if (check2.isSelected()){
                    idioma += "Mandarin\n";
                }
                if (check3.isSelected()){
                    idioma += "Italino\n";
                }
                if (check4.isSelected()){
                    idioma += "Ingles\n";
                }
                JOptionPane.showMessageDialog(null, "Los idiomas que selecciono son:\n" + idioma );
            }
        };
        mostrar.addActionListener(oyente);
    }
}
