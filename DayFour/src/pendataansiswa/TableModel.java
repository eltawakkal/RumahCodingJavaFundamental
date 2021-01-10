package pendataansiswa;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
    
    ArrayList<Siswa> listSiswa = new ArrayList();
    
    public void setList(ArrayList<Siswa> listSiswas) {
        this.listSiswa = listSiswas;
    }

    @Override
    public int getRowCount() {
       return listSiswa.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listSiswa.get(rowIndex).getId();
            case 1:
                return listSiswa.get(rowIndex).getName();
            case 2:
                return listSiswa.get(rowIndex).getAddress();
                default:
                    return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        switch(i) {
            case 0:
                return "Id";
            case 1:
                return "Name";
            case 2:
                return "Address";
                default:
                    return null;
        }
    }
    
    
    
}
