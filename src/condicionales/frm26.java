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

public class frm26 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoCompra, txtPrestamo, txtInteres, txtPropio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm26 frame = new frm26();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm26() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoCompra = new JLabel("Monto Compra:");
        lblMontoCompra.setBounds(50, 30, 120, 30);
        getContentPane().add(lblMontoCompra);

        JLabel lblPrestamo = new JLabel("Préstamo:");
        lblPrestamo.setBounds(50, 70, 120, 30);
        getContentPane().add(lblPrestamo);

        JLabel lblInteres = new JLabel("Interés:");
        lblInteres.setBounds(50, 110, 120, 30);
        getContentPane().add(lblInteres);

        JLabel lblPropio = new JLabel("Propio:");
        lblPropio.setBounds(50, 150, 120, 30);
        getContentPane().add(lblPropio);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(180, 30, 150, 30);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoCompra);

        txtPrestamo = new JTextField();
        txtPrestamo.setBounds(180, 70, 150, 30);
        txtPrestamo.setFocusable(false);
        txtPrestamo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrestamo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrestamo);

        txtInteres = new JTextField();
        txtInteres.setBounds(180, 110, 150, 30);
        txtInteres.setFocusable(false);
        txtInteres.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInteres.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInteres);

        txtPropio = new JTextField();
        txtPropio.setBounds(180, 150, 150, 30);
        txtPropio.setFocusable(false);
        txtPropio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPropio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPropio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double montoCompra = Double.parseDouble(txtMontoCompra.getText());
        double porcentajePrestamo = (montoCompra > 5000) ? 0.30 : 0.20;
        double prestamo = montoCompra * porcentajePrestamo;
        double interes = prestamo * 0.10;
        double propio = montoCompra - prestamo;

        txtPrestamo.setText(String.format("%.2f", prestamo));
        txtInteres.setText(String.format("%.2f", interes));
        txtPropio.setText(String.format("%.2f", propio));
    }
}