package fr.diginamic.jdbc.dao;

import java.util.List;

import fr.diginamic.jdbc.bo.Fournisseur;

//requete pour la table fournisseur mariadb
public class FournisseurDaoJdbc {

	private static String SELECT= "SELECT * FROM fournisseur;";
	private static String INSERT= "INSERT INTO fournisseur (NOM) VALUES ('%s');";
	private static String UPDATE= "UPDATE fournisseur SET nom='%s' WHERE nom LIKE '%s';";
	private static String DELETE = "DELETE FROM fournisseur WHER nom LIKE '%s';" ;
	private static String SELECTBYID = " SELECTBYID *FROM fournisseur;"; 
	
public void	insert () {
	//requete sql
}

public void	update () {
	
}
	public void delete(){
		
	}
	public List<Fournisseur>selectAll (){
		return null;
	}
public Fournisseur selectbyId (){
	return null;	
	}
}
