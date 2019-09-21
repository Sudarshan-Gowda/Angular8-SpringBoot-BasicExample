package com.star.sud.Angular8SpringBootBasicExample.Model;

import java.io.Serializable;

/**
 * @author Sudarshan
 *
 */
public class BasicExampleInfo implements Cloneable, Serializable {

	// Static Attributes
	/////////////////////////
	private static final long serialVersionUID = -5507501544324744037L;

	// Attributes
	//////////////////
	private String projectName;
	private String serverSideLanguage;
	private String frontEndLanguage;
	private String description;

	// Constructor
	////////////////
	public BasicExampleInfo(String projectName, String serverSideLanguage, String frontEndLanguage,
			String description) {
		this.projectName = projectName;
		this.serverSideLanguage = serverSideLanguage;
		this.frontEndLanguage = frontEndLanguage;
		this.description = description;
	}

	// Override Methods
	/////////////////////////
	/**
	 *
	 */
	@Override
	public String toString() {
		return "BasicExampleInfo [projectName=" + projectName + ", serverSideLanguage=" + serverSideLanguage
				+ ", frontEndLanguage=" + frontEndLanguage + ", description=" + description + "]";
	}

	// Properties
	///////////////////
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the serverSideLanguage
	 */
	public String getServerSideLanguage() {
		return serverSideLanguage;
	}

	/**
	 * @param serverSideLanguage the serverSideLanguage to set
	 */
	public void setServerSideLanguage(String serverSideLanguage) {
		this.serverSideLanguage = serverSideLanguage;
	}

	/**
	 * @return the frontEndLanguage
	 */
	public String getFrontEndLanguage() {
		return frontEndLanguage;
	}

	/**
	 * @param frontEndLanguage the frontEndLanguage to set
	 */
	public void setFrontEndLanguage(String frontEndLanguage) {
		this.frontEndLanguage = frontEndLanguage;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
