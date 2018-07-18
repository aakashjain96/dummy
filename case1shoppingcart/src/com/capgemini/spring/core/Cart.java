package com.capgemini.spring.core;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Cart {

	private List<Product> product;
	private Map<String,Integer> map ;

	
	
	

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public void displayOrderedProduts() {
		System.out.println("ordered products\n");

		for (Product p : product) {
		
			
			System.out.println("product id: " + p.getProductId());
			System.out.println("product name: " + p.getProductName());
			System.out.println("product price: " + p.getProductPrice() + "\n");
		}
		
		System.out.println("Product_count");
		
		Map<String,Integer> sorted =new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEachOrdered(x->sorted.put(x.getKey(),x.getValue()));
		
		Set<Entry<String, Integer>> entrySet=sorted.entrySet();
		Iterator<Entry<String, Integer>> it=entrySet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		/*Set<Integer> s=map.keySet();
		TreeMap<Integer,String> tmap=new TreeMap<Integer, String>();
		Iterator<Integer> it=s.iterator();
		while (it.hasNext()) {
			Integer pro = it.next();
			*/
			
		//	tmap.put(pro,p.getProductName());
			
/*			Set<Integer> set=tmap.keySet();
		Iterator<Integer> it1=set.iterator();
			while (it1.hasNext()) {
				Integer pr= it1.next();
				System.out.println(pr+"-"+tmap.values());*/
			
			
		}
	
}
