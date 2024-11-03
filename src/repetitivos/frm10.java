package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txtResultado;
    JLabel lblCantidad;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("Números de 4 cifras con suma de pares e impares iguales:");
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

        for (int i = 1000; i <= 9999; i++) {
            int sumaPares = 0;
            int sumaImpares = 0;
            int numero = i;

            for (int j = 0; j < 4; j++) {
                int digito = numero % 10;
                if (digito % 2 == 0) {
                    sumaPares += digito;
                } else {
                    sumaImpares += digito;
                }
                numero /= 10;
            }

            if (sumaPares == sumaImpares) {
                resultado.append(i).append("\n");
                cantidad++;
            }
        }

        txtResultado.setText(resultado.toString());
        lblCantidad.setText("Cantidad: " + cantidad);
    }
}