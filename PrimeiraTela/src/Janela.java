import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlaMundo = new JLabel("Olá Mundo!");
		lblOlaMundo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Digita o bagulho ae seu loco");
			}
		});
		lblOlaMundo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblOlaMundo.setBounds(189, 11, 53, 14);
		contentPane.add(lblOlaMundo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(277, 177, 89, 23);
		contentPane.add(btnFechar);
		
		btnFechar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 51, 46, 14);
		contentPane.add(lblNome);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(48, 48, 257, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome;
				nome = txtNome.getText();
				JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome);
			}
		});
		btnValidar.setBounds(48, 177, 89, 23);
		contentPane.add(btnValidar);
		
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
			}
		});
		btnLimpar.setBounds(159, 177, 89, 23);
		contentPane.add(btnLimpar);
		
		
	}
}
