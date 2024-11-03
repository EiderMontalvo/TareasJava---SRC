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

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtJuan, txtRosa, txtDaniel, txtTotal, txtPorcentajeJuan, txtPorcentajeRosa, txtPorcentajeDaniel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm15 frame = new frm15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblJuan = new JLabel("Juan (USD):");
        lblJuan.setBounds(50, 30, 100, 30);
        getContentPane().add(lblJuan);

        JLabel lblRosa = new JLabel("Rosa (USD):");
        lblRosa.setBounds(50, 70, 100, 30);
        getContentPane().add(lblRosa);

        JLabel lblDaniel = new JLabel("Daniel (Soles):");
        lblDaniel.setBounds(50, 110, 100, 30);
        getContentPane().add(lblDaniel);

        JLabel lblTotal = new JLabel("Total (USD):");
        lblTotal.setBounds(50, 150, 100, 30);
        getContentPane().add(lblTotal);

        JLabel lblPorcentajeJuan = new JLabel("Porcentaje Juan:");
        lblPorcentajeJuan.setBounds(50, 190, 120, 30);
        getContentPane().add(lblPorcentajeJuan);

        JLabel lblPorcentajeRosa = new JLabel("Porcentaje Rosa:");
        lblPorcentajeRosa.setBounds(50, 230, 120, 30);
        getContentPane().add(lblPorcentajeRosa);

        JLabel lblPorcentajeDaniel = new JLabel("Porcentaje Daniel:");
        lblPorcentajeDaniel.setBounds(50, 270, 120, 30);
        getContentPane().add(lblPorcentajeDaniel);

        txtJuan = new JTextField();
        txtJuan.setBounds(180, 30, 150, 30);
        txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtJuan);

        txtRosa = new JTextField();
        txtRosa.setBounds(180, 70, 150, 30);
        txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRosa);

        txtDaniel = new JTextField();
        txtDaniel.setBounds(180, 110, 150, 30);
        txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDaniel);

        txtTotal = new JTextField();
        txtTotal.setBounds(180, 150, 150, 30);
        txtTotal.setFocusable(false);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotal);

        txtPorcentajeJuan = new JTextField();
        txtPorcentajeJuan.setBounds(180, 190, 150, 30);
        txtPorcentajeJuan.setFocusable(false);
        txtPorcentajeJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcentajeJuan);

        txtPorcentajeRosa = new JTextField();
        txtPorcentajeRosa.setBounds(180, 230, 150, 30);
        txtPorcentajeRosa.setFocusable(false);
        txtPorcentajeRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcentajeRosa);

        txtPorcentajeDaniel = new JTextField();
        txtPorcentajeDaniel.setBounds(180, 270, 150, 30);
        txtPorcentajeDaniel.setFocusable(false);
        txtPorcentajeDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcentajeDaniel);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 320, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double juan = Double.parseDouble(txtJuan.getText());
        double rosa = Double.parseDouble(txtRosa.getText());
        double daniel = Double.parseDouble(txtDaniel.getText()) / 3.0; // Convertir soles a dólares

        double total = juan + rosa + daniel;

        DecimalFormat df = new DecimalFormat("###.00");

        txtTotal.setText(df.format(total));
        txtPorcentajeJuan.setText(df.format((juan / total) * 100) + "%");
        txtPorcentajeRosa.setText(df.format((rosa / total) * 100) + "%");
        txtPorcentajeDaniel.setText(df.format((daniel / total) * 100) + "%");
    }
}