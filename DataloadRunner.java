package bhanu.prakash.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import bhanu.prakash.entity.ItemDetails;
import bhanu.prakash.repo.CargoRepository;
@Component
public class DataloadRunner implements CommandLineRunner {
	
	@Autowired
	private CargoRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		// GOVERNAMENT TRANSPORT
		ItemDetails I1= new ItemDetails();
		I1.setSendername("bhanu");
		I1.setStatus("Accepted");
		I1.setFrom_add("Guntur");
		I1.setFrom_date(LocalDate.now());
		I1.setTo_date(LocalDate.now().plusDays(1));
		I1.setItem_description("Medicines");
		I1.setTo_add("Ongole");
		I1.setReceivername("hari");
		//I1.setShipment_value(1200.00);
		I1.setTransport_charges(80.00);
		I1.setTransport_plan("GOVT-TRANSPORT");
		
		
		
		ItemDetails I2= new ItemDetails();
		I2.setSendername("Himanth");
		I2.setStatus("In-process");
		I2.setFrom_add("OGL");
		I2.setFrom_date(LocalDate.now());
		I2.setTo_date(LocalDate.now().plusDays(1));
		I2.setItem_description("Medicines");
		I2.setReceivername("Dinesh");
		I2.setTo_add("Hyderabad");
		//I2.setShipment_value(1900.00);
		I2.setTransport_charges(159.00);
		I2.setTransport_plan("PRIVATE-TRANSPORT");
		
		
		
		ItemDetails I3= new ItemDetails();
		I3.setSendername("Himanth");
		I3.setStatus("Teriminated");
		I3.setFrom_add("OGL");
		I3.setFrom_date(LocalDate.now());
		I3.setTerimination_description("liqure not allow");
		I3.setItem_description("Alcohal");
		
		
		
		List<ItemDetails> l1=Arrays.asList(I1, I2, I3);
		repo.saveAll(l1);
	}

	
	
}
