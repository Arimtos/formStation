package engine.DataStrucures.components;

public class TextField {
	static private String ID;
	static private String text;
	static private String type;
	static private StringBuilder htmlCode;
	public TextField() {
              this.type="TextField";
	}
	public static String htmlReturn() {
			
		return htmlCode.toString();
		}
	}
