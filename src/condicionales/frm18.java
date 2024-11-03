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

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion, txtCentroSalud, txtComedorNinos, txtBolsa;

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
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Donación:");
        lblDonacion.setBounds(50, 30, 120, 30);
        getContentPane().add(lblDonacion);

        JLabel lblCentroSalud = new JLabel("Centro de Salud:");
        lblCentroSalud.setBounds(50, 70, 120, 30);
        getContentPane().add(lblCentroSalud);

        JLabel lblComedorNinos = new JLabel("Comedor de Niños:");
        lblComedorNinos.setBounds(50, 110, 120, 30);
        getContentPane().add(lblComedorNinos);

        JLabel lblBolsa = new JLabel("Bolsa:");
        lblBolsa.setBounds(50, 150, 120, 30);
        getContentPane().add(lblBolsa);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(180, 30, 150, 30);
        txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDonacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDonacion);

        txtCentroSalud = new JTextField();
        txtCentroSalud.setBounds(180, 70, 150, 30);
        txtCentroSalud.setFocusable(false);
        txtCentroSalud.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCentroSalud.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCentroSalud);

        txtComedorNinos = new JTextField();
        txtComedorNinos.setBounds(180, 110, 150, 30);
        txtComedorNinos.setFocusable(false);
        txtComedorNinos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtComedorNinos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtComedorNinos);

        txtBolsa = new JTextField();
        txtBolsa.setBounds(180, 150, 150, 30);
        txtBolsa.setFocusable(false);
        txtBolsa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBolsa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBolsa);

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
        double donacion = Double.parseDouble(txtDonacion.getText());
        double centroSalud, comedorNinos, bolsa;

        if (donacion >= 10000) {
            centroSalud = donacion * 0.30;
            comedorNinos = donacion * 0.50;
            bolsa = donacion - (centroSalud + comedorNinos);
        } else {
            centroSalud = donacion * 0.25;
            comedorNinos = donacion * 0.60;
            bolsa = donacion - (centroSalud + comedorNinos);
        }

        txtCentroSalud.setText(String.format("%.2f", centroSalud));
        txtComedorNinos.setText(String.format("%.2f", comedorNinos));
        txtBolsa.setText(String.format("%.2f", bolsa));
    }
}