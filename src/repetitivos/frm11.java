package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txtResultado;
    JLabel lblCantidad;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm11 frame = new frm11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("Números capicúas de 3 cifras:");
        lblTitulo.setBounds(50, 30, 300, 30);
        getContentPane().add(lblTitulo);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 70, 280, 250);
        txtResultado.setFocusable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 330, 300, 30);
        getContentPane().add(lblCantidad);

        JButton btnGenerar = new JButton("Generar");
        btnGenerar.setBounds(150, 300, 100, 30);
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
        int cantidad = 0;

        for (int i = 100; i <= 999; i++) {
            int centena = i / 100;
            int unidad = i % 10;

            if (centena == unidad) {
                resultado.append(i).append("\n");
                cantidad++;
            }
        }

        txtResultado.setText(resultado.toString());
        lblCantidad.setText("Cantidad: " + cantidad);
    }
}