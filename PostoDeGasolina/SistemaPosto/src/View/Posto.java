package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Model.Calculos;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import Model.ComboBoxEnum;

public class Posto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOleoDiesel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtFrasco500Preco;
	private JTextField txtFrasco1Preco;
	private JTextField txtDias;
	private JTextField txtQuantidadeLitros;
	private JTextField txtFrasco500Oleo;
	private JTextField txtFrasco1Oleo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Posto frame = new Posto();
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
	public Posto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setMinimumSize(new Dimension(585, 500));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 23, 267, 109);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblOleoDiesel = new JLabel("Oleo Diesel:");
		panel.add(lblOleoDiesel);
		
		txtOleoDiesel = new JTextField();
		panel.add(txtOleoDiesel);
		txtOleoDiesel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas.Comum:");
		panel.add(lblGasComum);
		
		txtGasComum = new JTextField();
		panel.add(txtGasComum);
		txtGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas.Aditivada:");
		panel.add(lblGasAditivada);
		
		txtGasAditivada = new JTextField();
		panel.add(txtGasAditivada);
		txtGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		panel.add(lblEtanol);
		
		txtEtanol = new JTextField();
		panel.add(txtEtanol);
		txtEtanol.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(318, 23, 241, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblF500 = new JLabel("Frasco 500ml");
		panel_1.add(lblF500);
		
		txtFrasco500Preco = new JTextField();
		panel_1.add(txtFrasco500Preco);
		txtFrasco500Preco.setColumns(10);
		
		JLabel lblF1Oleo = new JLabel("Frasco 1L ");
		panel_1.add(lblF1Oleo);
		
		txtFrasco1Preco = new JTextField();
		panel_1.add(txtFrasco1Preco);
		txtFrasco1Preco.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(21, 143, 538, 109);
		contentPane.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][]", "[][][]"));
		
		JLabel lblQnt = new JLabel("Quantidade");
		lblQnt.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblQnt, "cell 2 0");
		
		JLabel lblVPagar = new JLabel("Valor a Pagar");
		panel_2.add(lblVPagar, "cell 9 0");
		
		JLabel lblTotalO = new JLabel("Total Oleo");
		panel_2.add(lblTotalO, "cell 13 0");
		
		JLabel lblF05l = new JLabel("Frasco de 500ml");
		panel_2.add(lblF05l, "cell 1 1,alignx trailing");
		
		txtFrasco500Oleo = new JTextField();
		panel_2.add(txtFrasco500Oleo, "cell 2 1,growx");
		txtFrasco500Oleo.setColumns(10);
		
		JLabel llblFrascoP500 = new JLabel("-");
		llblFrascoP500.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(llblFrascoP500, "cell 9 1");
		
		JLabel lblTotalOleo = new JLabel("-");
		panel_2.add(lblTotalOleo, "cell 13 1");
		
		JLabel lblF500ml = new JLabel("Frasco de 1L");
		panel_2.add(lblF500ml, "cell 1 2,alignx trailing");
		
		txtFrasco1Oleo = new JTextField();
		panel_2.add(txtFrasco1Oleo, "cell 2 2,growx");
		txtFrasco1Oleo.setColumns(10);
		
		JLabel lblFPagar = new JLabel("-");
		panel_2.add(lblFPagar, "cell 9 2");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(21, 284, 248, 109);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[][][][grow]", "[][][]"));
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		panel_3.add(lblCombustivel, "cell 1 0");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(ComboBoxEnum.values()));
		panel_3.add(comboBox, "cell 3 0,growx");
		
		JLabel lblQuantidadeLitros = new JLabel("Quantidade Litros:");
		panel_3.add(lblQuantidadeLitros, "cell 1 1");
		
		txtQuantidadeLitros = new JTextField();
		panel_3.add(txtQuantidadeLitros, "cell 3 1,growx");
		txtQuantidadeLitros.setColumns(10);
		
		JLabel lblTotalCombustivel = new JLabel("Total Combustivel");
		panel_3.add(lblTotalCombustivel, "cell 1 2");
		
		JLabel lblTotalResCombustivel = new JLabel("");
		panel_3.add(lblTotalResCombustivel, "cell 3 2");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas De Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(305, 284, 254, 109);
		contentPane.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[][][][grow]", "[][][][]"));
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		panel_4.add(rdbtnVista, "cell 0 0");
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		panel_4.add(rdbtnPrazo, "cell 0 1");
		
		JLabel lblDias = new JLabel("Dias:");
		panel_4.add(lblDias, "cell 2 1,alignx trailing");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 3 1,growx");
		txtDias.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar:  ");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblTotalAPagar, "cell 0 3");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String QuantidadeDigitada = txtQuantidadeLitros.getText();
				String OleoDieselDigitado = txtOleoDiesel.getText();
				String GasComumDigitado = txtGasComum.getText();
				String GasAditivadaDigitado = txtGasAditivada.getText();
				String Frasco500 = txtFrasco500Oleo.getText();
				String PFrasco500 = txtFrasco500Preco.getText();
				
				float QuantidadeF = Float.valueOf(QuantidadeDigitada);
				float OleoDieselF = Float.valueOf(OleoDieselDigitado);
				float GasComumF = Float.valueOf(GasComumDigitado);
				float GasAditivadaF = Float.valueOf(GasAditivadaDigitado);
				float Frasco500F = Float.valueOf(Frasco500);
				Float PFrasco500F = Float.valueOf(PFrasco500);
				
				Calculos chama = new Calculos ();
				
				String Item = (String) comboBox.getSelectedItem();
				
				float ResultadoCalculoCombustivel = chama.CalculoCombustivel(OleoDieselF, QuantidadeF);
				
				
				
				if(rdbtnVista.isSelected()) {
					float ResultFrasco = chama.CalculoFrasco(PFrasco500F, Frasco500F);
					llblFrascoP500.setText(String.valueOf(ResultFrasco));
			}
			}
		});
		btnCalcular.setBounds(78, 416, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNovaCalculo = new JButton("Novo Calculo");
		btnNovaCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDias.setText(null);
				txtEtanol.setText(null);
				txtFrasco1Oleo.setText(null);
				txtFrasco1Preco.setText(null);
				txtFrasco500Oleo.setText(null);
				txtFrasco500Preco.setText(null);
				txtGasAditivada.setText(null);
				txtGasComum.setText(null);
				txtOleoDiesel.setText(null);
				txtQuantidadeLitros.setText(null);
			}
		});
		btnNovaCalculo.setBounds(232, 416, 111, 23);
		contentPane.add(btnNovaCalculo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(402, 416, 89, 23);
		contentPane.add(btnFechar);
	}
}
