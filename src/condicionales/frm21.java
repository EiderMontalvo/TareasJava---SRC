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

public class frm21 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtEstadoCivil, txtEdad, txtSexo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm21 frame = new frm21();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm21() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblEstadoCivil = new JLabel("Estado Civil:");
        lblEstadoCivil.setBounds(50, 70, 120, 30);
        getContentPane().add(lblEstadoCivil);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 110, 120, 30);
        getContentPane().add(lblEdad);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(50, 150, 120, 30);
        getContentPane().add(lblSexo);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 150, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtEstadoCivil = new JTextField();
        txtEstadoCivil.setBounds(180, 70, 150, 30);
        txtEstadoCivil.setFocusable(false);
        txtEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoCivil.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEstadoCivil);

        txtEdad = new JTextField();
        txtEdad.setBounds(180, 110, 150, 30);
        txtEdad.setFocusable(false);
        txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad);

        txtSexo = new JTextField();
        txtSexo.setBounds(180, 150, 150, 30);
        txtSexo.setFocusable(false);
        txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSexo);

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
        int numero = Integer.parseInt(txtNumero.getText());

        int estadoCivilCodigo = numero / 1000;
        int edad = (numero / 10) % 100;
        int sexoCodigo = numero % 10;

        String estadoCivil;
        switch (estadoCivilCodigo) {
            case 1:
                estadoCivil = "Soltero";
                break;
            case 2:
                estadoCivil = "Casado";
                break;
            case 3:
                estadoCivil = "Divorciado";
                break;
            case 4:
                estadoCivil = "Viudo";
                break;
            default:
                estadoCivil = "Código inválido";
                break;
        }

        String sexo;
        switch (sexoCodigo) {
            case 1:
                sexo = "Masculino";
                break;
            case 2:
                sexo = "Femenino";
                break;
            default:
                sexo = "Código inválido";
                break;
        }

        txtEstadoCivil.setText(estadoCivil);
        txtEdad.setText(String.valueOf(edad));
        txtSexo.setText(sexo);
    }
}