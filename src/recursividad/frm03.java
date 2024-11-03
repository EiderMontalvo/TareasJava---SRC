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

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase, txtExponente, txtResultado;

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

        JLabel lblBase = new JLabel("Base (n):");
        lblBase.setBounds(50, 30, 120, 30);
        getContentPane().add(lblBase);

        JLabel lblExponente = new JLabel("Exponente (m):");
        lblExponente.setBounds(50, 70, 120, 30);
        getContentPane().add(lblExponente);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 110, 120, 30);
        getContentPane().add(lblResultado);

        txtBase = new JTextField();
        txtBase.setBounds(180, 30, 150, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        txtExponente = new JTextField();
        txtExponente.setBounds(180, 70, 150, 30);
        txtExponente.setHorizontalAlignment(SwingConstants.RIGHT);
        txtExponente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtExponente);

        txtResultado = new JTextField();
        txtResultado.setBounds(180, 110, 150, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 160, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int base = Integer.parseInt(txtBase.getText());
        int exponente = Integer.parseInt(txtExponente.getText());
        long resultado = potencia(base, exponente);
        txtResultado.setText(String.valueOf(resultado));
    }

    private long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}