package start.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

/**
 * 
 */

/**
 * @description:
 * @author: Admin
 * @time: 6:07:04 PM
 * @date: Mar 6, 2018
 */
public class SignInScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUserName;
	private JTextField txtPassword;

	// private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			SignInScreen frame = new SignInScreen();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the frame.
	 */
	public SignInScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 450, 300);
		setTitle("xin chào jframe");

		JPanel panel = new JPanel();
		panel.setLayout(null);

		JLabel lblUserName = new JLabel("User name");
		lblUserName.setBounds(82, 74, 100, 13);
		panel.add(lblUserName);

		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(88, 121, 100, 13);
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblPassword);
		getContentPane().add(panel, BorderLayout.CENTER);

		txtUserName = new JTextField();
		txtUserName.setBounds(174, 71, 217, 19);
		panel.add(txtUserName);
		txtUserName.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setBounds(174, 118, 217, 19);
		panel.add(txtPassword);
		txtPassword.setColumns(10);

		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (signIn()) {
					// nếu authenticate thành công

					// this will close current login box window
					dispose();

					JOptionPane.showMessageDialog(panel, "authenticate thành công");
					ListUser listUserFrame = new ListUser();
					listUserFrame.setVisible(true);

				} else {
					// nếu authenticate không thành công
					JOptionPane.showMessageDialog(panel, "authenticate không thành công");
				}
			}
		});
		btnNewButton.setBounds(174, 186, 145, 21);
		panel.add(btnNewButton);

	}

	boolean signIn() {
		return txtUserName.getText().equals("trunghq") && txtPassword.getText().equals("123456");
	}

}
