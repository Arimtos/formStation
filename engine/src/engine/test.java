package engine;

import java.io.IOException;

import engine.DataStrucures.Input;

public class test {
	public static void main(String[] args) throws IOException {
		Engine test=new Engine();
		Input input=new Input("text","Name","2"," ");
		System.out.print(input.makeHTML());
	}
}
