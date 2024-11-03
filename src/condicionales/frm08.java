package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNota1, txtNota2, txtNota3, txtPropinaTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
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

        JLabel lblPropinaTotal = new JLabel("Propina Total:");
        lblPropinaTotal.setBounds(50, 150, 100, 30);
        getContentPane().add(lblPropinaTotal);

        txtNota1 = new JTextField();
        txtNota1.setBounds(160, 30, 60, 30);
        txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota1);

        txtNota2 = new JTextField();
        txtNota2.setBounds(160, 70, 60, 30);
        txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota2);

        txtNota3 = new JTextField();
        txtNota3.setBounds(160, 110, 60, 30);
        txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota3);

        txtPropinaTotal = new JTextField();
        txtPropinaTotal.setBounds(160, 150, 60, 30);
        txtPropinaTotal.setFocusable(false);
        txtPropinaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPropinaTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPropinaTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 190, 100, 30);
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

        int propinaBase = 20;
        int propinaAdicional = 0;

        if (nota1 >= 10) {
            propinaAdicional += 5;
        }
        if (nota2 >= 10) {
            propinaAdicional += 5;
        }
        if (nota3 >= 10) {
            propinaAdicional += 5;
        }

        int propinaTotal = propinaBase + propinaAdicional;

        txtPropinaTotal.setText(String.valueOf(propinaTotal));
    }
}