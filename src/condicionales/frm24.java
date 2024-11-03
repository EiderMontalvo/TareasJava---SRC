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

public class frm24 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido, txtSueldo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm24 frame = new frm24();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm24() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto Vendido:");
        lblMontoVendido.setBounds(50, 50, 100, 30);
        getContentPane().add(lblMontoVendido);

        JLabel lblSueldo = new JLabel("Sueldo:");
        lblSueldo.setBounds(50, 90, 100, 30);
        getContentPane().add(lblSueldo);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(160, 50, 100, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoVendido);

        txtSueldo = new JTextField();
        txtSueldo.setBounds(160, 90, 100, 30);
        txtSueldo.setFocusable(false);
        txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 130, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double sueldo = montoVendido * 0.10;

        if (montoVendido > 5000) {
            sueldo += ((montoVendido - 5000) / 500) * 25;
        }

        txtSueldo.setText(String.format("%.2f", sueldo));
    }
}