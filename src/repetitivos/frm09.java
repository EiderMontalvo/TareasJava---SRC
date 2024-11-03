package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtAltura;
    JTextArea txtResultado;

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
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAltura = new JLabel("Altura (n):");
        lblAltura.setBounds(50, 30, 120, 30);
        getContentPane().add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(180, 30, 150, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 70, 280, 250);
        txtResultado.setFocusable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnGenerar = new JButton("Generar");
        btnGenerar.setBounds(150, 330, 100, 30);
        btnGenerar.setMnemonic('a');
        getContentPane().add(btnGenerar);

        btnGenerar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnGenerar_actionPerformed();
            }
        });
    }

    protected void btnGenerar_actionPerformed() {
        int altura = Integer.parseInt(txtAltura.getText());
        if (altura < 4) {
            txtResultado.setText("La altura debe ser mayor o igual a 4.");
            return;
        }

        int ancho = 2 * altura;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                resultado.append("*");
            }
            resultado.append("\n");
        }

        txtResultado.setText(resultado.toString());
    }
}