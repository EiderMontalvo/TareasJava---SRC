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

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtCantidadDivisores;

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
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblCantidadDivisores = new JLabel("Cantidad de Divisores:");
        lblCantidadDivisores.setBounds(50, 70, 150, 30);
        getContentPane().add(lblCantidadDivisores);

        txtNumero = new JTextField();
        txtNumero.setBounds(210, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtCantidadDivisores = new JTextField();
        txtCantidadDivisores.setBounds(210, 70, 100, 30);
        txtCantidadDivisores.setFocusable(false);
        txtCantidadDivisores.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidadDivisores.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidadDivisores);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 120, 100, 30);
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
        int cantidadDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cantidadDivisores++;
            }
        }

        txtCantidadDivisores.setText(String.valueOf(cantidadDivisores));
    }
}