package cr.ulead.ac.lista;

public class Producto {
	String Codigo;
	String nombre;
	String categoria;
	
	public String getCodigo() {
		return Codigo;
	}



	public void setCodigo(String codigo) {
		Codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	@Override
	public String toString() {
		return "Producto [Codigo=" + Codigo + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}

	

	public Producto(String codigo, String nombre, String categoria) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
	}

}
