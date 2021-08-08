package com.keeggo.kafka.fillSchema;

import java.time.Instant;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.term_updated;

public class SetTermUpdated {

	public static final String TOPIC = new String("term-updated");
	
	public ProducerRecord<String, Object> setSchema(){
	
	term_updated termUpdated = term_updated.newBuilder()
			.setId("unmQpSbZhENsvAVYZghx")
			 .setName("gfdsg")
			 .setStartDate(Instant.parse("2020-02-03T11:25:30.00Z"))
			 .setEndDate(Instant.parse("2020-02-03T11:25:30.00Z"))
			 .setGradingPeriodSequence(1.0f)
			 .setInstructionalDays(80.0f)
			 .setType("gfdsfd")
			 .setAccount("sdasd")
			 .setParentTerm("20212")
			 .setUpdatedAt(1646546l)
			 .setUserUpdated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	termUpdated);
	
	System.out.println(termUpdated);
	
	return producerRecord;
	
	}
	
}
