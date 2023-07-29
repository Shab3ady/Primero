package repositorio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ProductosDAOImpl implements ProductosDAO {
    private List<Productos> listaProductos;
    public ProductosDAOImpl() {
        listaProductos = new ArrayList<>();
    }
    @Override
    public List<Productos> listarProductos() {
        return listaProductos;
    }
    @Override
    public List<Productos> ordenarProductosPorCampo(String campo) {
        List<Productos> copiaProductos = new ArrayList<>(listaProductos);
        switch (campo.toLowerCase()) {
            case "id":
                copiaProductos.sort(Comparator.comparing(Productos::getId));
                break;
            case "producto":
                copiaProductos.sort(Comparator.comparing(Productos::getProducto));
                break;
            case "cant_stock":
                copiaProductos.sort(Comparator.comparingInt(Productos::getCantStock));
                break;
            case "presentacion":
                copiaProductos.sort(Comparator.comparing(Productos::getPresentacion));
                break;
            default:
                throw new IllegalArgumentException("Campo de ordenamiento con error: " + campo);
    }
        return copiaProductos;
    }
	@Override
	public List<Productos> paginarProductos(int pagina, int cantidadPorPagina) {
		// TODO Auto-generated method stub
		return null;
	}
	}
