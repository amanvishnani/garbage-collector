package com.project.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.core.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	public Product getByName(String name);

	@Query("Select p from Product p where p.id >= :id")
	public List<Product> findByGtProductId(@Param("id") Long id);
	
	
	
}
