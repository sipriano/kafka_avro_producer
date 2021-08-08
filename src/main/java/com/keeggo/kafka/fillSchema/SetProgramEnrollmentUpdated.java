package com.keeggo.kafka.fillSchema;

import java.time.Instant;

import org.apache.kafka.clients.producer.ProducerRecord;

import br.com.kroton.program_enrollment_updated;

public class SetProgramEnrollmentUpdated {

	public static final String TOPIC = new String("program-enrollment-updated");
	
	public ProducerRecord<String, Object> setSchema(){
	
	program_enrollment_updated programEnrollmentUpdated = program_enrollment_updated.newBuilder()
			 .setId("unmQpSbZhENsvAVYZghx")
			 .setAdmissionDate(Instant.parse("2020-02-03T11:25:30.00Z"))
			 .setApplicationSubmittedDate(Instant.parse("2021-02-03T11:25:30.00Z"))
			 .setClassStanding("gfdsg")
			 .setCreditsAttempted(10.0f)
			 .setCreditsEarned(10.0f)
			 .setEligibleToEnroll(true)
			 .setStartDate(Instant.parse("2021-02-03T11:25:30.00Z"))
			 .setEndDate(Instant.parse("2021-02-03T11:25:30.00Z"))
			 .setStatus("noturno")
			 .setGradePointAverage(8.0f)
			 .setProgram("asdasd")
			 .setAffiliation("fdsfds")
			 .setContact("edfgdfghfxg")
			 .setProgramPlan("hdlakhsdkaihsd")
			 .setUpdatedAt(1646546l)
			 .setUserUpdated("fgsdfgsd")
			 .build();

	ProducerRecord<String, Object> producerRecord = new ProducerRecord<String, Object>(TOPIC,
	programEnrollmentUpdated);
	
	System.out.println(programEnrollmentUpdated);
	
	return producerRecord;
	
	}
	
	
}
