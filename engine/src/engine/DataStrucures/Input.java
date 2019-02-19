package engine.DataStrucures;

public class Input {
	static private String ID;
	static private String text;
	static private String type;
    static private String value;
	
	static private StringBuilder htmlCode;
	public Input(String type,String text,String ID,String Value) {
		this.type=type;
		this.text=text;
		this.ID=ID;
		this.value=Value;
		htmlCode=new StringBuilder();
			}
	public static String makeHTML() {
		htmlCode.append(text);
		htmlCode.append("<input type="+"\""+type+"\""+" ID="+"\""+ID+"\""+" value="+"\""+value+"\""+">"+"<br>");	
		return htmlCode.toString();
	}

}
