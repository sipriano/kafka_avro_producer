package com.keeggo.kafka.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import com.keeggo.kafka.factory.SchemaFactory;

import io.confluent.kafka.serializers.KafkaAvroSerializer;


public class KafkaAvroProducer {

	static String schema = "test_score_updated";

	//public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
	public String produceMessage(String schema) throws IOException, InterruptedException, ExecutionException {
		
		String message = null;
		
		final Properties properties = loadConfig("C:\\Users\\rodrigo.pereira\\eclipse-workspace\\kafka.properties");
		
		properties.put(ProducerConfig.ACKS_CONFIG, "all");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);


		Producer<String, Object> producer = new KafkaProducer<String, Object>(properties);
		
		ProducerRecord<String, Object> producerRecord = new SchemaFactory().kafkaProducer(schema);
		
		if(producerRecord != null) {
		
		Future<RecordMetadata> metadata = producer.send(producerRecord);
		
		message = "Tópico: "+metadata.get().topic()+" Partition: "+metadata.get().partition()+" Offset: "+metadata.get().offset();
		} else {
			
			System.out.println("Schema not set!");
			
		}


		producer.flush();
		producer.close();
		
		return message;

	}
	
	public static Properties loadConfig(final String configFile) throws IOException {
		    if (!Files.exists(Paths.get(configFile))) {
		      throw new IOException(configFile + " not found.");
		    }
		    final Properties cfg = new Properties();
		    try (InputStream inputStream = new FileInputStream(configFile)) {
		      cfg.load(inputStream);
		    }
		    return cfg;
		  }
}
