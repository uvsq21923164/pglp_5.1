package Uvsq21923164.exo51;

public class DAOFactory extends AbstractDAOFactory  {
	
	public DAO<Personnel> getPersonnelDAO() {
		return new PersonnelSerialDAO();
	}
	
	public DAO<PersonnelGroupe> getPersonnelGroupeDAO() {
		return new PersonnelGroupeSerialDAO();
	}
	
}
