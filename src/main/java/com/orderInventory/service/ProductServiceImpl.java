package com.orderInventory.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springdoc.core.converters.models.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderInventory.entity.Inventory;
import com.orderInventory.entity.Product;
import com.orderInventory.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> fetchAllProducts() {
		List<Product> productList=productRepository.findAll();
		
		return productList;
	}

	

	


	@Override
	public void deleteProductById(int productId) {
		Optional<Product> optionalProduct=productRepository.findById(productId);
		productRepository.deleteById(productId);
		
	}



	@Override
	public List<Product> findByName(String productName) {
	// TODO Auto-generated method stub
	List<Product> listProduct=productRepository.findByProductName(productName);
		return listProduct;
	}


    @Override
	public Product addProduct(Product product) {
	       
	Product addProduct = productRepository.save(product);
	      
	    return addProduct;
	}
    
        
        @Override
        public List<Product> getProductsByUnitPriceRange(BigDecimal minUnitPrice, BigDecimal maxUnitPrice) {
            if (minUnitPrice != null && maxUnitPrice != null) {
                return productRepository.findByUnitPriceBetween(minUnitPrice, maxUnitPrice);
            } else if (minUnitPrice != null) {
                return productRepository.findByUnitPriceGreaterThanEqual(minUnitPrice);
            } else if (maxUnitPrice != null) {
                return productRepository.findByUnitPriceLessThanEqual(maxUnitPrice);
            } else {
                return productRepository.findAll();
            }
        }


}






		
        
       


	

	

	

