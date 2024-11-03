package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDividendo, txtDivisor, txtCociente, txtResto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm01 frame = new frm01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDividendo = new JLabel("Dividendo:");
        lblDividendo.setBounds(50, 30, 120, 30);
        getContentPane().add(lblDividendo);

        JLabel lblDivisor = new JLabel("Divisor:");
        lblDivisor.setBounds(50, 70, 120, 30);
        getContentPane().add(lblDivisor);

        JLabel lblCociente = new JLabel("Cociente:");
        lblCociente.setBounds(50, 110, 120, 30);
        getContentPane().add(lblCociente);

        JLabel lblResto = new JLabel("Resto:");
        lblResto.setBounds(50, 150, 120, 30);
        getContentPane().add(lblResto);

        txtDividendo = new JTextField();
        txtDividendo.setBounds(180, 30, 150, 30);
        txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDividendo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDividendo);

        txtDivisor = new JTextField();
        txtDivisor.setBounds(180, 70, 150, 30);
        txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDivisor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisor);

        txtCociente = new JTextField();
        txtCociente.setBounds(180, 110, 150, 30);
        txtCociente.setFocusable(false);
        txtCociente.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCociente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCociente);

        txtResto = new JTextField();
        txtResto.setBounds(180, 150, 150, 30);
        txtResto.setFocusable(false);
        txtResto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResto);

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
        int dividendo = Integer.parseInt(txtDividendo.getText());
        int divisor = Integer.parseInt(txtDivisor.getText());
        int cociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }

        txtCociente.setText(String.valueOf(cociente));
        txtResto.setText(String.valueOf(resto));
    }
}