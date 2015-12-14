package com.sample.test.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Sample {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().create();
		Bird b = new Bird();
		b.setId("001");
		b.setName("Crow");
		b.setFamily("Crow");
		b.setVisible(true);
		b.setAdded("2015-12-14");
		String[] arr={"Asia", "Europe"};
		b.setContinents(arr);
		String payloadStr = gson.toJson(b);

		System.out.println(payloadStr);
	}
}
