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

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPies, txtPulgadas, txtMetros;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPies = new JLabel("Pies:");
        lblPies.setBounds(50, 30, 120, 30);
        getContentPane().add(lblPies);

        JLabel lblPulgadas = new JLabel("Pulgadas:");
        lblPulgadas.setBounds(50, 70, 120, 30);
        getContentPane().add(lblPulgadas);

        JLabel lblMetros = new JLabel("Estatura en Metros:");
        lblMetros.setBounds(50, 110, 120, 30);
        getContentPane().add(lblMetros);

        txtPies = new JTextField();
        txtPies.setBounds(180, 30, 150, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(180, 70, 150, 30);
        txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPulgadas);

        txtMetros = new JTextField();
        txtMetros.setBounds(180, 110, 150, 30);
        txtMetros.setFocusable(false);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMetros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 160, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double pies = Double.parseDouble(txtPies.getText());
        double pulgadas = Double.parseDouble(txtPulgadas.getText());

        double totalPulgadas = (pies * 12) + pulgadas;
        double metros = totalPulgadas * 0.0254;

        txtMetros.setText(String.format("%.2f", metros));
    }
}