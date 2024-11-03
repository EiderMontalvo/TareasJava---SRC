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

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSexo, txtEdad, txtCategoria;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSexo = new JLabel("Sexo (M/F):");
        lblSexo.setBounds(50, 30, 80, 30);
        getContentPane().add(lblSexo);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 70, 80, 30);
        getContentPane().add(lblEdad);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 110, 80, 30);
        getContentPane().add(lblCategoria);

        txtSexo = new JTextField();
        txtSexo.setBounds(130, 30, 100, 30);
        txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSexo);

        txtEdad = new JTextField();
        txtEdad.setBounds(130, 70, 100, 30);
        txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(130, 110, 100, 30);
        txtCategoria.setFocusable(false);
        txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCategoria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCategoria);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        String sexo = txtSexo.getText().toUpperCase();
        int edad = Integer.parseInt(txtEdad.getText());
        String categoria;

        if (sexo.equals("F")) {
            if (edad < 23) {
                categoria = "FA";
            } else {
                categoria = "FB";
            }
        } else if (sexo.equals("M")) {
            if (edad < 25) {
                categoria = "MA";
            } else {
                categoria = "MB";
            }
        } else {
            categoria = "Sexo inválido";
        }

        txtCategoria.setText(categoria);
    }
}