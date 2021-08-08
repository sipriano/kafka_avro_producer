package com.keeggo.kafka.fillSchema;

import java.time.Instant;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.affiliation_created;

public class SetAffiliationCreated {

	public static final String TOPIC = new String("affiliation-created");
	
	public ProducerRecord<String, Object> setSchema(){
		
	affiliation_created affiliationCreated = affiliation_created.newBuilder().setId("unmQpSbZhENsvAVYZghx")
																 .setId("dasdfasdf")
																 .setDescription("fdfadghakjf")
																 .setRole("kjalkdfj")
																 .setContact("dfadfasdfa")
																 .setAccount("asdas")
																 .setStartDate(Instant.parse("2022-02-03T11:25:30.00Z"))
																 .setEndDate(Instant.parse("2022-02-03T11:25:30.00Z"))
																 .setStatus(TOPIC)
																 .setPrimary(true)
																 .setCreatedAt(1646546l)
																 .setUserCreated("dasdasd")
																 .build();
	
	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
			affiliationCreated);

	System.out.println(affiliationCreated);
	
	return producerRecord;
	
	}
	
	
}
