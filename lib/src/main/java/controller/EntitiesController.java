package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import model.Entity;
import com.fasterxml.jackson.databind.*;

public class EntitiesController {
	public Entity actualEntity;
	public List<Entity> Entities;
	ObjectMapper mapper = new ObjectMapper();
	/**
	 * Constructor for create the first Entity in a first run of the program
	 */
	public EntitiesController(File mainFile) throws IOException {
		Scanner reader = new Scanner(System.in);
		System.out.println();
		String entityName = reader.nextLine();
		actualEntity = new Entity(entityName);
		mapper.writeValue(mainFile, this);
	}
}
