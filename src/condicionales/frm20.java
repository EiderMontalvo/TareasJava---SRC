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

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 70, 80, 30);
        getContentPane().add(lblNumero2);

        JLabel lblNumero3 = new JLabel("Número 3:");
        lblNumero3.setBounds(50, 110, 80, 30);
        getContentPane().add(lblNumero3);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 150, 80, 30);
        getContentPane().add(lblResultado);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(130, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(130, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        txtNumero3 = new JTextField();
        txtNumero3.setBounds(130, 110, 100, 30);
        txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero3);

        txtResultado = new JTextField();
        txtResultado.setBounds(130, 150, 100, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

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
        int num1 = Integer.parseInt(txtNumero1.getText());
        int num2 = Integer.parseInt(txtNumero2.getText());
        int num3 = Integer.parseInt(txtNumero3.getText());
        String resultado;

        if (num1 < num2 && num2 < num3) {
            resultado = "Ascendente";
        } else if (num1 > num2 && num2 > num3) {
            resultado = "Descendente";
        } else {
            resultado = "Desorden";
        }

        txtResultado.setText(resultado);
    }
}