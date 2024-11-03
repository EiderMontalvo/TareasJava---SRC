package condicionales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class frm02 extends JFrame {
    private JTextField txtCantidad, txtImporteCompra, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm02 frame = new frm02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCantidad);

        JLabel lblImporteCompra = new JLabel("Importe Compra:");
        lblImporteCompra.setBounds(50, 70, 120, 30);
        getContentPane().add(lblImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 110, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setBounds(50, 150, 120, 30);
        getContentPane().add(lblTotalPagar);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(180, 30, 150, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(180, 70, 150, 30);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 110, 150, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(180, 150, 150, 30);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    protected void calcular() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioUnitario = 0;

        if (cantidad >= 1 && cantidad <= 25) {
            precioUnitario = 27;
        } else if (cantidad >= 26 && cantidad <= 50) {
            precioUnitario = 25;
        } else if (cantidad >= 51) {
            precioUnitario = 23;
        }

        double importeCompra = cantidad * precioUnitario;
        double descuento = 0;

        if (cantidad > 50) {
            descuento = importeCompra * 0.15;
        } else {
            descuento = importeCompra * 0.05;
        }

        double totalPagar = importeCompra - descuento;

        DecimalFormat df = new DecimalFormat("###.00");

        txtImporteCompra.setText(df.format(importeCompra));
        txtDescuento.setText(df.format(descuento));
        txtTotalPagar.setText(df.format(totalPagar));
    }
}