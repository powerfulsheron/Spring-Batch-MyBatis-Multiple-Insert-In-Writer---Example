package com.example.service.batch;

import java.util.List;

import com.example.model.Example;
import com.example.model.Object1;
import com.example.model.Object2;

public interface ServiceBatch {

	public void insertExample(Example example);

	public void insertObject1(Object1 object1);
	
	public void insertObject2(Object2 object2);

}
