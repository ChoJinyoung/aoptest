package com.bit2015.aoptest.service;

import org.springframework.stereotype.Service;

import com.bit2015.aoptest.vo.ProductVo;

@Service
public class ProductService {
	public ProductVo findProduct(String name){
		System.out.println("call ProductService.findProduct("+name+")");
		ProductVo vo=new ProductVo(name);
		return vo;
	}
}
