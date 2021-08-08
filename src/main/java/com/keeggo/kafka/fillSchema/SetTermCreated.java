package com.keeggo.kafka.fillSchema;

import java.time.Instant;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.term_created;

public class SetTermCreated {

	public static final String TOPIC = new String("term-created");
	
	public ProducerRecord<String, Object> setSchema(){
	
	term_created termCreated = term_created.newBuilder()
			 .setId("unmQpSbZhENsvAVYZghx")
			 .setName("gfdsg")
			 .setStartDate(Instant.parse("2020-02-03T11:25:30.00Z"))
			 .setEndDate(Instant.parse("2020-02-03T11:25:30.00Z"))
			 .setGradingPeriodSequence(1.0f)
			 .setInstructionalDays(80.0f)
			 .setType("gfdsfd")
			 .setAccount("sdasd")
			 .setParentTerm("20212")
			 .setCreatedAt(1646546l)
			 .setUserCreated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	termCreated);
	
	System.out.println(termCreated);
	
	return producerRecord;
	
	}
	
	
}
