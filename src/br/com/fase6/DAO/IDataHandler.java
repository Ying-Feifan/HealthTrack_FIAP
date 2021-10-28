package br.com.fase6.DAO;

import java.util.List;

public interface IDataHandler <T>{
	
	public List<?> Getall();
	
	public T GetById(int id);
	
	public int Add(T obj);
	
	public int Delete (int id);
	
	public int Update (T obj);

}
