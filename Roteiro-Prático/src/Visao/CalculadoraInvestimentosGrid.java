package Visao;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.Investimento;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CalculadoraInvestimentosGrid extends JFrame {

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
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 250);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaSobre Tela = new JanelaSobre();
				Tela.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblDeposito = new JLabel("Depósito mensal R$:");
		contentPane.add(lblDeposito);
		
		JPanel panelDeposito = new JPanel();
		contentPane.add(panelDeposito);
		
		txtDeposito = new JTextField();
		panelDeposito.add(txtDeposito);
		txtDeposito.setColumns(10);
		
		JLabel lblNmeses = new JLabel("Num. de meses:");
		contentPane.add(lblNmeses);
		
		JPanel panelMeses = new JPanel();
		contentPane.add(panelMeses);
		
		txtNmeses = new JTextField();
		panelMeses.add(txtNmeses);
		txtNmeses.setColumns(10);
		
		JLabel lblJuros = new JLabel("Juros ao mês %:");
		contentPane.add(lblJuros);
		
		JPanel panelJuros = new JPanel();
		contentPane.add(panelJuros);
		
		txtJuros = new JTextField();
		panelJuros.add(txtJuros);
		txtJuros.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total investido + juros R$:");
		contentPane.add(lblTotal);
		
		JPanel panelNull = new JPanel();
		contentPane.add(panelNull);
		
		JPanel panelNull2 = new JPanel();
		contentPane.add(panelNull2);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnCalcular = new JButton("Calcular");
		panel.add(btnCalcular);
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
	}
}
