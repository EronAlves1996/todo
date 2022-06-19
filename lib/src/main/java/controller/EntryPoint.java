package controller;

import java.io.File;
import java.io.IOException;

public class EntryPoint {
	public final String MAIN_FILE = "main.json";
	private File baseFile = new File(MAIN_FILE);
	
	public EntryPoint() {
		try {
			if (baseFile.createNewFile()) {
				System.out.println("Please put a name to an Entity to start!");
				EntitiesController x = new EntitiesController(baseFile);
			}
			else System.out.println("Please choose an Entity to add a TaskList");
		} catch (IOException e) {
			System.out.println("An error has ocurred: " + e);
		}
	}
	
	public static void main(String ...args) {
		EntryPoint ep = new EntryPoint();
	}
}
