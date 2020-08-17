package modelo;

public class Bien {
	int id;
	int idc;
	String tipo;
	String codigo;
	String nombre;
	String estado;
	String ubicacion;
	
	public Bien() {

	}

	public Bien(int id, int idc, String tipo, String codigo, String nombre, String estado, String ubicacion) {
		super();
		this.id = id;
		this.idc = idc;
		this.tipo = tipo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.ubicacion = ubicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdc() {
		return idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
}
