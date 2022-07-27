package co.grandcircus.DonutAPILab.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.DonutAPILab.models.Donut;
import co.grandcircus.DonutAPILab.models.DonutResponse;

@Service
public class DonutApiService {
	private RestTemplate request = new RestTemplate();
	
	public List<Donut> getDonuts(){
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = request.getForObject(url, DonutResponse.class);
		return response.getDonuts();
	}
	
	public Donut getDonut(int id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{id}.json";
		Donut response = request.getForObject(url, Donut.class, id);
		return response;
	}
}
