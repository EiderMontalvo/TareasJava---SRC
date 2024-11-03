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

public class frm29 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtTarifaHoraria, txtSueldoBruto, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm29 frame = new frm29();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm29() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(50, 30, 120, 30);
        getContentPane().add(lblHorasTrabajadas);

        JLabel lblTarifaHoraria = new JLabel("Tarifa Horaria:");
        lblTarifaHoraria.setBounds(50, 70, 120, 30);
        getContentPane().add(lblTarifaHoraria);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 110, 120, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setBounds(50, 190, 120, 30);
        getContentPane().add(lblTotalPagar);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(180, 30, 150, 30);
        txtHorasTrabajadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHorasTrabajadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHorasTrabajadas);

        txtTarifaHoraria = new JTextField();
        txtTarifaHoraria.setBounds(180, 70, 150, 30);
        txtTarifaHoraria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTarifaHoraria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTarifaHoraria);

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

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(180, 190, 150, 30);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

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
        double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());
        double sueldoBruto;

        if (horasTrabajadas <= 48) {
            sueldoBruto = horasTrabajadas * tarifaHoraria;
        } else {
            double horasExtras = horasTrabajadas - 48;
            sueldoBruto = (48 * tarifaHoraria) + (horasExtras * tarifaHoraria * 1.20);
        }

        double descuento = (sueldoBruto > 1500) ? sueldoBruto * 0.11 : sueldoBruto * 0.05;
        double totalPagar = sueldoBruto - descuento;

        txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotalPagar.setText(String.format("%.2f", totalPagar));
    }
}