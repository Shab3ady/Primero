package repositorio;

import java.util.List;

import modelo.Cliente;

public interface OrdenableRepositorio<T> {
	List<T> listar(String campo, Direccion dir);
}
