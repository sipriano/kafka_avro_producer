package com.keeggo.kafka.fillSchema;

import java.time.Instant;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.affiliation_updated;

public class SetAffiliationUpdated {

	public static final String TOPIC = new String("affiliation-updated");
	
	public ProducerRecord<String, Object> setSchema(){
	
	affiliation_updated affiliationUpdated = affiliation_updated.newBuilder().setId("unmQpSbZhENsvAVYZghx")
			 .setId("dfasd")
			 .setDescription("dsfgsd")
			 .setRole("gfdsg")
			 .setStartDate(Instant.parse("2020-02-03T11:25:30.00Z"))
			 .setEndDate(Instant.parse("2022-02-03T11:25:30.00Z"))
			 .setStatus("asdasdassd")
			 .setPrimary(true)
			 .setUpdatedAt(1646546l)
			 .setUserUpdated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	affiliationUpdated);
	
	System.out.println(affiliationUpdated);
	
	return producerRecord;
	
	}
	
}
