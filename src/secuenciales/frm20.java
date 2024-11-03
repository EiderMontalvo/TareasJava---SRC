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

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtBilletes200, txtBilletes100, txtBilletes50, txtBilletes20, txtBilletes10, txtMonedas5, txtMonedas2, txtMonedas1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 450);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad (Soles):");
        lblCantidad.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCantidad);

        JLabel lblBilletes200 = new JLabel("Billetes de 200:");
        lblBilletes200.setBounds(50, 70, 120, 30);
        getContentPane().add(lblBilletes200);

        JLabel lblBilletes100 = new JLabel("Billetes de 100:");
        lblBilletes100.setBounds(50, 110, 120, 30);
        getContentPane().add(lblBilletes100);

        JLabel lblBilletes50 = new JLabel("Billetes de 50:");
        lblBilletes50.setBounds(50, 150, 120, 30);
        getContentPane().add(lblBilletes50);

        JLabel lblBilletes20 = new JLabel("Billetes de 20:");
        lblBilletes20.setBounds(50, 190, 120, 30);
        getContentPane().add(lblBilletes20);

        JLabel lblBilletes10 = new JLabel("Billetes de 10:");
        lblBilletes10.setBounds(50, 230, 120, 30);
        getContentPane().add(lblBilletes10);

        JLabel lblMonedas5 = new JLabel("Monedas de 5:");
        lblMonedas5.setBounds(50, 270, 120, 30);
        getContentPane().add(lblMonedas5);

        JLabel lblMonedas2 = new JLabel("Monedas de 2:");
        lblMonedas2.setBounds(50, 310, 120, 30);
        getContentPane().add(lblMonedas2);

        JLabel lblMonedas1 = new JLabel("Monedas de 1:");
        lblMonedas1.setBounds(50, 350, 120, 30);
        getContentPane().add(lblMonedas1);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(180, 30, 150, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtBilletes200 = new JTextField();
        txtBilletes200.setBounds(180, 70, 150, 30);
        txtBilletes200.setFocusable(false);
        txtBilletes200.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes200.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes200);

        txtBilletes100 = new JTextField();
        txtBilletes100.setBounds(180, 110, 150, 30);
        txtBilletes100.setFocusable(false);
        txtBilletes100.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes100.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes100);

        txtBilletes50 = new JTextField();
        txtBilletes50.setBounds(180, 150, 150, 30);
        txtBilletes50.setFocusable(false);
        txtBilletes50.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes50.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes50);

        txtBilletes20 = new JTextField();
        txtBilletes20.setBounds(180, 190, 150, 30);
        txtBilletes20.setFocusable(false);
        txtBilletes20.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes20.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes20);

        txtBilletes10 = new JTextField();
        txtBilletes10.setBounds(180, 230, 150, 30);
        txtBilletes10.setFocusable(false);
        txtBilletes10.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes10.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes10);

        txtMonedas5 = new JTextField();
        txtMonedas5.setBounds(180, 270, 150, 30);
        txtMonedas5.setFocusable(false);
        txtMonedas5.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMonedas5.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMonedas5);

        txtMonedas2 = new JTextField();
        txtMonedas2.setBounds(180, 310, 150, 30);
        txtMonedas2.setFocusable(false);
        txtMonedas2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMonedas2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMonedas2);

        txtMonedas1 = new JTextField();
        txtMonedas1.setBounds(180, 350, 150, 30);
        txtMonedas1.setFocusable(false);
        txtMonedas1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMonedas1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMonedas1);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 390, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            int cantidad = Integer.parseInt(txtCantidad.getText());

            int billetes200 = cantidad / 200;
            cantidad %= 200;

            int billetes100 = cantidad / 100;
            cantidad %= 100;

            int billetes50 = cantidad / 50;
            cantidad %= 50;

            int billetes20 = cantidad / 20;
            cantidad %= 20;

            int billetes10 = cantidad / 10;
            cantidad %= 10;

            int monedas5 = cantidad / 5;
            cantidad %= 5;

            int monedas2 = cantidad / 2;
            cantidad %= 2;

            int monedas1 = cantidad;

            txtBilletes200.setText(String.valueOf(billetes200));
            txtBilletes100.setText(String.valueOf(billetes100));
            txtBilletes50.setText(String.valueOf(billetes50));
            txtBilletes20.setText(String.valueOf(billetes20));
            txtBilletes10.setText(String.valueOf(billetes10));
            txtMonedas5.setText(String.valueOf(monedas5));
            txtMonedas2.setText(String.valueOf(monedas2));
            txtMonedas1.setText(String.valueOf(monedas1));
        } catch (NumberFormatException e) {
            txtBilletes200.setText("Error");
            txtBilletes100.setText("Error");
            txtBilletes50.setText("Error");
            txtBilletes20.setText("Error");
            txtBilletes10.setText("Error");
            txtMonedas5.setText("Error");
            txtMonedas2.setText("Error");
            txtMonedas1.setText("Error");
        }
    }
}