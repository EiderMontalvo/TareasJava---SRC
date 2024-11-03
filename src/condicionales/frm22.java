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

public class frm22 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidadesA, txtUnidadesB, txtImporteBruto, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm22 frame = new frm22();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm22() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidadesA = new JLabel("Unidades Producto A:");
        lblUnidadesA.setBounds(50, 30, 150, 30);
        getContentPane().add(lblUnidadesA);

        JLabel lblUnidadesB = new JLabel("Unidades Producto B:");
        lblUnidadesB.setBounds(50, 70, 150, 30);
        getContentPane().add(lblUnidadesB);

        JLabel lblImporteBruto = new JLabel("Importe Bruto:");
        lblImporteBruto.setBounds(50, 110, 150, 30);
        getContentPane().add(lblImporteBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setBounds(50, 190, 150, 30);
        getContentPane().add(lblTotalPagar);

        txtUnidadesA = new JTextField();
        txtUnidadesA.setBounds(210, 30, 100, 30);
        txtUnidadesA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadesA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidadesA);

        txtUnidadesB = new JTextField();
        txtUnidadesB.setBounds(210, 70, 100, 30);
        txtUnidadesB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadesB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidadesB);

        txtImporteBruto = new JTextField();
        txtImporteBruto.setBounds(210, 110, 100, 30);
        txtImporteBruto.setFocusable(false);
        txtImporteBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(210, 150, 100, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(210, 190, 100, 30);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int unidadesA = Integer.parseInt(txtUnidadesA.getText());
        int unidadesB = Integer.parseInt(txtUnidadesB.getText());

        double precioA = 25.0;
        double precioB = 30.0;

        double importeBrutoA = unidadesA * precioA;
        double importeBrutoB = unidadesB * precioB;

        double descuentoA = (unidadesA > 50) ? importeBrutoA * 0.15 : 0;
        double descuentoB = (unidadesB > 60) ? importeBrutoB * 0.10 : 0;

        double importeBruto = importeBrutoA + importeBrutoB;
        double descuento = descuentoA + descuentoB;
        double totalPagar = importeBruto - descuento;

        txtImporteBruto.setText(String.format("%.2f", importeBruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotalPagar.setText(String.format("%.2f", totalPagar));
    }
}