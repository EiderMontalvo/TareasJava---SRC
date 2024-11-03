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

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion, txtCentroSalud, txtComedorInfantil, txtEscuelaInfantil, txtAsiloAncianos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm17 frame = new frm17();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Donación total:");
        lblDonacion.setBounds(50, 30, 120, 30);
        getContentPane().add(lblDonacion);

        JLabel lblCentroSalud = new JLabel("Centro de Salud:");
        lblCentroSalud.setBounds(50, 70, 120, 30);
        getContentPane().add(lblCentroSalud);

        JLabel lblComedorInfantil = new JLabel("Comedor Infantil:");
        lblComedorInfantil.setBounds(50, 110, 120, 30);
        getContentPane().add(lblComedorInfantil);

        JLabel lblEscuelaInfantil = new JLabel("Escuela Infantil:");
        lblEscuelaInfantil.setBounds(50, 150, 120, 30);
        getContentPane().add(lblEscuelaInfantil);

        JLabel lblAsiloAncianos = new JLabel("Asilo de Ancianos:");
        lblAsiloAncianos.setBounds(50, 190, 120, 30);
        getContentPane().add(lblAsiloAncianos);

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

        txtComedorInfantil = new JTextField();
        txtComedorInfantil.setBounds(180, 110, 150, 30);
        txtComedorInfantil.setFocusable(false);
        txtComedorInfantil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtComedorInfantil.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtComedorInfantil);

        txtEscuelaInfantil = new JTextField();
        txtEscuelaInfantil.setBounds(180, 150, 150, 30);
        txtEscuelaInfantil.setFocusable(false);
        txtEscuelaInfantil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEscuelaInfantil.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEscuelaInfantil);

        txtAsiloAncianos = new JTextField();
        txtAsiloAncianos.setBounds(180, 190, 150, 30);
        txtAsiloAncianos.setFocusable(false);
        txtAsiloAncianos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAsiloAncianos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAsiloAncianos);

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
        double donacion = Double.parseDouble(txtDonacion.getText());

        double centroSalud = donacion * 0.25;
        double comedorInfantil = donacion * 0.35;
        double escuelaInfantil = donacion * 0.25;
        double asiloAncianos = donacion - (centroSalud + comedorInfantil + escuelaInfantil);

        DecimalFormat df = new DecimalFormat("###.00");

        txtCentroSalud.setText(df.format(centroSalud));
        txtComedorInfantil.setText(df.format(comedorInfantil));
        txtEscuelaInfantil.setText(df.format(escuelaInfantil));
        txtAsiloAncianos.setText(df.format(asiloAncianos));
    }
}