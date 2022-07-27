package co.grandcircus.DonutAPILab.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutResponse {
	private int count;
	@JsonProperty("results")
	private List<Donut> donuts;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Donut> getDonuts() {
		return donuts;
	}
	public void setDonuts(List<Donut> donuts) {
		this.donuts = donuts;
	}
	
	
}
