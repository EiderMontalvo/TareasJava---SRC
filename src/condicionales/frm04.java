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

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNota1, txtNota2, txtNota3, txtPromedioFinal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
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

        JLabel lblPromedioFinal = new JLabel("Promedio Final:");
        lblPromedioFinal.setBounds(50, 150, 100, 30);
        getContentPane().add(lblPromedioFinal);

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

        txtPromedioFinal = new JTextField();
        txtPromedioFinal.setBounds(160, 150, 60, 30);
        txtPromedioFinal.setFocusable(false);
        txtPromedioFinal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedioFinal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedioFinal);

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

        if (nota3 >= 10) {
            nota3 += 2;
        }

        double promedioFinal = (nota1 + nota2 + nota3) / 3;

        txtPromedioFinal.setText(String.format("%.2f", promedioFinal));
    }
}