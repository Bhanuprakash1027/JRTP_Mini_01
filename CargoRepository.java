package bhanu.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import bhanu.prakash.entity.ItemDetails;

public interface CargoRepository extends JpaRepository<ItemDetails, Integer> {
	
	

}
