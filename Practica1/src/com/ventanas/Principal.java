package com.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Principal extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titulo;
    private JButton venJPasswordField;
    private JButton venJRadioButton;
    private JButton venJCheckBox;
    private JButton venJScroll;
    private JButton venJSpinner;
    private JButton venJTextArea;
    private JButton venJLabel;
    private JButton venJButton;
    private JButton venJSlider;
    private JButton venJPanel;
    private JButton btnInfo;

    public Principal(){
        setBounds(20,20,550,380);
        setTitle("Práctica con JRadioButton");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setResizable(false);
    }

    public void iniciarComponentes(){
        colocarPanel();
        colocarTitulo();
        colocarJPasswordField();
        colocarJRadioButton();
        colocarJCheckBox();
        colocarJScroll();
        colocarJSpinner();
        colocarJTextTarea();
        colocarJLabel();
        colocarJButton();
        colocarJSlider();
        colocarJPanel();
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

        btnInfo = new JButton("❓");
        btnInfo.setToolTipText("Información del tutorial");
        btnInfo.setFont(new Font("serif",Font.BOLD,15));
        btnInfo.setBackground(new Color(255,125,0));
        btnInfo.setForeground(new Color(255,255,255));
        btnInfo.setBounds(485,0,50,40);
        panel2.add(btnInfo);

        ActionListener info = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Este tutorial de java fue realizado para mejorar\nlos conocimientos que ya hemos adquirido durante el\nproceso de aprendizaje, en este tutorial encontrarás\n10 de los widgets más utilizados en interfaces gráficas.");
            }
        };
        btnInfo.addActionListener(info);
    }

    public void colocarTitulo(){
        titulo = new JLabel("TUTORIAL DE WIDGETS DE JAVA");
        titulo.setForeground(new Color(255,255,255));
        titulo.setBounds(150,5,200,30);
        panel2.add(titulo);
    }


    public void colocarJPasswordField(){

        venJPasswordField = new JButton("JPasswordField");
        venJPasswordField.setBackground(new Color(255,125,0));
        venJPasswordField.setForeground(new Color(255,255,255));
        venJPasswordField.setBounds(30,80,150,40);
        panel1.add(venJPasswordField);

        ActionListener ventanaPss = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJPasswordField v2 = new MyJPasswordField();
                v2.setVisible(true);
                dispose();
            }
        };
        venJPasswordField.addActionListener(ventanaPss);
    }

    public void colocarJRadioButton(){
        venJRadioButton = new JButton("JRadioButton");
        venJRadioButton.setBackground(new Color(255,125,0));
        venJRadioButton.setForeground(new Color(255,255,255));
        venJRadioButton.setBounds(190,80,150,40);
        panel1.add(venJRadioButton);

        ActionListener ventanaP = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJRadioButton v1 = new MyJRadioButton();
                v1.setVisible(true);
                dispose();
            }
        };
        venJRadioButton.addActionListener(ventanaP);
    }

    public void colocarJCheckBox(){
        venJCheckBox = new JButton("JCheckBox");
        venJCheckBox.setBackground(new Color(255,125,0));
        venJCheckBox.setForeground(new Color(255,255,255));
        venJCheckBox.setBounds(350,80,150,40);
        panel1.add(venJCheckBox);

        ActionListener ventanaJCheck = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJCheckBox vC = new MyJCheckBox();
                vC.setVisible(true);
                dispose();
            }
        };
        venJCheckBox.addActionListener(ventanaJCheck);
    }

    public void colocarJScroll(){
        venJScroll = new JButton("JScroll");
        venJScroll.setBackground(new Color(255,125,0));
        venJScroll.setForeground(new Color(255,255,255));
        venJScroll.setBounds(30,140,150,40);
        panel1.add(venJScroll);

        ActionListener ventanaJScroll = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJScroll vSc = new MyJScroll();
                vSc.setVisible(true);
                dispose();
            }
        };
        venJScroll.addActionListener(ventanaJScroll);
    }

    public void colocarJSpinner(){
        venJSpinner= new JButton("JSpinner");
        venJSpinner.setBackground(new Color(255,125,0));
        venJSpinner.setForeground(new Color(255,255,255));
        venJSpinner.setBounds(190,140,150,40);
        panel1.add(venJSpinner);

        ActionListener ventanaJSpinner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJSpinner vSp = new MyJSpinner();
                vSp.setVisible(true);
                dispose();
            }
        };
        venJSpinner.addActionListener(ventanaJSpinner);
    }

    public void colocarJTextTarea(){
        venJTextArea = new JButton("JTextArea");
        venJTextArea.setBackground(new Color(255,125,0));
        venJTextArea.setForeground(new Color(255,255,255));
        venJTextArea.setBounds(350,140,150,40);
        panel1.add(venJTextArea);

        ActionListener ventanaJText = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJTextArea vT = new MyJTextArea();
                vT.setVisible(true);
                dispose();
            }
        };
        venJTextArea.addActionListener(ventanaJText);
    }

    public void colocarJLabel(){
        venJLabel = new JButton("JLabel");
        venJLabel.setBackground(new Color(255,125,0));
        venJLabel.setForeground(new Color(255,255,255));
        venJLabel.setBounds(30,200,150,40);
        panel1.add(venJLabel);

        ActionListener ventanaJLabel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJLabel vL  = new MyJLabel();
                vL.setVisible(true);
                dispose();
            }
        };
        venJLabel.addActionListener(ventanaJLabel);
    }

    public void colocarJButton(){
        venJButton = new JButton("JButton");
        venJButton.setBackground(new Color(255,125,0));
        venJButton.setForeground(new Color(255,255,255));
        venJButton.setBounds(190,200,150,40);
        panel1.add(venJButton);

        ActionListener ventanaJButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJButton Vb = new MyJButton();
                Vb.setVisible(true);
                dispose();
            }
        };
        venJButton.addActionListener(ventanaJButton);
    }

    public void colocarJSlider(){
        venJSlider = new JButton("JSlider");
        venJSlider.setBackground(new Color(255,125,0));
        venJSlider.setForeground(new Color(255,255,255));
        venJSlider.setBounds(350,200,150,40);
        panel1.add(venJSlider);

        ActionListener ventanaJSlider = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJSlider vS = new MyJSlider();
                vS.setVisible(true);
                dispose();
            }
        };
        venJSlider.addActionListener(ventanaJSlider);
    }

    public void colocarJPanel(){
        venJPanel = new JButton("JPanel");
        venJPanel.setBackground(new Color(255,125,0));
        venJPanel.setForeground(new Color(255,255,255));
        venJPanel.setBounds(190,260,150,40);
        panel1.add(venJPanel);

        ActionListener ventanaJPanel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJPanel vPa = new MyJPanel();
                vPa.setVisible(true);
                dispose();
            }
        };
        venJPanel.addActionListener(ventanaJPanel);
    }
}
