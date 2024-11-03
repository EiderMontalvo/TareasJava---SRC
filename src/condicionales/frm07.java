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

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtIntermedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm07() {
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

        JLabel lblIntermedio = new JLabel("Intermedio:");
        lblIntermedio.setBounds(50, 150, 80, 30);
        getContentPane().add(lblIntermedio);

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

        txtIntermedio = new JTextField();
        txtIntermedio.setBounds(130, 150, 100, 30);
        txtIntermedio.setFocusable(false);
        txtIntermedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtIntermedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtIntermedio);

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

        int intermedio = num1 + num2 + num3 - Math.max(Math.max(num1, num2), num3) - Math.min(Math.min(num1, num2), num3);

        txtIntermedio.setText(String.valueOf(intermedio));
    }
}
