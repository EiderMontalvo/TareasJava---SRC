package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm12 frame = new frm12();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("Números del 1 al 100:");
        lblTitulo.setBounds(50, 30, 300, 30);
        getContentPane().add(lblTitulo);

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
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            resultado.append(i).append(" ");
            if (i % 10 == 0) {
                resultado.append("\n");
            }
        }

        txtResultado.setText(resultado.toString());
    }
}