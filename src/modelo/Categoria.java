package modelo;

public class Categoria {
	int id;
	String tipo;
	int stock;
	
	public Categoria() {
		
	}

	public Categoria(int id, String tipo, int stock) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
