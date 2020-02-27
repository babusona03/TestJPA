package home.dev.jpa.test;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@EntityListeners(DeviceListener.class)
@Table(name = "DEVICE")
public class Device {
	@Id
	@GeneratedValue
	private int devId;
	private String devName;
	
	
	public Device() {
		super();
	}
	public Device(String devName) {
		super();
		this.setDevName(devName);
	}
	
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	@Override
	public String toString() {
		return "Device [devId=" + devId + ", devName=" + devName + "]";
	}
	
}
