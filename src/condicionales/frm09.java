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

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCodigo, txtUnidades, txtImporte, txtDescuento, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm09 frame = new frm09();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(50, 30, 100, 30);
        getContentPane().add(lblCodigo);

        JLabel lblUnidades = new JLabel("Unidades:");
        lblUnidades.setBounds(50, 70, 100, 30);
        getContentPane().add(lblUnidades);

        JLabel lblImporte = new JLabel("Importe:");
        lblImporte.setBounds(50, 110, 100, 30);
        getContentPane().add(lblImporte);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 100, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(50, 190, 100, 30);
        getContentPane().add(lblTotal);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(150, 30, 150, 30);
        txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCodigo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCodigo);

        txtUnidades = new JTextField();
        txtUnidades.setBounds(150, 70, 150, 30);
        txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidades.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidades);

        txtImporte = new JTextField();
        txtImporte.setBounds(150, 110, 150, 30);
        txtImporte.setFocusable(false);
        txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporte.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporte);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(150, 150, 150, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtTotal = new JTextField();
        txtTotal.setBounds(150, 190, 150, 30);
        txtTotal.setFocusable(false);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotal);

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
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precioUnitario = 0;

        String codigo = txtCodigo.getText();
        if (codigo.equals("A")) {
            precioUnitario = 10;
        } else if (codigo.equals("B")) {
            precioUnitario = 20;
        } else if (codigo.equals("C")) {
            precioUnitario = 30;
        } else {
            txtImporte.setText("Código inválido");
            txtDescuento.setText("");
            txtTotal.setText("");
            return;
        }

        double importe = unidades * precioUnitario;
        double descuento = 0;

        if (unidades > 50) {
            descuento = importe * 0.15;
        } else {
            descuento = importe * 0.05;
        }

        double total = importe - descuento;

        txtImporte.setText(String.format("%.2f", importe));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotal.setText(String.format("%.2f", total));
    }
}