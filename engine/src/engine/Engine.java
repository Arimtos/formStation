package engine;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Engine {
	File htmlTemplateFile;
	String htmlString;
	String title;
	String body;
	public Engine()  {

	
	}
   public void run() throws IOException{
		htmlTemplateFile = new File("template.html");
		htmlString= FileUtils.readFileToString(htmlTemplateFile, "UTF-8");
		String title = "New Page";
		String body = "This is Body";
		htmlString = htmlString.replace("$title", title);
		htmlString = htmlString.replace("$body", body);
		File newHtmlFile = new File("new.html");
		FileUtils.writeStringToFile(newHtmlFile, htmlString,"UTF-8");

	}
   
    }
