package controller;

import java.io.File;
import java.io.IOException;

public class EntryPoint {
	File baseFile;
	
	public EntryPoint() {
		try {
			baseFile = new File("main.json");
			if (baseFile.createNewFile()) System.out.println("Please create an Entity to start!");
			else System.out.println("Please choose an Entity to add a TaskList");
		} catch (IOException e) {
			System.out.println("An error has ocurred: " + e);
		}
	}
	
	public static void main(String ...args) {
		EntryPoint entryPoint = new EntryPoint();
	}
}
