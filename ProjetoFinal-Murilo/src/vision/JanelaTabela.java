package vision;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import model.ConsHospedes;


public class JanelaTabela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JPanel contentPane;
	private ArrayList<ConsHospedes> listaPessoas = new ArrayList<ConsHospedes>();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaTabela frame = new JanelaTabela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@SuppressWarnings("unused")
	public JanelaTabela() {
		setTitle("Tela de consumo e controle de hóspedes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1043, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		JanelaTabela janela = this;
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				ConsHospedes selecionado = listaPessoas.get(linha);
			}
		});
		AtualizarJTableModel();
        scrollPane.setViewportView(table);
        
		
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione a pessoa para excluir!");
					return;
				}
				
				listaPessoas.remove(idx_linha);
				AtualizarJTableModel();
			}
		});
		
		
		btnNewButton_1.setBounds(182, 192, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Alterar");
		
		JanelaTabela alterar = this;
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione a pessoa para alterar!");
					return;
				}
				ConsHospedes a = listaPessoas.get(idx_linha);
				
				JanelaAlterar novajanela = new JanelaAlterar(a, alterar);
				novajanela.setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(310, 192, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Adicionar um registro");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelADD cadastro = new PanelADD(janela);
				cadastro.setVisible(true);
			}
		});
		btnNewButton_1_1_1.setBounds(415, 192, 176, 23);
		contentPane.add(btnNewButton_1_1_1);
		
	}
	
	public void AtualizarJTableModel(){
		table.setModel(new PessoaJTableModel(listaPessoas));
		
	}
	
	public void atualizarDados(ConsHospedes c) {
		int linha = table.getSelectedRow();
		listaPessoas.set(linha, c);
		AtualizarJTableModel();
	}
	
	public void importvar(ConsHospedes importa) {
		listaPessoas.add(importa);
		AtualizarJTableModel();
	}
	
}










