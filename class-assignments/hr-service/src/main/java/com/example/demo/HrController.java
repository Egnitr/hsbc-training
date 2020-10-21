package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HrController {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping(path="/hr/emp/details",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getEmpInfo(@RequestParam("id") int empId){
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		// Http body
		HttpEntity httpRequest = new HttpEntity<>(headers);

		ResponseEntity<String> response2 = rt.exchange("http://emp-service/emp/find/" +empId, HttpMethod.GET,
				httpRequest, String.class);
		System.out.println(response2.getBody());
		
		return response2;
		
	}

}
