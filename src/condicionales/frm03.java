package condicionales;

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
    JTextField txtAngulo, txtClasificacion;

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
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAngulo = new JLabel("Ángulo (grados):");
        lblAngulo.setBounds(50, 50, 100, 30);
        getContentPane().add(lblAngulo);

        JLabel lblClasificacion = new JLabel("Clasificación:");
        lblClasificacion.setBounds(50, 90, 100, 30);
        getContentPane().add(lblClasificacion);

        txtAngulo = new JTextField();
        txtAngulo.setBounds(160, 50, 60, 30);
        txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAngulo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAngulo);

        txtClasificacion = new JTextField();
        txtClasificacion.setBounds(160, 90, 60, 30);
        txtClasificacion.setFocusable(false);
        txtClasificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtClasificacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtClasificacion);

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
        int angulo = Integer.parseInt(txtAngulo.getText());
        String clasificacion;

        if (angulo == 0) {
            clasificacion = "Nulo";
        } else if (angulo > 0 && angulo < 90) {
            clasificacion = "Agudo";
        } else if (angulo == 90) {
            clasificacion = "Recto";
        } else if (angulo > 90 && angulo < 180) {
            clasificacion = "Obtuso";
        } else if (angulo == 180) {
            clasificacion = "Llano";
        } else if (angulo > 180 && angulo < 360) {
            clasificacion = "Cóncavo";
        } else if (angulo == 360) {
            clasificacion = "Completo";
        } else {
            clasificacion = "Ángulo no válido";
        }

        txtClasificacion.setText(clasificacion);
    }
}