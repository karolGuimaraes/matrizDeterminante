package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objeto.Matriz;


public class MatrizDB {
	static public synchronized Integer addMatriz (Integer m1, Integer m2, Integer m3, Integer m4){
		try{	
		ConexaoDB a = new ConexaoDB();
		a.iniciaDb();
		Connection c = a.getConexao();
		
		int det  = ((m1*m4)-(m2*m3));
		System.out.println(det);
		
		PreparedStatement ps = (PreparedStatement) c.prepareStatement("INSERT INTO matriz (m1, m2, m3, m4, determinante) Values (?,?,?,?,?)"); 
		ps.setInt(1, m1);
		ps.setInt(2, m2);
		ps.setInt(3, m3);
		ps.setInt(4, m4);
		ps.setInt(5, det);
		
		ps.executeUpdate();
		ps.close();
		c.close();
		a.fechaBd();
	    return det;
	    }
		    catch ( Exception e ) {
	           e.printStackTrace();
			   return 0;
		      }
	}
	
	static  public synchronized ArrayList<Matriz> listaMatriz()
	{
		ArrayList<Matriz> patr = new ArrayList<Matriz>();
		try
	    {  
		   ConexaoDB conb = new ConexaoDB();
		   conb.iniciaDb();
		   Connection con = conb.getConexao();
		   
		   PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * from matriz"); 
		   ResultSet res =  (ResultSet) ps.executeQuery();
		   
		   while(res.next())
		   {
			   Matriz pat = new Matriz();
			   pat.setM1(res.getInt("m1"));
			   pat.setM2(res.getInt("m2"));
			   pat.setM3(res.getInt("m3"));
			   pat.setM4(res.getInt("m4"));
			   pat.setDeterminante(res.getInt("determinante"));
			   patr.add(pat);
			   
		   }
		   ps.close();
		   con.close();
		   conb.fechaBd();
	    }
		catch(Exception e)
		{
			patr = null;
		}
		return patr;
	}
	
}
