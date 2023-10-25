package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Investimento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDeposito;
	private JTextField txtNmeses;
	private JTextField txtJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeposito = new JLabel("Depósito mensal R$:");
		lblDeposito.setBounds(58, 0, 124, 14);
		contentPane.add(lblDeposito);
		
		txtDeposito = new JTextField();
		txtDeposito.setBounds(31, 24, 168, 20);
		contentPane.add(txtDeposito);
		txtDeposito.setColumns(10);
		
		JLabel lblNmeses = new JLabel("Num. de meses:");
		lblNmeses.setBounds(75, 44, 107, 14);
		contentPane.add(lblNmeses);
		
		txtNmeses = new JTextField();
		txtNmeses.setColumns(10);
		txtNmeses.setBounds(31, 69, 168, 20);
		contentPane.add(txtNmeses);
		
		JLabel lblJuros = new JLabel("Juros ao mês %:");
		lblJuros.setBounds(75, 100, 107, 14);
		contentPane.add(lblJuros);
		
		txtJuros = new JTextField();
		txtJuros.setColumns(10);
		txtJuros.setBounds(31, 124, 168, 20);
		contentPane.add(txtJuros);
		
		JLabel lblTotal = new JLabel("Total investido + juros R$:");
		lblTotal.setBounds(41, 156, 158, 14);
		contentPane.add(lblTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Meses = Integer.valueOf(txtNmeses.getText());
				double Juros = Double.valueOf(txtJuros.getText());
				double Deposito = Double.valueOf(txtDeposito.getText());
				Investimento Inv = new Investimento(Meses, Juros, Deposito);
				Double Total = Inv.calculaTotal();
				JOptionPane.showMessageDialog(null, Total);
				
			}
		});
		btnCalcular.setBounds(73, 177, 89, 23);
		contentPane.add(btnCalcular);
	}
}
