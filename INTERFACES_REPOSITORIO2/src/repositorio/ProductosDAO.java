package repositorio;
import java.util.List;
public interface ProductosDAO {
    List<Productos> listarProductos();
    List<Productos> paginarProductos(int pagina, int cantidadPorPagina);
    List<Productos> ordenarProductosPorCampo(String campo);
}