package com.keeggo.kafka.fillSchema;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.contact_account_related;

public class SetContactAccountRelated {

	public static final String TOPIC = new String("contact-account-related");
	
	public ProducerRecord<String, Object> setSchema(){
	
		contact_account_related contactAccountRelated = contact_account_related.newBuilder()
			 .setParentId("unmQpSbZhENsvAVYZghx")
			 .setChildId("dfasd")
			 .setCreatedAt(1646546l)
			 .setUserCreated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
			contactAccountRelated);
	
	System.out.println(contactAccountRelated);
	
	return producerRecord;
	
	}
	
}
