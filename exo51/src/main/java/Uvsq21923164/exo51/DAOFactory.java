package Uvsq21923164.exo51;

public class DAOFactory  {
	
	public static DAO<Personnel> getPersonnelDAO() {
		return new PersonnelSerialDAO();
	}
	
	public static DAO<PersonnelGroupe> getPersonnelGroupeDAO() {
		return new PersonnelGroupeSerialDAO();
	}
	
}
