package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class BienDAO {

	Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    //registrar bien
	public int agregar(Bien bn) {
		String sql = "INSERT INTO bien(IdTipo,Codigo,Nombre,Estado,ubicacion) VALUES (?,?,?,?,?)";
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.setInt(1, bn.getIdc());
			ps.setString(2, bn.getCodigo());
			ps.setString(3, bn.getNombre());
			ps.setString(4, bn.getEstado());
			ps.setString(5, bn.getUbicacion());
			ps.executeUpdate();
		}catch(Exception e) {
			
		}
		return r;
	}
    
    //mostrar bienes
	public List mostrar() {
		String sql = "select bien.IdBien, tipo.Tipo, bien.Codigo, bien.Nombre, bien.Estado, bien.ubicacion from bien inner join tipo on bien.IdTipo = tipo.IdTipo";
		List<Bien>lista = new ArrayList<>();
		try {
			con = cn.Conexion();
	        ps = con.prepareStatement(sql);
	        rs = ps.executeQuery();
	        while(rs.next()) {
	        	Bien bn = new Bien();
	        	bn.setId(rs.getInt(1));
	        	bn.setTipo(rs.getString(2));
	        	bn.setCodigo(rs.getString(3));
	        	bn.setNombre(rs.getString(4));
	        	bn.setEstado(rs.getString(5));
	        	bn.setUbicacion(rs.getString(6));
	        	lista.add(bn);
	        }
		}catch(Exception e) {
			
		}
		return lista;
	}
	
    public Bien listarId(int id){
        Bien bn=new Bien();
        String sql="select * from bien where IdBien="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
	        	bn.setIdc(rs.getInt(2));
	        	bn.setCodigo(rs.getString(3));
	        	bn.setNombre(rs.getString(4));
	        	bn.setEstado(rs.getString(5));
	        	bn.setUbicacion(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return bn;
    }
    
	//actualizar bien
	public int actualizar(Bien bn) {
		String sql = "UPDATE bien SET IdTipo=?, Codigo=?, Nombre=?, Estado=?, ubicacion=? WHERE IdBien=?";
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.setInt(1, bn.getIdc());
			ps.setString(2, bn.getCodigo());
			ps.setString(3, bn.getNombre());
			ps.setString(4, bn.getEstado());
			ps.setString(5, bn.getUbicacion());
			ps.setInt(6, bn.getId());
			ps.executeUpdate();
		}catch(Exception e){
			
		}
		return r;
	}
	
	
}
