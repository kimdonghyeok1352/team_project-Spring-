package co.soft.beans;

public class ContentBean {
	private String air_info_startingpoint;//출발지
	private String air_info_destination;//도착지
	private String air_info_departure;//출발날짜
	private String air_info_arrival; //도착날짜
	
	public String getAir_info_startingpoint() {
		return air_info_startingpoint;
	}
	public void setAir_info_startingpoint(String air_info_startingpoint) {
		this.air_info_startingpoint = air_info_startingpoint;
	}
	public String getAir_info_destination() {
		return air_info_destination;
	}
	public void setAir_info_destination(String air_info_destination) {
		this.air_info_destination = air_info_destination;
	}
	public String getAir_info_departure() {
		return air_info_departure;
	}
	public void setAir_info_departure(String air_info_departure) {
		this.air_info_departure = air_info_departure;
	}
	public String getAir_info_arrival() {
		return air_info_arrival;
	}
	public void setAir_info_arrival(String air_info_arrival) {
		this.air_info_arrival = air_info_arrival;
	}
	public String getAir_info_numberofpeople() {
		return air_info_numberofpeople;
	}
	public void setAir_info_numberofpeople(String air_info_numberofpeople) {
		this.air_info_numberofpeople = air_info_numberofpeople;
	}
	private String air_info_numberofpeople; //인원수
	
}
