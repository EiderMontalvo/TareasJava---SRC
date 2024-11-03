package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtNumero4, txtNumero5, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 70, 80, 30);
        getContentPane().add(lblNumero2);

        JLabel lblNumero3 = new JLabel("Número 3:");
        lblNumero3.setBounds(50, 110, 80, 30);
        getContentPane().add(lblNumero3);

        JLabel lblNumero4 = new JLabel("Número 4:");
        lblNumero4.setBounds(50, 150, 80, 30);
        getContentPane().add(lblNumero4);

        JLabel lblNumero5 = new JLabel("Número 5:");
        lblNumero5.setBounds(50, 190, 80, 30);
        getContentPane().add(lblNumero5);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(50, 230, 80, 30);
        getContentPane().add(lblPromedio);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(130, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(130, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        txtNumero3 = new JTextField();
        txtNumero3.setBounds(130, 110, 100, 30);
        txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero3);

        txtNumero4 = new JTextField();
        txtNumero4.setBounds(130, 150, 100, 30);
        txtNumero4.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero4.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero4);

        txtNumero5 = new JTextField();
        txtNumero5.setBounds(130, 190, 100, 30);
        txtNumero5.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero5.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero5);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(130, 230, 100, 30);
        txtPromedio.setFocusable(false);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 270, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double numero1 = Double.parseDouble(txtNumero1.getText());
        double numero2 = Double.parseDouble(txtNumero2.getText());
        double numero3 = Double.parseDouble(txtNumero3.getText());
        double numero4 = Double.parseDouble(txtNumero4.getText());
        double numero5 = Double.parseDouble(txtNumero5.getText());

        double[] numeros = {numero1, numero2, numero3, numero4, numero5};
        Arrays.sort(numeros);

        double suma = numeros[2] + numeros[3] + numeros[4];
        double promedio = suma / 3;

        txtPromedio.setText(String.valueOf(promedio));
    }
}