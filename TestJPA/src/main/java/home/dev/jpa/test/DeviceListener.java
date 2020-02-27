package home.dev.jpa.test;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class DeviceListener {
	@PrePersist
	public void beforePersist(Device device){
		System.out.println("Going to Perist:"+device);
	}
	@PostPersist
	public void afterPersist(Device device) {
		System.out.println("Completed Persisting:"+device);
	}
}
