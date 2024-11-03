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

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtTarifaHoraria, txtSueldoBasico, txtSueldoBruto, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm16 frame = new frm16();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas:");
        lblHorasTrabajadas.setBounds(50, 30, 120, 30);
        getContentPane().add(lblHorasTrabajadas);

        JLabel lblTarifaHoraria = new JLabel("Tarifa horaria:");
        lblTarifaHoraria.setBounds(50, 70, 120, 30);
        getContentPane().add(lblTarifaHoraria);

        JLabel lblSueldoBasico = new JLabel("Sueldo básico:");
        lblSueldoBasico.setBounds(50, 110, 120, 30);
        getContentPane().add(lblSueldoBasico);

        JLabel lblSueldoBruto = new JLabel("Sueldo bruto:");
        lblSueldoBruto.setBounds(50, 150, 120, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblSueldoNeto = new JLabel("Sueldo neto:");
        lblSueldoNeto.setBounds(50, 190, 120, 30);
        getContentPane().add(lblSueldoNeto);

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

        txtSueldoBasico = new JTextField();
        txtSueldoBasico.setBounds(180, 110, 150, 30);
        txtSueldoBasico.setFocusable(false);
        txtSueldoBasico.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBasico.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBasico);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(180, 150, 150, 30);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);

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
        double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());

        double sueldoBasico = horasTrabajadas * tarifaHoraria;
        double sueldoBruto = sueldoBasico * 1.20; 
        double sueldoNeto = sueldoBruto * 0.90; 

        DecimalFormat df = new DecimalFormat("###.00");

        txtSueldoBasico.setText(df.format(sueldoBasico));
        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtSueldoNeto.setText(df.format(sueldoNeto));
    }
}