package com.example.dao.batch;

import java.util.List;

import com.example.model.Example;
import com.example.model.Object1;
import com.example.model.Object2;

public interface ExampleBatchDao {
	
	//method names need to match mapper.xml
	
	public void exampleInsert(Example example) throws DaoTechnicalException, DaoFunctionalException;

	public void object1Insert(Object1 object1) throws DaoTechnicalException, DaoFunctionalException;
	
	public void object2Insert(Object2 object2) throws DaoTechnicalException, DaoFunctionalException;

}
