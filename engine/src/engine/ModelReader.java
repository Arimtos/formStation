package engine;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
public class ModelReader {
	private static String model;
	private static String form;
	public ModelReader() {
	}



	public static void lexicalScanner() throws IOException {
		StringBuilder text=new StringBuilder("");
		File file=new File("example1");
		BufferedReader read=new BufferedReader(new FileReader(file));
		String st;
		while((st=read.readLine())!=null)
			text.append(st);
		String modify=text.toString();
		modify= modify.replaceAll("\\s+","");
		modify=modify.replaceAll("@", " ");
		model= extractModel(modify);
		form=extractForm(model);
		
     

	}
	public static String extractModel(String document) {
		int begin=document.indexOf("<xforms:model>");
		int end=document.indexOf( "</xforms:model>")+1;
		String text=document.substring(begin,end);
		return text;
	}
	public static String extractForm(String document) {
		int begin=document.indexOf("<Xf:form>");
		int end=document.indexOf("</xf:form")+1;
		String text=document.substring(begin,end);
	    return text;
	}
}
