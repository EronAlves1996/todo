package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import model.Entity;
import com.fasterxml.jackson.databind.*;

public class EntitiesController {
	public Entity actualEntity;
	public List<Entity> entities = new ArrayList<>();
	private static ObjectMapper mapper = new ObjectMapper();
	private static Scanner reader = new Scanner(System.in);

	/**
	 * Constructor for create the first Entity in a first run of the program
	 */
	public void addEntity(File mainFile) throws IOException {
		String entityName = reader.nextLine();
		Entity newEntity = new Entity(entityName);
		entities.add(newEntity);
	}
	
	public void setActualEntity(int entityId) {
		actualEntity = entities
				.stream()
				.filter(x -> x.getInstanceId() == entityId)
				.findFirst()
				.orElse(null);
	}
	
	public void removeEntity(int entityId) {
		entities = entities
				.stream()
				.filter(x -> x.getInstanceId() != entityId)
				.collect(Collectors.toList());
	}
	
	public void alterEntity(int entityId, String entityName) {
		entities = entities
				.stream()
				.map(x -> {
					if(x.getInstanceId() == entityId) {
						x.setName(entityName);
						return x;
					}
					return x;
				})
				.collect(Collectors.toList());
	}
	
	public List<Entity> showEntities(){
		return entities;
	}
}
