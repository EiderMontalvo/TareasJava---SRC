package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtPrecioUnitario, txtImporteCompra, txtDescuento, txtImportePagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm18 frame = new frm18();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm18() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCantidad);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(50, 70, 120, 30);
        getContentPane().add(lblPrecioUnitario);

        JLabel lblImporteCompra = new JLabel("Importe Compra:");
        lblImporteCompra.setBounds(50, 110, 120, 30);
        getContentPane().add(lblImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblImportePagar = new JLabel("Importe a Pagar:");
        lblImportePagar.setBounds(50, 190, 120, 30);
        getContentPane().add(lblImportePagar);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(180, 30, 150, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(180, 70, 150, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioUnitario.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioUnitario);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(180, 110, 150, 30);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 150, 150, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtImportePagar = new JTextField();
        txtImportePagar.setBounds(180, 190, 150, 30);
        txtImportePagar.setFocusable(false);
        txtImportePagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImportePagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImportePagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double cantidad = Double.parseDouble(txtCantidad.getText());
        double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());

        double importeCompra = cantidad * precioUnitario;
        double primerDescuento = importeCompra * 0.15;
        double importeDespuesPrimerDescuento = importeCompra - primerDescuento;
        double segundoDescuento = importeDespuesPrimerDescuento * 0.15;
        double descuentoTotal = primerDescuento + segundoDescuento;
        double importePagar = importeCompra - descuentoTotal;

        DecimalFormat df = new DecimalFormat("###.00");

        txtImporteCompra.setText(df.format(importeCompra));
        txtDescuento.setText(df.format(descuentoTotal));
        txtImportePagar.setText(df.format(importePagar));
    }
}