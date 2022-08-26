package kafkasimplesender;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class SenderWithCustomPartitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, MessagePartitioner.class.getName());
	
		KafkaProducer<String,String> producer = new KafkaProducer<>(props);
		String topic="cfg-topic4";
		for(int i=1;i<=10;i++) {
			ProducerRecord<String,String> record = new ProducerRecord<String,String>(topic,
					"key-1","This is test message -"+i);
			producer.send(record);
		}
		for(int i=1;i<=10;i++) {
			ProducerRecord<String,String> record = new ProducerRecord<String,String>(topic,
					"key-2","This is test message -"+i);
			producer.send(record);
		}
		for(int i=1;i<=10;i++) {
			ProducerRecord<String,String> record = new ProducerRecord<String,String>(topic,
					"key-3","This is test message -"+i);
			producer.send(record);
		}
		for(int i=1;i<=10;i++) {
			ProducerRecord<String,String> record = new ProducerRecord<String,String>(topic,
					"key-4","This is test message -"+i);
			producer.send(record);
		}
	
		producer.close();
	
	}

}
