package kafkasimplesender;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

public class MessagePartitioner implements Partitioner{

	@Override
	public void configure(Map<String, ?> configs) {
		// TODO Auto-generated method stub
		System.out.println("configuring the partitions.....");
	}

	@Override
	public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
		// TODO Auto-generated method stub
		int partition=3;
		
		if(key.equals("key-1")) {
			partition=2;
		}
		else if(key.equals("key-2")) {
			partition=3;
		}
		else if(key.equals("key-3")) {
			partition=1;
		}
		return partition;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("closing....");
		
	}

}
