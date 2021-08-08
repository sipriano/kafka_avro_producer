package com.keeggo.kafka.factory;

import org.apache.kafka.clients.producer.ProducerRecord;

import com.keeggo.kafka.fillSchema.*;

public class SchemaFactory {

	public ProducerRecord<String, Object> kafkaProducer(String topic){
		
		ProducerRecord<String, Object> producer = null;
		
		switch (topic) {
		case "account_created":
			
			return new SetAccountCreated().setSchema();
			
		case "account_parent_related":
			
			return new SetAccountParentRelated().setSchema();
		
		case "account_updated":
			
			return new SetAccountUpdated().setSchema();
			
		case "address_updated":
			
			return new SetAddressUpdated().setSchema();
			
		case "affiliation_created":
			
			return new SetAffiliationCreated().setSchema();
			
		case "affiliation_updated":
			
			return new SetAffiliationUpdated().setSchema();
			
		case "contact_account_related":
			
			return new SetContactAccountRelated().setSchema();
			
		case "contact_created":
			
			return new SetContactCreated().setSchema();	
		
		case "contact_updated":
			
			return new SetContactUpdated().setSchema();
			
		case "program_enrollment_created":
			
			return new SetProgramEnrollmentCreated().setSchema();
			
		case "program_enrollment_updated":
			
			return new SetProgramEnrollmentUpdated().setSchema();	
			
		case "term_created":
			
			return new SetTermCreated().setSchema();	
			
		case "term_updated":
			
			return new SetTermUpdated().setSchema();	
			
		case "test_created":
			
			return new SetTestCreated().setSchema();	
			
		case "test_score_updated":
			
			return new SetTestScoreUpdated().setSchema();	
			
		case "test_updated":
			
			return new SetTestUpdated().setSchema();	
			
		}
		
		return producer;
		
	}
	
}
