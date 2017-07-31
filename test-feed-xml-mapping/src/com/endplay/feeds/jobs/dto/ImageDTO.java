package com.endplay.feeds.jobs.dto;


public class ImageDTO {
	private String location;
	private String format;
	private Integer width;
	private Integer height;
	private String fileName;
	private String  caption;

	private String photographer;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}



	public String getPhotographer() {
		return photographer;
	}

	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

}
