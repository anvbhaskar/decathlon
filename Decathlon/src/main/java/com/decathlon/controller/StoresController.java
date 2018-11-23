package com.decathlon.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.dto.ProductDto;
import com.decathlon.service.ProductService;

@RestController
@RequestMapping(value="/v1/public")
public class StoresController {
	
	
	// http://localhost:9000/v1/public/stores/1/products/1
	//[{"productName":"Ball","productDecription":"Ball descp","productLevel":"small","productSport":"sports"}]
	
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value="/stores/{storeId}/products/{productId}")
	public @ResponseBody List<ProductDto> fetchProductDetailsByStoreId(
			@PathVariable("productId")Integer productId,
			@PathVariable("storeId")Integer storeId){
		
		return productService.fetchProductDetailsByStoreId(productId, storeId);
	}
	
	@GetMapping
	public void fetchAllProductsByStoreId(){
		
		
	}
}
