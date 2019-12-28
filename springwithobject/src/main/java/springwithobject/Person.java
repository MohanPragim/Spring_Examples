package springwithobject;

public class Person {

	private Device device;

	public void setDevice(Device device) {
		this.device = device;
	}

	public void getDevice() {
		device.start();
	}
}
