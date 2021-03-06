package de.hackathon.hackathon.data;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Description
 * @author Henne
 */
public class User extends Body{
	private static final long serialVersionUID = 1947250923485077010L;
	
	private String name;
	private List<Group> groups;
	private long id;
	private ArrayList<User> user = new ArrayList<>();
	
	/**
	 * Get's the name
	 * @return  name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Set's the name
	 * @param name  name
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Get's the groups
	 * @return  groups
	 */
	public List<Group> getGroups() {
		return this.groups;
	}


	/**
	 * Set's the groups
	 * @param groups  groups
	 */
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}


	/**
	 * Get's the id
	 * @return  id
	 */
	public long getId() {
		return this.id;
	}


	/**
	 * Set's the id
	 * @param id  id
	 */
	public void setId(long id) {
		this.id = id;
	}

	
	public List<User> getUser() {
		return this.user;
	}
	
	
	/**
	 * Default Constructor
	 */
	public User(){
	}
	/**
	 * Normal Constructor
	 * @param name name
	 * @param groups groups
	 * @param id id
	 */
	public User(String name , List<Group> groups , String id){
		this.name = name;
		this.groups = groups;
		this.id = id;
	}

}
