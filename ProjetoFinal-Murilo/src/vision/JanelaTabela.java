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
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;


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
					frame.setMinimumSize(new Dimension(400, 300));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@SuppressWarnings("unused")
	public JanelaTabela() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1120, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[282px][122px][89px][121px][429px]", "[30px][146px][23px]"));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1 5 1,grow");
		
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
		btnNewButton_1.setBackground(new Color(252, 116, 130));
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
		contentPane.add(btnNewButton_1, "cell 0 2,alignx right,aligny top");
		
		JButton btnNewButton_1_1 = new JButton("Alterar");
		btnNewButton_1_1.setBackground(new Color(108, 244, 217));
		
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
		contentPane.add(btnNewButton_1_1, "cell 2 2,growx,aligny top");
		
		JButton btnNewButton_1_1_1 = new JButton("Adicionar um registro");
		btnNewButton_1_1_1.setBackground(new Color(155, 251, 157));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelADD cadastro = new PanelADD(janela);
				cadastro.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1_1_1, "cell 4 2,alignx left,aligny top");
		
		JLabel lblNewLabel = new JLabel("Consumo de Hospedes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblNewLabel, "cell 2 0 3 1,alignx left,aligny center");
		
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










