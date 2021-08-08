package com.keeggo.kafka.fillSchema;

import java.time.Instant;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.address_updated;


public class SetAddressUpdated {

	public static final String TOPIC = new String("address-updated");
	
	public ProducerRecord<String, Object> setSchema(){
		
	address_updated addressUpdated = address_updated.newBuilder().setId("unmQpSbZhENsvAVYZghx")
																 .setAddressType("dfasd")
																 .setDefaultAddress(true)
																 .setLatestEndDate(Instant.parse("2022-02-03T11:25:30.00Z"))
																 .setLatestStartDate(Instant.parse("2020-02-03T11:25:30.00Z"))
																 .setMailingCity("sp")
																 .setMailingCountry("Brasil")
																 .setMailingPostalCode("0000-000")
																 .setMailingState("sp")
																 .setMailingStreet("avenida paulista")
																 .setMailingStreet2("consolação")
																 .setSeasonAlendDay("sadsd")
																 .setSeasonAlendMonth("saddds")
																 .setSeasonAlendYear("2021")
																 .setSeasonalStartDay("erfs")
																 .setSeasonalStartMonth("julho")
																 .setSeasonalStartYear("2021")
																 .setUpdatedAt(1646546l)
																 .setUserUpdated("sadasd")
																 .build();
	
	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
			addressUpdated);

	System.out.println(addressUpdated);
	
	return producerRecord;
	
	}
	
}
