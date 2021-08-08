package com.keeggo.kafka.fillSchema;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.cogna.test_score_updated;

public class SetTestScoreUpdated {
	
	public static final String TOPIC = new String("test-score-updated");
	
	public ProducerRecord<String, Object> setSchema(){
	
	test_score_updated testScoreUpdated = test_score_updated.newBuilder()
			 .setId("unmQpSbZhENsvAVYZghx")
			 .setPercentile(0.7f)
			 .setScore(8.0f)
			 .setSubjectArea("gfdsg")
			 .setTest("gfdsfd")
			 .setUpdatedAt(1646546l)
			 .setUserUpdated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	testScoreUpdated);
	
	System.out.println(testScoreUpdated);
	
	return producerRecord;
	
	}

}
