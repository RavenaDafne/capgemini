package tela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela {
    private JButton Confirmar;
    private JPanel Cadastrar;
    private JTextField textField1;
    private JTextField textField2;

    public PrimeiraTela() {
    Confirmar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Efetuado!");
        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastrar");
        frame.setContentPane( new PrimeiraTela().Cadastrar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
