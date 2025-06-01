import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JTextField userField = new JTextField();
    JPasswordField senhaField = new JPasswordField();

    JButton btnLogin = new JButton("Login");
    JButton btnLimpar = new JButton("Limpar");

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
