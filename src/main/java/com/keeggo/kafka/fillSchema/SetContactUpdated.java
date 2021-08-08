package com.keeggo.kafka.fillSchema;

import java.time.Instant;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.contact_updated;

public class SetContactUpdated {

	public static final String TOPIC = new String("contact-updated");
	
	public ProducerRecord<String, Object> setSchema(){
	
	contact_updated contactUpdated = contact_updated.newBuilder()
			 .setId("unmQpSbZhENsvAVYZghx")
			 .setId("dfasd")
			 .setRecordType("dsfgsd")
			 .setFullName("gfdsg")
			 .setFirstName("asdasd")
			 .setLastName("fefdsd")
			 .setBirthDate(Instant.parse("1990-09-20T11:25:30.00Z"))
			 .setDocumentNumber("45687613546")
			 .setDoNotCall(true)
			 .setMobilePhone("0000000000")
			 .setHomePhone("0000000000")
			 .setPhone("0000000000")
			 .setMaritalStatus("solteiro")
			 .setHasOptedOutOfEmail(true)
			 .setAlternateEmail("aksjdlçakjsd@jasdl.com")
			 .setChosenFullName("")
			 .setCitizenship("brazilian")
			 .setCountryOfOrigin("brazil")
			 .setDeceased(false)
			 .setDoNotContact(true)
			 .setDualCitizenship("")
			 .setEthnicity("")
			 .setFinancialAidApplicant(true)
			 .setGender("dasdas")
			 .setPreferredPhone("0000000000")
			 .setPreferredEmail("sadsadasd@sdad.com")
			 .setRace("asds")
			 .setReligion("cristao")
			 .setWorkEmail("lkisdhf@as.com")
			 .setWorkPhone("0000000000")
			 .setUpdatedAt(1646546l)
			 .setUserUpdated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	contactUpdated);
	
	System.out.println(contactUpdated);
	
	return producerRecord;
	
	}
	
}
