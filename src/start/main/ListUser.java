/**
 * 
 */
package start.main;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;

/**
 * @description:
 * @author: Admin
 * @time: 4:41:50 PM
 * @date: Mar 16, 2018
 */
public class ListUser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 *//*
		 * public static void main(String[] args) { EventQueue.invokeLater(new
		 * Runnable() { public void run() { try { ListUser frame = new ListUser();
		 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
		 * }
		 */

	/**
	 * Create the frame.
	 */
	public ListUser() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.setLayout(new GridLayout(3, 1));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setLayout(new BorderLayout(0, 0));

		final DefaultListModel fruitsName = new DefaultListModel();

		fruitsName.addElement("Apple");
		fruitsName.addElement("Grapes");
		fruitsName.addElement("Mango");
		fruitsName.addElement("Peer");

		final JList fruitList = new JList(fruitsName);
		fruitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fruitList.setSelectedIndex(0);
		fruitList.setVisibleRowCount(3);
		fruitList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel.setText((String) fruitList.getSelectedValue());
			}
		});

		JScrollPane fruitListScrollPane = new JScrollPane(fruitList);

		final DefaultListModel vegName = new DefaultListModel();

		vegName.addElement("Lady Finger");
		vegName.addElement("Onion");
		vegName.addElement("Potato");
		vegName.addElement("Tomato");

		final JList vegList = new JList(vegName);
		vegList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		vegList.setSelectedIndex(0);
		vegList.setVisibleRowCount(3);

		JScrollPane vegListScrollPane = new JScrollPane(vegList);

		contentPane.add(fruitListScrollPane);
		contentPane.add(vegListScrollPane);
		contentPane.setVisible(true);
		setContentPane(contentPane);

		
		contentPane.add(lblNewLabel);
	}


}
