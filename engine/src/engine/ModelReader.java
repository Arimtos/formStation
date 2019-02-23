package engine;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ModelReader {
	private static String model;
	public ModelReader(String model) {
		this.model=model;
	}



	public static void lexicalScanner() {
		List<String> Tokens = new LinkedList<String>(); 
		model= model.replaceAll("\\s+","");
		String stop="";
		while(stop.length()!=model.length()) {
			String element=model.substring('<', '>');
			stop=stop+element;
			Tokens.add(element);
			model=model.substring(model.indexOf('>'),model.lastIndexOf('>'));
		}
         System.out.println("end");




		//public String constructModel() {

		//}

	}
}
