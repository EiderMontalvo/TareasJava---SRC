package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCadena, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCadena = new JLabel("Cadena:");
        lblCadena.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCadena);

        JLabel lblResultado = new JLabel("Invertida:");
        lblResultado.setBounds(50, 70, 120, 30);
        getContentPane().add(lblResultado);

        txtCadena = new JTextField();
        txtCadena.setBounds(180, 30, 150, 30);
        txtCadena.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCadena.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCadena);

        txtResultado = new JTextField();
        txtResultado.setBounds(180, 70, 150, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

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
        String cadena = txtCadena.getText();
        String resultado = invertirCadena(cadena);
        txtResultado.setText(resultado);
    }

    private String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}