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

public class frm32 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCategoria, txtPromedio, txtPensionActual, txtDescuento, txtNuevaPension;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm32 frame = new frm32();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm32() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCategoria);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(50, 70, 120, 30);
        getContentPane().add(lblPromedio);

        JLabel lblPensionActual = new JLabel("Pensión Actual:");
        lblPensionActual.setBounds(50, 110, 120, 30);
        getContentPane().add(lblPensionActual);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblNuevaPension = new JLabel("Nueva Pensión:");
        lblNuevaPension.setBounds(50, 190, 120, 30);
        getContentPane().add(lblNuevaPension);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(180, 30, 150, 30);
        txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCategoria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCategoria);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(180, 70, 150, 30);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedio);

        txtPensionActual = new JTextField();
        txtPensionActual.setBounds(180, 110, 150, 30);
        txtPensionActual.setFocusable(false);
        txtPensionActual.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPensionActual.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPensionActual);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 150, 150, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtNuevaPension = new JTextField();
        txtNuevaPension.setBounds(180, 190, 150, 30);
        txtNuevaPension.setFocusable(false);
        txtNuevaPension.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNuevaPension.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNuevaPension);

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
        String categoria = txtCategoria.getText().toUpperCase();
        double promedio = Double.parseDouble(txtPromedio.getText());
        double pensionActual;
        double descuento = 0;

        switch (categoria) {
            case "A":
                pensionActual = 550.00;
                break;
            case "B":
                pensionActual = 500.00;
                if (promedio >= 14 && promedio <= 15.99) {
                    descuento = pensionActual * 0.10;
                }
                break;
            case "C":
                pensionActual = 450.00;
                if (promedio >= 16 && promedio <= 17.99) {
                    descuento = pensionActual * 0.12;
                }
                break;
            case "D":
                pensionActual = 400.00;
                if (promedio >= 18 && promedio <= 20) {
                    descuento = pensionActual * 0.15;
                }
                break;
            default:
                txtPensionActual.setText("Categoría inválida");
                txtDescuento.setText("");
                txtNuevaPension.setText("");
                return;
        }

        double nuevaPension = pensionActual - descuento;

        txtPensionActual.setText(String.format("%.2f", pensionActual));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtNuevaPension.setText(String.format("%.2f", nuevaPension));
    }
}