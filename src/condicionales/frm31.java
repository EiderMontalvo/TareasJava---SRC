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

public class frm31 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCategoria, txtHorasTrabajadas, txtSueldoBruto, txtDescuento, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm31 frame = new frm31();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm31() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCategoria);

        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(50, 70, 120, 30);
        getContentPane().add(lblHorasTrabajadas);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 110, 120, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 190, 120, 30);
        getContentPane().add(lblSueldoNeto);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(180, 30, 150, 30);
        txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCategoria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCategoria);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(180, 70, 150, 30);
        txtHorasTrabajadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHorasTrabajadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHorasTrabajadas);

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
        String categoria = txtCategoria.getText().toUpperCase();
        double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        double tarifaHoraria;

        switch (categoria) {
            case "A":
                tarifaHoraria = 21.00;
                break;
            case "B":
                tarifaHoraria = 19.50;
                break;
            case "C":
                tarifaHoraria = 17.00;
                break;
            case "D":
                tarifaHoraria = 15.50;
                break;
            default:
                txtSueldoBruto.setText("Categoría inválida");
                txtDescuento.setText("");
                txtSueldoNeto.setText("");
                return;
        }

        double sueldoBruto = horasTrabajadas * tarifaHoraria;
        double descuento = (sueldoBruto > 2500) ? sueldoBruto * 0.20 : sueldoBruto * 0.15;
        double sueldoNeto = sueldoBruto - descuento;

        txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));
    }
}