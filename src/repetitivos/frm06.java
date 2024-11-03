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

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtInicio, txtFin;
    JTextArea txtResultado;

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
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (n):");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblInicio = new JLabel("Inicio (x):");
        lblInicio.setBounds(50, 70, 120, 30);
        getContentPane().add(lblInicio);

        JLabel lblFin = new JLabel("Fin (y):");
        lblFin.setBounds(50, 110, 120, 30);
        getContentPane().add(lblFin);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 150, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtInicio = new JTextField();
        txtInicio.setBounds(180, 70, 150, 30);
        txtInicio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInicio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInicio);

        txtFin = new JTextField();
        txtFin.setBounds(180, 110, 150, 30);
        txtFin.setHorizontalAlignment(SwingConstants.RIGHT);
        txtFin.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFin);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 150, 280, 150);
        txtResultado.setFocusable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

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
        int numero = Integer.parseInt(txtNumero.getText());
        int inicio = Integer.parseInt(txtInicio.getText());
        int fin = Integer.parseInt(txtFin.getText());
        StringBuilder resultado = new StringBuilder();

        for (int i = inicio; i <= fin; i++) {
            resultado.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        txtResultado.setText(resultado.toString());
    }
}