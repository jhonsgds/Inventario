package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
	Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Usuario validar(String user, String pass) {
        Usuario us = new Usuario();
        String sql = "select * from usuario where User=? and Password=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
            	us.setId(rs.getInt("IdUsuario"));
                us.setNombre(rs.getString("Nombres"));
                us.setApellido(rs.getString("Apellidos"));
                us.setTelefono(rs.getInt("Telefono"));
                us.setEmail(rs.getString("Email"));
                us.setUser(rs.getString("User"));
                us.setPass(rs.getString("Password"));
            }
        } catch (Exception e) {
        }
        return us;
    }

    // registrar usuario
	public int agregar(Usuario us) {
		String sql = "INSERT INTO usuario(Nombres, Apellidos, Telefono, Email, User, Password) VALUES (?,?,?,?,?,?)";
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.setString(1, us.getNombre());
			ps.setString(2, us.getApellido());
			ps.setInt(3, us.getTelefono());
			ps.setString(4, us.getEmail());
			ps.setString(5, us.getUser());
			ps.setString(6, us.getPass());
			ps.executeUpdate();
		}catch(Exception e) {
			
		}
		return r;
	}
	
	//mostrar usuarios
	public List mostrar() {
		String sql = "select * from usuario";
		List<Usuario>lista = new ArrayList<>();
		try {
			con = cn.Conexion();
	        ps = con.prepareStatement(sql);
	        rs = ps.executeQuery();
	        while(rs.next()) {
	        	Usuario us = new Usuario();
	        	us.setId(rs.getInt(1));
	        	us.setNombre(rs.getString(2));
	        	us.setApellido(rs.getString(3));
	        	us.setTelefono(rs.getInt(4));
	        	us.setEmail(rs.getString(5));
	        	us.setUser(rs.getString(6));
	        	lista.add(us);
	        }
		}catch(Exception e) {
			
		}
		return lista;
	}
	
    public Usuario listarId(int id){
        Usuario usu=new Usuario();
        String sql="select * from usuario where IdUsuario="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
	        	usu.setNombre(rs.getString(2));
	        	usu.setApellido(rs.getString(3));
	        	usu.setTelefono(rs.getInt(4));
	        	usu.setEmail(rs.getString(5));
	        	usu.setUser(rs.getString(6));
	        	usu.setPass(rs.getString(7));
            }
        } catch (Exception e) {
        }
        return usu;
    }
	
	//actualizar usuario
	public int actualizar(Usuario us) {
		String sql = "UPDATE usuario SET Nombres=?,Apellidos=?,Telefono=?,Email=?,User=?,Password=? WHERE IdUsuario=?";
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.setString(1, us.getNombre());
			ps.setString(2, us.getApellido());
			ps.setInt(3, us.getTelefono());
			ps.setString(4, us.getEmail());
			ps.setString(5, us.getUser());
			ps.setString(6, us.getPass());
			ps.setInt(7, us.getId());
			ps.executeUpdate();
		}catch(Exception e){
			
		}
		return r;
	}
	
	//eliminar usuario
	public void eliminar(int id) {
		String sql = "delete from usuario where IdUsuario=" + id;
		try {
			con=cn.Conexion();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e) {
			
		}
	}
	
	
}