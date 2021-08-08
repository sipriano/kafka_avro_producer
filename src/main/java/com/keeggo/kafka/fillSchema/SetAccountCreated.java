package com.keeggo.kafka.fillSchema;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.account_created;

public class SetAccountCreated {
	
	public static final String TOPIC = new String("account-created");
	
	public ProducerRecord<String, Object> setSchema(){
	
	account_created accountCreated = account_created.newBuilder().setId("unmQpSbZhENsvAVYZghx")
																 .setRecordType("dfasd")
																 .setRecordGroup("dsfgsd")
																 .setName("gfdsg")
																 .setCode("gfdsfd")
																 .setCreatedAt(1646546l)
																 .setUserCreated("fgsdfgsd")
																 .build();
	
	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
			accountCreated);

	System.out.println(accountCreated);
	
	return producerRecord;
	
	}
}
