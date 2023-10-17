package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Retangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setBounds(20, 23, 46, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(20, 48, 46, 14);
		contentPane.add(lblAltura);
		
		txtBase = new JTextField();
		txtBase.setBounds(56, 20, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(56, 48, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float Altura, Base;
				Altura = Integer.valueOf(txtAltura.getText());
				Base = Integer.valueOf(txtBase.getText());
				Retangulo calculos = new Retangulo();
				float Perimetro = calculos.CalcularP(Altura, Base);
				float Area = calculos.CalcularA(Altura, Base);
				
				JOptionPane.showMessageDialog(null, "Perimetro do retângulo: " + Perimetro + " Area do retângulo: " + Area);
			}
		});
		btnCalcular.setBounds(166, 108, 89, 23);
		contentPane.add(btnCalcular);
	}
}
