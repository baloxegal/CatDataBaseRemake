package main;

import java.util.ArrayList;
import java.util.List;

public class ExampleApp {

	public static void main(String[] args) {
		
// Producer(Source)//
		
		List<String> name = new ArrayList<>();
		name.add("Johny");
		name.add("Oscar");
		name.add("Marry");
		name.add("Poppins");
		name.add("Zoia");

//Stream - Temporary//
		
		name.stream()
			.skip(2)
			.filter(ExampleApp :: select)
			.forEach(ExampleApp :: show); //convert to stream
		
//Consumer//
		
	}
	public static void show(String v){
		System.out.println(v);
	}
	public static boolean select(String v){
		return v.startsWith("Z");
	}
}
