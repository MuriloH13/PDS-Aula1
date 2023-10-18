package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio2() {
		setTitle("Programa para mostrar o nome completo da pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 38, 65, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(10, 63, 79, 14);
		contentPane.add(lblSobrenome);
		
		textNome = new JTextField();
		textNome.setBounds(88, 35, 193, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(88, 60, 193, 20);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JButton btnNomeComp = new JButton("Mostrar Nome");
		btnNomeComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = (textNome.getText() + " ");
				String sobrenome = (textSobrenome.getText());
				JOptionPane.showMessageDialog(null, nome + " " + sobrenome);
			}
		});
		btnNomeComp.setBounds(125, 111, 120, 23);
		contentPane.add(btnNomeComp);
		
	}

}
