/**
 * 
 */
package com.usman.elastic.model;

/**
 * @author c_farkalit.usman
 *
 */
public class Person {

	private String personId;
	private String name;

	/**
	 * @return the personId
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(String personId) {
		this.personId = personId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Person{personId='%s', name='%s'}", personId, name);
	}
}
