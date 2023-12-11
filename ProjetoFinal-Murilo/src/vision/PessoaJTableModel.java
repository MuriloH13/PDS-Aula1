package vision;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.ConsHospedes;

@SuppressWarnings("serial")
public class PessoaJTableModel extends AbstractTableModel{

    private ArrayList<ConsHospedes> lista;
    private String[] colunas ={"Hóspede", "Quarto ", "Data","Descrição","QConsumida","CustoItem","CustoTotalI","Método","Hora","TotalP","Avaliação","Comentário","Funcionário", "Númitens" };

    public PessoaJTableModel(ArrayList<ConsHospedes> lista) {
        this.lista=lista;
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ConsHospedes p = lista.get(rowIndex);
        if(columnIndex == 0) {
            return p.getNome();
        } else if(columnIndex == 1) {
            return p.getNumquarto();
        } else if(columnIndex == 2) {
            return p.getData();
        } else if(columnIndex == 3) {
            return p.getDesc();
        } else if(columnIndex == 4) {
            return p.getQuantc();
        } else if(columnIndex == 5) {
            return p.getCuitem();
        } else if(columnIndex == 6) {
            return p.getCutitem();
        } else if(columnIndex == 7) {
            return p.getMetpag();
        } else if(columnIndex == 8) {
            return p.getHorac();
        } else if(columnIndex == 9) {
            return p.getTpago();
        } else if(columnIndex == 10) {
            return p.getAvserv();
        } else if(columnIndex == 11) {
            return p.getComhosp();
    	} else if(columnIndex == 12) {
    		return p.getFunc();
		} else if(columnIndex == 13) {
			return p.getNumitens();
		}
        
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }


}