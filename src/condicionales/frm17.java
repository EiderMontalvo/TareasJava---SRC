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

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidadDocenas, txtPrecioDocena, txtMontoCompra, txtDescuento, txtTotalPagar, txtLapiceros;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm17 frame = new frm17();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidadDocenas = new JLabel("Cantidad Docenas:");
        lblCantidadDocenas.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCantidadDocenas);

        JLabel lblPrecioDocena = new JLabel("Precio por Docena:");
        lblPrecioDocena.setBounds(50, 70, 120, 30);
        getContentPane().add(lblPrecioDocena);

        JLabel lblMontoCompra = new JLabel("Monto Compra:");
        lblMontoCompra.setBounds(50, 110, 120, 30);
        getContentPane().add(lblMontoCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setBounds(50, 190, 120, 30);
        getContentPane().add(lblTotalPagar);

        JLabel lblLapiceros = new JLabel("Lapiceros:");
        lblLapiceros.setBounds(50, 230, 120, 30);
        getContentPane().add(lblLapiceros);

        txtCantidadDocenas = new JTextField();
        txtCantidadDocenas.setBounds(180, 30, 150, 30);
        txtCantidadDocenas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidadDocenas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidadDocenas);

        txtPrecioDocena = new JTextField();
        txtPrecioDocena.setBounds(180, 70, 150, 30);
        txtPrecioDocena.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioDocena.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioDocena);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(180, 110, 150, 30);
        txtMontoCompra.setFocusable(false);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 150, 150, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(180, 190, 150, 30);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(180, 230, 150, 30);
        txtLapiceros.setFocusable(false);
        txtLapiceros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtLapiceros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtLapiceros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 270, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cantidadDocenas = Integer.parseInt(txtCantidadDocenas.getText());
        double precioDocena = Double.parseDouble(txtPrecioDocena.getText());
        double montoCompra = cantidadDocenas * precioDocena;
        double descuento;
        int lapiceros = 0;

        if (cantidadDocenas >= 6) {
            descuento = montoCompra * 0.15;
        } else {
            descuento = montoCompra * 0.10;
        }

        if (cantidadDocenas >= 30) {
            lapiceros = (cantidadDocenas / 3) * 2;
        }

        double totalPagar = montoCompra - descuento;

        txtMontoCompra.setText(String.format("%.2f", montoCompra));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotalPagar.setText(String.format("%.2f", totalPagar));
        txtLapiceros.setText(String.valueOf(lapiceros));
    }
}