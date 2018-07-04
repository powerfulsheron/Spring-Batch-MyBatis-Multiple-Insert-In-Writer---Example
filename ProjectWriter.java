package com.example.batch.item;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.batch.ServiceBatch;

/**
 * @author lcanavag
 *
 */
public class ExampleWriter implements ItemWriter<Example> {
	
	@Autowired
	private ServiceBatch serviceBatch;
	
	private static final Logger logger = Logger.getLogger(ExampleWriter.class);

	@Override
	public void write(List<? extends Example> items) throws Exception {
		
		   for (Example example : items) {
				Object object1 = new Object("foo","bar',example.property1);
				Object object2 = new Object("bar","foo',example.property2);
			   	serviceBatch.object1Insert(object1);
				serviceBatch.object2Insert(object2);
				serviceBatch.exampleInsert(example);
				
	        }
	}
	
}
