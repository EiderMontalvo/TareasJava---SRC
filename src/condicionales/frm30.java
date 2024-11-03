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

public class frm30 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCuotaMensual, txtDiaPago, txtMontoPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm30 frame = new frm30();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm30() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuotaMensual = new JLabel("Cuota Mensual:");
        lblCuotaMensual.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCuotaMensual);

        JLabel lblDiaPago = new JLabel("Día de Pago:");
        lblDiaPago.setBounds(50, 70, 120, 30);
        getContentPane().add(lblDiaPago);

        JLabel lblMontoPagar = new JLabel("Monto a Pagar:");
        lblMontoPagar.setBounds(50, 110, 120, 30);
        getContentPane().add(lblMontoPagar);

        txtCuotaMensual = new JTextField();
        txtCuotaMensual.setBounds(180, 30, 150, 30);
        txtCuotaMensual.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCuotaMensual.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCuotaMensual);

        txtDiaPago = new JTextField();
        txtDiaPago.setBounds(180, 70, 150, 30);
        txtDiaPago.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDiaPago.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDiaPago);

        txtMontoPagar = new JTextField();
        txtMontoPagar.setBounds(180, 110, 150, 30);
        txtMontoPagar.setFocusable(false);
        txtMontoPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 150, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double cuotaMensual = Double.parseDouble(txtCuotaMensual.getText());
        int diaPago = Integer.parseInt(txtDiaPago.getText());
        double montoPagar;

        if (diaPago <= 10) {
            double descuento = Math.max(5, cuotaMensual * 0.02);
            montoPagar = cuotaMensual - descuento;
        } else if (diaPago <= 20) {
            montoPagar = cuotaMensual;
        } else {
            double recargo = Math.max(10, cuotaMensual * 0.03);
            montoPagar = cuotaMensual + recargo;
        }

        txtMontoPagar.setText(String.format("%.2f", montoPagar));
    }
}