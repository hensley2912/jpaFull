
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Modelo extends AbstractTableModel {
    private String[] encabezados;
    private List <Product> productos;

    public Modelo(String[] encabezados) {
        this.encabezados = encabezados;
        productos = new ArrayList<Product>();
    }

    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }




    public int getRowCount() {
        return productos.size();
    }

    public int getColumnCount() {
        return encabezados.length;
    }
    public String getColumnName(int rowIndex){
    return encabezados[rowIndex];

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Product pro = productos.get(rowIndex);
        String retorno = "";
        switch (columnIndex){
            case 0:
                return pro.getId();
            case 1:
                retorno= pro.getNombreProduct();
                break;
            case 2:
                return pro.getPrecioProducto();
       }
        return retorno;
        //return ;
    }


}
