package kafkasimplesender;

import java.io.IOException;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDeSerializer implements Deserializer<Employee> {
	
	private ObjectMapper mapper = new ObjectMapper();
	

	@Override
	public Employee deserialize(String topic, byte[] data) {
		// TODO Auto-generated method stub
		Employee employee=null;
		try {
			employee = mapper.readValue(data, Employee.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}

}
