package br.com.fase5cap7;

import java.util.List;

import br.com.fase6.DAO.EquipamentExercisesDAO;

public class Activity {

	public Activity(int idActivity, String nameActivity) {

		this.idActivity = idActivity;
		this.nameActivity = nameActivity;

	}

	//Propriedades
	private int idActivity;
	private String nameActivity;
	
	

	//---------------Métodos------------------
	public void setIdActivity(int idActivity) {

		this.idActivity = idActivity;	
	}


	public void setNameActivity(String nameActivity) {

		this.nameActivity = nameActivity;

	}

	public int getIdActivity() {

		return this.idActivity;
	}

	public String getNameActivity() {

		return this.nameActivity;
	}
	public int AdicionaAtividade() {
		EquipamentExercisesDAO aDao = new EquipamentExercisesDAO();
		return aDao.Add(this);
		
	}
	public List<Activity> VisualizaAtividades (){
		
		EquipamentExercisesDAO aDao = new EquipamentExercisesDAO();
		return aDao.Getall();
		
	}

	@Override
	public String toString() {
		return "Activity [idActivity=" + idActivity + ", nameActivity=" + nameActivity + "]";
	}

}
