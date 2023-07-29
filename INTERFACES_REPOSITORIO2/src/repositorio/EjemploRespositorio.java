package repositorio;
import java.util.List;
public class EjemploRespositorio {
    public static void main(String[] args) {
// Inicializamos
ProductosDAO productosDAO = new ProductosDAOImpl();
 // agregar productos
productosDAO.listarProductos().add(new Productos(1, "Laptops", 32, "Unidad"));
productosDAO.listarProductos().add(new Productos(2, "PCs", 15, "Unidad"));

// traer los metodos
List<Productos> productosOrdenadosPorID = productosDAO.ordenarProductosPorCampo("id");
List<Productos> productosOrdenadosPorProducto = productosDAO.ordenarProductosPorCampo("producto");

// imprimir
System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
System.out.println("Productos ordenados por ID:");
		for (Productos producto : productosOrdenadosPorID) {
System.out.println("ID: " + producto.getId());
System.out.println("Producto: " + producto.getProducto());
System.out.println("Cantidad in Stock: " + producto.getCantStock());
System.out.println("Presentacion: " + producto.getPresentacion());
  }
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
System.out.println("Productos ordenados por NOMBRE:");
            for (Productos producto : productosOrdenadosPorProducto) {
System.out.println("ID: " + producto.getId());
System.out.println("Producto: " + producto.getProducto());
System.out.println("Cantidad in Stock: " + producto.getCantStock());
System.out.println("Presentacion: " + producto.getPresentacion());
     }
        	System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
 }
}
