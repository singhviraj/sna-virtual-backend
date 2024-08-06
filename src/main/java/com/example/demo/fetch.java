package com.example.demo;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/")
public class fetch {

	@Autowired
	private repo repos;
	
	@GetMapping("/see")
	public List<modal> getallusers(){
		return  (List<modal>) repos.findAll();
		}
	
	@PostMapping("/see")
	public modal submitdata(@RequestBody modal mode) {
		return repos.save(mode);
	}
	
	@PostMapping("/order")
	public generateorder createorder(@RequestBody int n) throws RazorpayException {
		
		RazorpayClient razorpay = new RazorpayClient("rzp_test_SGUIc5wNZ1VhzI", "5BF9mzHONYZOP5rppNZWjWPz");
		JSONObject orderRequest = new JSONObject();
		orderRequest.put("amount",n);
		orderRequest.put("currency","INR");
		orderRequest.put("receipt", "receipt#1");
		//entity,object,order
		Order order = razorpay.Orders.create(orderRequest);
		System.out.println(order);
		
		//System.out.println( ((Object)order).getClass().getSimpleName());  
		//System.out.println(mode);
		return prepareorder(order) ;
		
		}
	private generateorder prepareorder(Order o) {
		String orderid= o.get("id");
		String currency= o.get("currency");
		int amount= o.get("amount");
		
		return new generateorder(orderid,currency,amount);
	}
	
	
}
