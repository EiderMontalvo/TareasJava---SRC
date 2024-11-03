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

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtIngresoMensual, txtCostoCasa, txtCuotaInicial, txtCuotaMensual;

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
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIngresoMensual = new JLabel("Ingreso Mensual:");
        lblIngresoMensual.setBounds(50, 30, 120, 30);
        getContentPane().add(lblIngresoMensual);

        JLabel lblCostoCasa = new JLabel("Costo de la Casa:");
        lblCostoCasa.setBounds(50, 70, 120, 30);
        getContentPane().add(lblCostoCasa);

        JLabel lblCuotaInicial = new JLabel("Cuota Inicial:");
        lblCuotaInicial.setBounds(50, 110, 120, 30);
        getContentPane().add(lblCuotaInicial);

        JLabel lblCuotaMensual = new JLabel("Cuota Mensual:");
        lblCuotaMensual.setBounds(50, 150, 120, 30);
        getContentPane().add(lblCuotaMensual);

        txtIngresoMensual = new JTextField();
        txtIngresoMensual.setBounds(180, 30, 150, 30);
        txtIngresoMensual.setHorizontalAlignment(SwingConstants.RIGHT);
        txtIngresoMensual.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtIngresoMensual);

        txtCostoCasa = new JTextField();
        txtCostoCasa.setBounds(180, 70, 150, 30);
        txtCostoCasa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCostoCasa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCostoCasa);

        txtCuotaInicial = new JTextField();
        txtCuotaInicial.setBounds(180, 110, 150, 30);
        txtCuotaInicial.setFocusable(false);
        txtCuotaInicial.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCuotaInicial.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCuotaInicial);

        txtCuotaMensual = new JTextField();
        txtCuotaMensual.setBounds(180, 150, 150, 30);
        txtCuotaMensual.setFocusable(false);
        txtCuotaMensual.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCuotaMensual.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCuotaMensual);

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
        double ingresoMensual = Double.parseDouble(txtIngresoMensual.getText());
        double costoCasa = Double.parseDouble(txtCostoCasa.getText());
        double cuotaInicial;
        double cuotaMensual;

        if (ingresoMensual < 1250) {
            cuotaInicial = costoCasa * 0.15;
            cuotaMensual = (costoCasa - cuotaInicial) / 120;
        } else {
            cuotaInicial = costoCasa * 0.30;
            cuotaMensual = (costoCasa - cuotaInicial) / 75;
        }

        txtCuotaInicial.setText(String.format("%.2f", cuotaInicial));
        txtCuotaMensual.setText(String.format("%.2f", cuotaMensual));
    }
}