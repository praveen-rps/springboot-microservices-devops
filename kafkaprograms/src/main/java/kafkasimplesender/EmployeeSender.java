package kafkasimplesender;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class EmployeeSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, EmployeeSerializer.class.getName());
		
		KafkaProducer<String, Employee> producer=new KafkaProducer<>(props);
		String topic = "cfg-emp-topic";
		Employee emp = new Employee(1001,"Praveen","Developer");
		ProducerRecord<String,Employee> record= new ProducerRecord(topic,"emp-1",emp);
		producer.send(record);
		producer.close();
		
	}

}
