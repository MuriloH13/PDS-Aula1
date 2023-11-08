import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblCPF;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnAlterar;
	private JTextField txtIdade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JLabel lblTelefone;
	private JTextField txtTelefone;

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
		setBounds(100, 100, 650, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setMinimumSize(new Dimension(650, 560));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 104, 613, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: "+pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(15, 11, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 90, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setBounds(110, 11, 46, 14);
		contentPane.add(lblCPF);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(110, 36, 90, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				String idade = txtIdade.getText();
				String altura = txtAltura.getText();
				String peso = txtPeso.getText();
				String telefone = txtTelefone.getText();
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setAltura(Float.parseFloat(altura));
				p.setIdade(Integer.parseInt(idade));
				p.setPeso(Float.parseFloat(peso));
				p.setTelefone(Integer.parseInt(telefone));
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
				
				
				
			}
		});
		btnAdicionar.setBounds(11, 67, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnExcluir.setBounds(110, 67, 89, 23);
		contentPane.add(btnExcluir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterar.setBounds(210, 67, 89, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(210, 11, 46, 14);
		contentPane.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(210, 36, 90, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(310, 11, 46, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(310, 36, 90, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(410, 11, 46, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(410, 36, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(506, 11, 46, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(506, 36, 86, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
		txtTelefone.setText("");
	}
}










