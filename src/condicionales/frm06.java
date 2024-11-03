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

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtEdad1, txtEdad2, txtEdad3, txtEdadMenor, txtEdadMayor;

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
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblEdad1 = new JLabel("Edad 1:");
        lblEdad1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblEdad1);

        JLabel lblEdad2 = new JLabel("Edad 2:");
        lblEdad2.setBounds(50, 70, 80, 30);
        getContentPane().add(lblEdad2);

        JLabel lblEdad3 = new JLabel("Edad 3:");
        lblEdad3.setBounds(50, 110, 80, 30);
        getContentPane().add(lblEdad3);

        JLabel lblEdadMenor = new JLabel("Edad Menor:");
        lblEdadMenor.setBounds(50, 150, 80, 30);
        getContentPane().add(lblEdadMenor);

        JLabel lblEdadMayor = new JLabel("Edad Mayor:");
        lblEdadMayor.setBounds(50, 190, 80, 30);
        getContentPane().add(lblEdadMayor);

        txtEdad1 = new JTextField();
        txtEdad1.setBounds(130, 30, 100, 30);
        txtEdad1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad1);

        txtEdad2 = new JTextField();
        txtEdad2.setBounds(130, 70, 100, 30);
        txtEdad2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad2);

        txtEdad3 = new JTextField();
        txtEdad3.setBounds(130, 110, 100, 30);
        txtEdad3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad3);

        txtEdadMenor = new JTextField();
        txtEdadMenor.setBounds(130, 150, 100, 30);
        txtEdadMenor.setFocusable(false);
        txtEdadMenor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdadMenor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdadMenor);

        txtEdadMayor = new JTextField();
        txtEdadMayor.setBounds(130, 190, 100, 30);
        txtEdadMayor.setFocusable(false);
        txtEdadMayor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdadMayor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdadMayor);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int edad1 = Integer.parseInt(txtEdad1.getText());
        int edad2 = Integer.parseInt(txtEdad2.getText());
        int edad3 = Integer.parseInt(txtEdad3.getText());

        int edadMenor = Math.min(Math.min(edad1, edad2), edad3);
        int edadMayor = Math.max(Math.max(edad1, edad2), edad3);

        txtEdadMenor.setText(String.valueOf(edadMenor));
        txtEdadMayor.setText(String.valueOf(edadMayor));
    }
}