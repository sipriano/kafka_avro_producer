package com.keeggo.kafka.fillSchema;

import java.time.LocalDate;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.cogna.test_updated;

public class SetTestUpdated {

	public static final String TOPIC = new String("test-updated");
	
	public ProducerRecord<String, Object> setSchema(){
	
	test_updated testUpdated = test_updated.newBuilder()
			 .setId("unmQpSbZhENsvAVYZghx")
			 .setDateReceived(LocalDate.now())
			 .setSource("dsfgsd")
			 .setTestDate(LocalDate.now())
			 .setType("gfdsfd")
			 .setContact("sdasdas")
			 .setCode("sdaeds")
			 .setYear(2020)
			 .setRecordActive(true)
			 .setUpdatedAt(1646546l)
			 .setUserUpdated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	testUpdated);
	
	System.out.println(testUpdated);
	
	return producerRecord;
	
	}
	
}
