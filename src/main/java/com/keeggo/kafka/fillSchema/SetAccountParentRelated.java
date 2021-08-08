package com.keeggo.kafka.fillSchema;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.account_parent_related;

public class SetAccountParentRelated {

	public static final String TOPIC = new String("account-parent-related");
	
	public ProducerRecord<String, Object> setSchema(){
		
		account_parent_related accountParentRelated = account_parent_related.newBuilder().setParentId("unmQpSbZhENsvAVYZghx")
																 .setChildId("dfasd")
																 .setCreatedAt(1646546l)
																 .setUserCreated("gfdsg")
																 .build();
	
	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
			accountParentRelated);

	System.out.println(accountParentRelated);
	
	return producerRecord;
	
	}
	
}
