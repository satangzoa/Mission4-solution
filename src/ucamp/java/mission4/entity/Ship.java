package ucamp.java.mission4.entity;

public class Ship {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int replacement;
	private boolean available;
	
	
	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public int getNumberLimit() {
		return numberLimit;
	}


	public void setNumberLimit(int numberLimit) {
		numberLimit = numberLimit;
	}


	public int getReplacement() {
		return replacement;
	}


	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 배 수 량 : " + replacement + "톤");
	}
}
