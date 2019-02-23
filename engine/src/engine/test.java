package engine;

import java.io.IOException;

import engine.DataStrucures.Input;

public class test {
	public static void main(String[] args) throws IOException {
		Engine test=new Engine();
		Input input=new Input("text","Name","2"," ");
		System.out.print(input.makeHTML());
		ModelReader testtwo=new ModelReader("<xforms>\r\n" + 
				"<model>\r\n" + 
				"  <instance>\r\n" + 
				"  <person>\r\n" + 
				"    <fname/>\r\n" + 
				"    <lname/>\r\n" + 
				"  </person>\r\n" + 
				"  </instance>\r\n" + 
				"  <submission id=\"form1\" method=\"get\"\r\n" + 
				"   action=\"submit.asp\"/>\r\n" + 
				"</model>\r\n" + 
				"\r\n" + 
				"<input ref=\"fname\">\r\n" + 
				"<label>First Name</label></input><br />\r\n" + 
				"\r\n" + 
				"<input ref=\"lname\">\r\n" + 
				"<label>Last Name</label></input><br /><br />\r\n" + 
				"\r\n" + 
				"<submit submission=\"form1\">\r\n" + 
				"<label>Submit</label></submit>\r\n" + 
				"</xforms>");
		testtwo.lexicalScanner();

	}
}
