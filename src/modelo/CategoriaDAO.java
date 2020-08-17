package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class CategoriaDAO {

	Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    // registrar categoria
	public int agregar(Categoria cat) {
		String sql = "INSERT INTO tipo(Tipo) VALUES (?)";
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.setString(1, cat.getTipo());
			ps.executeUpdate();
		}catch(Exception e) {
			
		}
		return r;
	}
    
    //mostrar categorias
	public List mostrar() {
		String sql = "select * from tipo";
		List<Categoria>lista = new ArrayList<>();
		try {
			con = cn.Conexion();
	        ps = con.prepareStatement(sql);
	        rs = ps.executeQuery();
	        while(rs.next()) {
	        	Categoria cat = new Categoria();
	        	cat.setId(rs.getInt(1));
	        	cat.setTipo(rs.getString(2));
	        	cat.setStock(rs.getInt(3));
	        	lista.add(cat);
	        }
		}catch(Exception e) {
			
		}
		return lista;
	}
	
    public Categoria listarId(int id){
        Categoria cat=new Categoria();
        String sql="select * from tipo where IdTipo="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
	        	cat.setTipo(rs.getString(2));
	        	cat.setStock(rs.getInt(3));
            }
        } catch (Exception e) {
        }
        return cat;
    }
    
	//actualizar categoria
	public int actualizar(Categoria cat) {
		String sql = "UPDATE tipo SET Tipo=? WHERE IdTipo=?";
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.setString(1, cat.getTipo());
			ps.setInt(2, cat.getId());
			ps.executeUpdate();
		}catch(Exception e){
			
		}
		return r;
	}
	
	//eliminar categoria
	public void eliminar(int id) {
		String sql = "delete from tipo where IdTipo=" + id;
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e) {
			
		}
	}
	
}
