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

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtSuma;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm09 frame = new frm09();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número :");
        lblNumero.setBounds(50, 50, 80, 30);
        getContentPane().add(lblNumero);

        JLabel lblSuma = new JLabel("Suma :");
        lblSuma.setBounds(50, 90, 80, 30);
        getContentPane().add(lblSuma);

        txtNumero = new JTextField();
        txtNumero.setBounds(130, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtSuma = new JTextField();
        txtSuma.setBounds(130, 90, 100, 30);
        txtSuma.setFocusable(false);
        txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSuma.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSuma);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 130, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        txtSuma.setText(String.valueOf(suma));
    }
}