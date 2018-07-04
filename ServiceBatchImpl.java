package com.example.service.batch.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.batch.ExampleBatchDao;
import com.example.model.Example;
import com.example.model.Object1;
import com.example.model.Object2;
import com.example.service.batch.ServiceBatch;

@Service("serviceBatch")
@Transactional
public class ServiceBatchImpl implements ServiceBatch {
	
	@Autowired
	ExampleBatchDao exampleBatchDao;
	
	static final Logger logger = Logger.getLogger(ServiceBatchImpl.class);

	@Override
	public void insertExample(Example example) {
		try {
			exampleBatchDao.insertExample(example);
		} catch (DaoTechnicalException | DaoFunctionalException e) {
			logger.error("Impossible to insert");
		}	
	}
	
		@Override
	public void insertObject1(Object1 object1) {
		try {
			exampleBatchDao.insertObject1(object1);
		} catch (DaoTechnicalException | DaoFunctionalException e) {
			logger.error("Impossible to insert");
		}	
	}
	
		@Override
	public void insertObject2(Object2 object2) {
		try {
			exampleBatchDao.insertObject2(object2);
		} catch (DaoTechnicalException | DaoFunctionalException e) {
			logger.error("Impossible to insert");
		}	
	}
	
}
