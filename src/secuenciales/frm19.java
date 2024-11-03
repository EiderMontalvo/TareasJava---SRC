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

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido, txtComision, txtSueldoBruto, txtDescuento, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto Vendido:");
        lblMontoVendido.setBounds(50, 30, 120, 30);
        getContentPane().add(lblMontoVendido);

        JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 70, 120, 30);
        getContentPane().add(lblComision);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 110, 120, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 190, 120, 30);
        getContentPane().add(lblSueldoNeto);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(180, 30, 150, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoVendido);

        txtComision = new JTextField();
        txtComision.setBounds(180, 70, 150, 30);
        txtComision.setFocusable(false);
        txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
        txtComision.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtComision);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(180, 110, 150, 30);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 150, 150, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(180, 190, 150, 30);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoNeto);

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
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double sueldoBasico = 500.0;
        double comision = montoVendido * 0.09;
        double sueldoBruto = sueldoBasico + comision;
        double descuento = sueldoBruto * 0.11;
        double sueldoNeto = sueldoBruto - descuento;

        DecimalFormat df = new DecimalFormat("###.00");

        txtComision.setText(df.format(comision));
        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtDescuento.setText(df.format(descuento));
        txtSueldoNeto.setText(df.format(sueldoNeto));
    }
}