package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Fomelandia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setTitle("Programa para cálculo de comida por quilograma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrecoQuilo = new JLabel("Preço por quilo: R$9,95");
		lblPrecoQuilo.setBounds(10, 33, 152, 14);
		contentPane.add(lblPrecoQuilo);
		
		JLabel lblPrecoPrato = new JLabel("Insira o peso do prato em quilos:");
		lblPrecoPrato.setBounds(10, 11, 191, 14);
		contentPane.add(lblPrecoPrato);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(201, 8, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float ComidaKg;
				ComidaKg = Float.valueOf(txtPeso.getText());
				Fomelandia Calculo = new Fomelandia();
				float QntComida = Calculo.CalcularP(ComidaKg);
				
				JOptionPane.showMessageDialog(null, "Valor total a pagar: R%" + QntComida);
			}
		});
		btnCalcular.setBounds(198, 39, 89, 23);
		contentPane.add(btnCalcular);
	}
}
