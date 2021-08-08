package com.keeggo.kafka.fillSchema;

import org.apache.kafka.clients.producer.ProducerRecord;
import java.time.LocalDate;

import br.com.cogna.test_created;

public class SetTestCreated {

	public static final String TOPIC = new String("test-created");
	
	public ProducerRecord<String, Object> setSchema(){
	//Date date = Date.from(LocalDate.of(2021,8,4).atStartOfDay(ZoneId.systemDefault()).toInstant());
	test_created testCreated = test_created.newBuilder()
			 .setId("unmQpSbZhENsvAVYZghx")
			 .setDateReceived(LocalDate.now())
			 .setSource("dsfgsd")
			 .setTestDate(LocalDate.now())
			 .setType("gfdsfd")
			 .setContact("sdasdas")
			 .setCode("sdaeds")
			 .setYear(2020)
			 .setRecordActive(true)
			 .setCreatedAt(1646546l)
			 .setUserCreated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	testCreated);
	
	System.out.println(testCreated);
	
	return producerRecord;
	
	}
	
}
