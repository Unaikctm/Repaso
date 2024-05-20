package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloCaballero{
	
	private Conector con;
	
	public ArrayList<Caballero> getCaballeros() {
		ArrayList<Caballero> caballeros = new ArrayList<Caballero>();
		try {
			Statement st = con.getCon().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM caballeros");
			
			while(rs.next()) {
				Caballero caballero = new Caballero();
				caballero.setId(rs.getInt("id"));
				caballero.setNombre(rs.getString("nombre"));
				caballero.setFuerza(rs.getInt("fuerza"));
				caballero.setExperiencia(rs.getInt("experiencia"));
				caballero.setFoto(rs.getString("foto"));
				caballero.setArma_id(rs.getInt("arma_id"));
				caballeros.add(caballero);
			}
			return caballeros;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	public Caballero getCaballero(int id) {
		try {
			PreparedStatement pst =con.getCon().prepareStatement("SELECT * FROM caballeros WHERE id=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				Caballero caballero = new Caballero();
				caballero.setId(rs.getInt("id"));
				caballero.setNombre(rs.getString("nombre"));
				caballero.setFuerza(rs.getInt("fuerza"));
				caballero.setExperiencia(rs.getInt("experiencia"));
				caballero.setFoto(rs.getString("foto"));
				caballero.setArma_id(rs.getInt("arma_id"));
				return caballero;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void setConector(Conector con) {
		this.con= con;
	}
}
