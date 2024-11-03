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

public class frm23 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNotaMatematicas, txtNotaFisica, txtPropina, txtObsequio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm23 frame = new frm23();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm23() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNotaMatematicas = new JLabel("Nota Matemáticas:");
        lblNotaMatematicas.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNotaMatematicas);

        JLabel lblNotaFisica = new JLabel("Nota Física:");
        lblNotaFisica.setBounds(50, 70, 120, 30);
        getContentPane().add(lblNotaFisica);

        JLabel lblPropina = new JLabel("Propina:");
        lblPropina.setBounds(50, 110, 120, 30);
        getContentPane().add(lblPropina);

        JLabel lblObsequio = new JLabel("Obsequio:");
        lblObsequio.setBounds(50, 150, 120, 30);
        getContentPane().add(lblObsequio);

        txtNotaMatematicas = new JTextField();
        txtNotaMatematicas.setBounds(180, 30, 150, 30);
        txtNotaMatematicas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaMatematicas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNotaMatematicas);

        txtNotaFisica = new JTextField();
        txtNotaFisica.setBounds(180, 70, 150, 30);
        txtNotaFisica.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaFisica.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNotaFisica);

        txtPropina = new JTextField();
        txtPropina.setBounds(180, 110, 150, 30);
        txtPropina.setFocusable(false);
        txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPropina.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPropina);

        txtObsequio = new JTextField();
        txtObsequio.setBounds(180, 150, 150, 30);
        txtObsequio.setFocusable(false);
        txtObsequio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtObsequio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtObsequio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double notaMatematicas = Double.parseDouble(txtNotaMatematicas.getText());
        double notaFisica = Double.parseDouble(txtNotaFisica.getText());
        double propinaMatematicas;
        double propinaFisica;

        if (notaMatematicas > 17) {
            propinaMatematicas = 3;
        } else {
            propinaMatematicas = notaMatematicas * 1;
        }

        if (notaFisica > 15) {
            propinaFisica = 2;
        } else {
            propinaFisica = notaFisica * 0.50;
        }

        double propinaTotal = propinaMatematicas + propinaFisica;
        double promedio = (notaMatematicas + notaFisica) / 2;
        String obsequio = (promedio > 16) ? "Reloj" : "Ninguno";

        txtPropina.setText(String.format("%.2f", propinaTotal));
        txtObsequio.setText(obsequio);
    }
}