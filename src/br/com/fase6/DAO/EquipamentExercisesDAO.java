package br.com.fase6.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fase5cap7.Activity;

public class EquipamentExercisesDAO implements IDataHandler<Activity>{
	
		
//		ArrayList<EquipmentExercises> equipamentList = new ArrayList<>();
//		equipamentList.add(new EquipmentExercises(1, 100, "Supino Reto", 4));
//		equipamentList.add(new EquipmentExercises(2, 150, "Remo", 3));
//		equipamentList.add(new EquipmentExercises(3, 200, "Barra", 5));
//		equipamentList.add(new EquipmentExercises(4, 250, "Supino Declinado", 3));
//		equipamentList.add(new EquipmentExercises(5, 300, "Desenvolvedor de ombros", 4));
//		equipamentList.add(new EquipmentExercises(6, 350, "Cadeira Flexora", 4));
//		equipamentList.add(new EquipmentExercises(7, 400, "Cadeira Adutora", 4));
//		equipamentList.add(new EquipmentExercises(8, 450, "Steps", 5));
//		equipamentList.add(new EquipmentExercises(9, 500, "Tríceps", 3));
//		equipamentList.add(new EquipmentExercises(10, 550, "Leg Press", 3));
//		
//		return equipamentList;
	

	@Override
	public List<Activity> Getall() {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		List<Activity> listC = new ArrayList<Activity>();
		PreparedStatement stmt;
		try {
			stmt = dao.GetConnection().prepareStatement("SELECT * FROM T_ATIVIDADE, T_PESO");
		
		ResultSet result = null;
		result = dao.GetData(stmt);
		while (result.next()) {
			Activity c = new Activity(0, null);
			c.setNameActivity(result.getString("T_ATIVIDADE"));
			c.setIdActivity(result.getInt("CD_ATIVIDADE"));
			listC.add(c);
		}
		return listC;
		
		} catch (SQLException e) {
			e.printStackTrace();
	}
		return null;
	}

	@Override
	public Activity GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	//----Adicionar------
	@Override
	public int Add(Activity obj) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		try {
			PreparedStatement stmt = dao.GetConnection().prepareStatement(
					"INSERT INTO T_ATIVIDADE (CD_ATIVIDADE, NM_ATIVIDADE)"
					+ "VALUES (SEQ_ATIVIDADE.NEXTVAL, 'SUPINO RETO')");
			
			stmt = dao.GetConnection().prepareStatement(
					"INSERT INTO T_ATIVIDADE (CD_ATIVIDADE, NM_ATIVIDADE)"
					+ "VALUES (SEQ_ATIVIDADE.NEXTVAL, 'REMO')");
			
			stmt = dao.GetConnection().prepareStatement(
					"INSERT INTO T_ATIVIDADE (CD_ATIVIDADE, NM_ATIVIDADE)"
					+ "VALUES (SEQ_ATIVIDADE.NEXTVAL, 'SUPINO DECLINADO')");
			
			stmt = dao.GetConnection().prepareStatement(
					"INSERT INTO T_ATIVIDADE (CD_ATIVIDADE, NM_ATIVIDADE)"
					+ "VALUES (SEQ_ATIVIDADE.NEXTVAL, 'CADEIRA FLEXORA')");
			
			stmt = dao.GetConnection().prepareStatement(
					"INSERT INTO T_ATIVIDADE (CD_ATIVIDADE, NM_ATIVIDADE)"
					+ "VALUES (SEQ_ATIVIDADE.NEXTVAL, 'LEG PRESS')");
			return dao.ExecuteCommand(stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	//------Deletar--------
	@Override
	public int Delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	//-------Atualizar----------
	@Override
	public int Update(Activity obj) {
		
		// TODO Auto-generated method stub
		return 0;
	}

}
