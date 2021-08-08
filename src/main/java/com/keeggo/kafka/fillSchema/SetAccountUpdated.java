package com.keeggo.kafka.fillSchema;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.account_updated;

public class SetAccountUpdated {

	public static final String TOPIC = new String("account-updated");
	
	public ProducerRecord<String, Object> setSchema(){
		
	account_updated accountUpdated = account_updated.newBuilder().setId("unmQpSbZhENsvAVYZghx")
																 .setRecordType("dfasd")
																 .setRecordGroup("dsfgsd")
																 .setName("gfdsg")
																 .setCode("gfdsfd")
																 .setUpdatedAt(1646546l)
																 .setUserUpdated("fgsdfgsd")
																 .build();
	
	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
			accountUpdated);

	System.out.println(accountUpdated);
	
	return producerRecord;
	
	}
	
}
