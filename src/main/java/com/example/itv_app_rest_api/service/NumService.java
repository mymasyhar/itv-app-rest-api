package com.example.itv_app_rest_api.service;

import org.springframework.stereotype.Service;

import com.example.itv_app_rest_api.entity.NumResponse;

@Service
public class NumService {
	public NumResponse printN(int n) {
		if(n < 2) {
			return new NumResponse("nilai N terlalu kecil", "");
		} else if (n > 10) {
			return new NumResponse("nilai N terlalu besar", "");
		}else {
			String squareHeaderFooter = "=".repeat(n);
			String squareBody = "";
			for(int i=1; i<=n-2; i++) {
				for(int j=1; j<=n; j++) {
					if(j == 1 || j == n) {
						squareBody += "|";
					}else {
						squareBody += " ";
					}
				}
			}
			String result = squareHeaderFooter + squareBody + squareHeaderFooter;
			
			return new NumResponse("OK", result);
		}
		
	}
}
