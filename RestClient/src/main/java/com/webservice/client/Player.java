package com.webservice.client;

import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
	int id;
	String name;
	String status;
	Date createdTime;
	byte[] jsonFile;
	byte[] xmlFile;

	public Player() {
	}

	public Player(int i, String string, String string2) {
		this.id = i;
		this.name = string;
		this.status = string2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public byte[] getJsonFile() {
		return jsonFile;
	}

	public void setJsonFile(byte[] jsonFile) {
		this.jsonFile = jsonFile;
	}

	public byte[] getXmlFile() {
		return xmlFile;
	}

	public void setXmlFile(byte[] xmlFile) {
		this.xmlFile = xmlFile;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", status=" + status + ", createdTime=" + createdTime
				+ ", jsonFile=" + Arrays.toString(jsonFile) + ", xmlFile=" + Arrays.toString(xmlFile) + "]";
	}

	
}
