package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Gasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtGasolina;
	private JTextField txtPagamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGasolina = new JLabel("Preço da Gasolina:");
		lblGasolina.setBounds(10, 11, 89, 14);
		contentPane.add(lblGasolina);
		
		JLabel lblPagamento = new JLabel("Valor do pagamento:");
		lblPagamento.setBounds(10, 53, 100, 14);
		contentPane.add(lblPagamento);
		
		txtGasolina = new JTextField();
		txtGasolina.setBounds(120, 8, 86, 20);
		contentPane.add(txtGasolina);
		txtGasolina.setColumns(10);
		
		txtPagamento = new JTextField();
		txtPagamento.setBounds(120, 50, 86, 20);
		contentPane.add(txtPagamento);
		txtPagamento.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float PrecoGas, Dinheiro;
				PrecoGas = Float.valueOf(txtGasolina.getText());
				Dinheiro = Float.valueOf(txtPagamento.getText());
				Gasolina Calculo = new Gasolina();
				float QntLitros = Calculo.CalcGasolina(PrecoGas, Dinheiro);
				
				JOptionPane.showMessageDialog(null, "É possível colocar: " + QntLitros + " litros de gasolina em seu carro");
				
			}
		});
		btnCalcular.setBounds(120, 102, 89, 23);
		contentPane.add(btnCalcular);
	}

}
