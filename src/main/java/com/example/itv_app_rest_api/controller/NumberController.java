package com.example.itv_app_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itv_app_rest_api.entity.NumRequest;
import com.example.itv_app_rest_api.entity.NumResponse;
import com.example.itv_app_rest_api.service.NumService;

@RestController
@RequestMapping("/api")
public class NumberController {
	private final NumService numberService;
	
	@Autowired
	public NumberController(NumService numberService) {
		this.numberService = numberService;
	}
	
	@PostMapping("/print")
	public ResponseEntity<NumResponse> processNumber(@RequestBody NumRequest request){
		NumResponse response = numberService.printN(request.getNum());
		
		if (response.getResult().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        } else {
            return ResponseEntity.ok(response);
        }
	}
}
