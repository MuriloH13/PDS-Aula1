package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaSobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaSobre frame = new JanelaSobre();
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
	public JanelaSobre() {
		setTitle("Sobre o CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVersao = new JLabel("Versão: 1.0");
		lblVersao.setBounds(23, 39, 253, 14);
		contentPane.add(lblVersao);
		
		JLabel lblCalc = new JLabel("CalcInvest - Calculadora de Investimentos");
		lblCalc.setBounds(23, 11, 253, 14);
		contentPane.add(lblCalc);
		
		JLabel lblAutor = new JLabel("Autor: Murilo Henrique Silveira Branco");
		lblAutor.setBounds(21, 64, 255, 14);
		contentPane.add(lblAutor);
		
		JLabel lblContato = new JLabel("Contato: murilo.b08@aluno.ifsc.edu.br");
		lblContato.setBounds(23, 89, 253, 14);
		contentPane.add(lblContato);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 130, 274, 40);
		contentPane.add(panel);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel.add(btnOk);
	}
}
