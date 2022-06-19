package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Entity;
import com.fasterxml.jackson.databind.*;

public class EntitiesController {
	public static Entity actualEntity;
	public static List<Entity> entities = new ArrayList<>();
	private ObjectMapper mapper = new ObjectMapper();
	private Scanner reader = new Scanner(System.in);

	/**
	 * Constructor for create the first Entity in a first run of the program
	 */
	public static void addEntity(File mainFile) throws IOException {
		String entityName = reader.nextLine();
		actualEntity = new Entity(entityName);
		entities.add(actualEntity);
		mapper.writeValue(mainFile, this);
	}
	
	public static void 
}
