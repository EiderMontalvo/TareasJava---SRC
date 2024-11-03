package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCatetoA, txtCatetoB, txtHipotenusa;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCatetoA = new JLabel("Cateto a:");
        lblCatetoA.setBounds(50, 30, 80, 30);
        getContentPane().add(lblCatetoA);

        JLabel lblCatetoB = new JLabel("Cateto b:");
        lblCatetoB.setBounds(50, 70, 80, 30);
        getContentPane().add(lblCatetoB);

        JLabel lblHipotenusa = new JLabel("Hipotenusa:");
        lblHipotenusa.setBounds(50, 110, 80, 30);
        getContentPane().add(lblHipotenusa);

        txtCatetoA = new JTextField();
        txtCatetoA.setBounds(130, 30, 100, 30);
        txtCatetoA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCatetoA);

        txtCatetoB = new JTextField();
        txtCatetoB.setBounds(130, 70, 100, 30);
        txtCatetoB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCatetoB);

        txtHipotenusa = new JTextField();
        txtHipotenusa.setBounds(130, 110, 100, 30);
        txtHipotenusa.setFocusable(false);
        txtHipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHipotenusa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHipotenusa);

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
        double catetoA = Double.parseDouble(txtCatetoA.getText());
        double catetoB = Double.parseDouble(txtCatetoB.getText());

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        txtHipotenusa.setText(String.valueOf(hipotenusa));
    }
}
