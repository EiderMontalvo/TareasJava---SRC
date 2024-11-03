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

public class frm25 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSueldoBruto, txtCantidadHijos, txtBonificacion, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm25 frame = new frm25();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm25() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 30, 120, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblCantidadHijos = new JLabel("Cantidad de Hijos:");
        lblCantidadHijos.setBounds(50, 70, 120, 30);
        getContentPane().add(lblCantidadHijos);

        JLabel lblBonificacion = new JLabel("Bonificación:");
        lblBonificacion.setBounds(50, 110, 120, 30);
        getContentPane().add(lblBonificacion);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 150, 120, 30);
        getContentPane().add(lblSueldoNeto);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(180, 30, 150, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);

        txtCantidadHijos = new JTextField();
        txtCantidadHijos.setBounds(180, 70, 150, 30);
        txtCantidadHijos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidadHijos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidadHijos);

        txtBonificacion = new JTextField();
        txtBonificacion.setBounds(180, 110, 150, 30);
        txtBonificacion.setFocusable(false);
        txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBonificacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBonificacion);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(180, 150, 150, 30);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoNeto);

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
        double sueldoBruto = Double.parseDouble(txtSueldoBruto.getText());
        int cantidadHijos = Integer.parseInt(txtCantidadHijos.getText());
        double bonificacion;

        if (cantidadHijos > 1) {
            bonificacion = sueldoBruto * 0.125 + (cantidadHijos * 40);
        } else {
            bonificacion = sueldoBruto * 0.10;
        }

        double sueldoNeto = sueldoBruto + bonificacion;

        txtBonificacion.setText(String.format("%.2f", bonificacion));
        txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));
    }
}