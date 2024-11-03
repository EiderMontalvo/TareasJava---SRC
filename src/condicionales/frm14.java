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

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroTarjeta, txtMontoCompra, txtDescuento, txtMontoFinal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroTarjeta = new JLabel("Número Tarjeta:");
        lblNumeroTarjeta.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumeroTarjeta);

        JLabel lblMontoCompra = new JLabel("Monto Compra:");
        lblMontoCompra.setBounds(50, 70, 120, 30);
        getContentPane().add(lblMontoCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 110, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblMontoFinal = new JLabel("Monto Final:");
        lblMontoFinal.setBounds(50, 150, 120, 30);
        getContentPane().add(lblMontoFinal);

        txtNumeroTarjeta = new JTextField();
        txtNumeroTarjeta.setBounds(180, 30, 150, 30);
        txtNumeroTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroTarjeta.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroTarjeta);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(180, 70, 150, 30);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 110, 150, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtMontoFinal = new JTextField();
        txtMontoFinal.setBounds(180, 150, 150, 30);
        txtMontoFinal.setFocusable(false);
        txtMontoFinal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoFinal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoFinal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        btnCalcular.setMnemonic( 'a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numeroTarjeta = Integer.parseInt(txtNumeroTarjeta.getText());
        double montoCompra = Double.parseDouble(txtMontoCompra.getText());
        double descuento;

        if (numeroTarjeta % 2 == 0 && numeroTarjeta >= 100) {
            descuento = montoCompra * 0.15;
        } else {
            descuento = montoCompra * 0.05;
        }

        double montoFinal = montoCompra - descuento;

        txtDescuento.setText(String.format("%.2f", descuento));
        txtMontoFinal.setText(String.format("%.2f", montoFinal));
    }
}