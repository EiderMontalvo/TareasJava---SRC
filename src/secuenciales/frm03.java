package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtKilometros, txtPies, txtMillas, txtMetros, txtYardas;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblKilometros = new JLabel("Tramo 1 (km):");
        lblKilometros.setBounds(50, 30, 120, 30);
        getContentPane().add(lblKilometros);

        JLabel lblPies = new JLabel("Tramo 2 (pies):");
        lblPies.setBounds(50, 70, 120, 30);
        getContentPane().add(lblPies);

        JLabel lblMillas = new JLabel("Tramo 3 (millas):");
        lblMillas.setBounds(50, 110, 120, 30);
        getContentPane().add(lblMillas);

        JLabel lblMetros = new JLabel("Total en Metros:");
        lblMetros.setBounds(50, 150, 120, 30);
        getContentPane().add(lblMetros);

        JLabel lblYardas = new JLabel("Total en Yardas:");
        lblYardas.setBounds(50, 190, 120, 30);
        getContentPane().add(lblYardas);

        txtKilometros = new JTextField();
        txtKilometros.setBounds(180, 30, 150, 30);
        txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKilometros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtKilometros);

        txtPies = new JTextField();
        txtPies.setBounds(180, 70, 150, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtMillas = new JTextField();
        txtMillas.setBounds(180, 110, 150, 30);
        txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMillas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMillas);

        txtMetros = new JTextField();
        txtMetros.setBounds(180, 150, 150, 30);
        txtMetros.setFocusable(false);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMetros);

        txtYardas = new JTextField();
        txtYardas.setBounds(180, 190, 150, 30);
        txtYardas.setFocusable(false);
        txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtYardas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtYardas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 240, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double kilometros = Double.parseDouble(txtKilometros.getText());
        double pies = Double.parseDouble(txtPies.getText());
        double millas = Double.parseDouble(txtMillas.getText());

        double metros = (kilometros * 1000) + (pies / 3.2808) + (millas * 1609);
        double yardas = metros * 1.09361;

        txtMetros.setText(String.format("%.2f", metros));
        txtYardas.setText(String.format("%.2f", yardas));
    }
}