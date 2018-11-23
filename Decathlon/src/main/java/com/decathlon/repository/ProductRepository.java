package com.decathlon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.decathlon.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	@Query(value="select pro.* from product pro inner join store sto on pro.product_id=sto.store_id where product_id=?1 and store_id=?2",nativeQuery=true)
	List<Product> fetchProductDetailsByStoreId(Integer productId,Integer storeId);
	
}
