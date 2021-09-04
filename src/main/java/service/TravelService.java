package service;

import org.springframework.stereotype.Service;

@Service
public class TravelService {
	private TravelFactory factory;
	private List<Travel> travels;

	public void createTravelFactory() {
		if (factory == null) {
			factory = new TravelFactoryImpl();
		}
	}
	
	
}
