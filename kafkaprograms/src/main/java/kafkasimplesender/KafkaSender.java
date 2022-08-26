package kafkasimplesender;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class KafkaSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Assign the properties for the kafka server
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		
		// create the Kafkaproducer object by passing kafka properties
		KafkaProducer<String, String> producer=new KafkaProducer<>(props);
		
		
		// create a kafka producer record
		// proudcer record needs, topicname, key and value
		
		ProducerRecord<String, String> record=new ProducerRecord<String, String>("cfg-topic2",
				"key-7", "This is test message-8");
		
		
		// send record through proudcer
		
		producer.send(record);
		System.out.println("messages sent");
		producer.close();

	}

}


/*

	p0  ---->k1-->india, k1--->
	
	p1---->




*/