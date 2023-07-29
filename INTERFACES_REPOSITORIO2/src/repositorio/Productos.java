package repositorio;
public class Productos {
    private int id;
    private String producto;
    private int cantStock;
    private String presentacion;
    //constructor
    public Productos(int id, String producto, int cantStock, String presentacion) {
        this.id = id;
        this.producto = producto;
        this.cantStock = cantStock;
        this.presentacion = presentacion;
    }
    //metodos getter
    public int getId() {
        return id;
    }
    public String getProducto() {
        return producto;
    }
    public int getCantStock() {
        return cantStock;
    }
    public String getPresentacion() {
        return presentacion;
    }}
