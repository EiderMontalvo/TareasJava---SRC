package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNota1, txtNota2, txtNota3, txtNota4, txtNota5, txtNotaMayor, txtNotaMenor, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblNota1);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(50, 70, 80, 30);
        getContentPane().add(lblNota2);

        JLabel lblNota3 = new JLabel("Nota 3:");
        lblNota3.setBounds(50, 110, 80, 30);
        getContentPane().add(lblNota3);

        JLabel lblNota4 = new JLabel("Nota 4:");
        lblNota4.setBounds(50, 150, 80, 30);
        getContentPane().add(lblNota4);

        JLabel lblNota5 = new JLabel("Nota 5:");
        lblNota5.setBounds(50, 190, 80, 30);
        getContentPane().add(lblNota5);

        JLabel lblNotaMayor = new JLabel("Nota Mayor:");
        lblNotaMayor.setBounds(50, 230, 80, 30);
        getContentPane().add(lblNotaMayor);

        JLabel lblNotaMenor = new JLabel("Nota Menor:");
        lblNotaMenor.setBounds(50, 270, 80, 30);
        getContentPane().add(lblNotaMenor);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(50, 310, 80, 30);
        getContentPane().add(lblPromedio);

        txtNota1 = new JTextField();
        txtNota1.setBounds(150, 30, 100, 30);
        txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota1);

        txtNota2 = new JTextField();
        txtNota2.setBounds(150, 70, 100, 30);
        txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota2);

        txtNota3 = new JTextField();
        txtNota3.setBounds(150, 110, 100, 30);
        txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota3);

        txtNota4 = new JTextField();
        txtNota4.setBounds(150, 150, 100, 30);
        txtNota4.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota4.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota4);

        txtNota5 = new JTextField();
        txtNota5.setBounds(150, 190, 100, 30);
        txtNota5.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota5.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota5);

        txtNotaMayor = new JTextField();
        txtNotaMayor.setBounds(150, 230, 100, 30);
        txtNotaMayor.setFocusable(false);
        txtNotaMayor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaMayor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNotaMayor);

        txtNotaMenor = new JTextField();
        txtNotaMenor.setBounds(150, 270, 100, 30);
        txtNotaMenor.setFocusable(false);
        txtNotaMenor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaMenor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNotaMenor);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(150, 310, 100, 30);
        txtPromedio.setFocusable(false);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 350, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());
        double nota3 = Double.parseDouble(txtNota3.getText());
        double nota4 = Double.parseDouble(txtNota4.getText());
        double nota5 = Double.parseDouble(txtNota5.getText());

        double[] notas = {nota1, nota2, nota3, nota4, nota5};
        Arrays.sort(notas);

        double notaMenor = notas[0];
        double notaMayor = notas[4];
        double promedio = (notas[1] + notas[2] + notas[3]) / 3;

        txtNotaMayor.setText(String.valueOf(notaMayor));
        txtNotaMenor.setText(String.valueOf(notaMenor));
        txtPromedio.setText(String.format("%.2f", promedio));
    }
}