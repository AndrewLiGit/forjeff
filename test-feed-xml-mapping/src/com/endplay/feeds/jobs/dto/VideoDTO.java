package com.endplay.feeds.jobs.dto;

import java.io.Serializable;
import java.util.List;


public class VideoDTO implements Serializable {

	/**	 */
	private static final long serialVersionUID = 1L;

	private String location;
	private String format;
	private String fileName;
	private String videographer;
	private String videoTitle;
	private String closedCaptioning;
	private String description;
	private String keywords;
	private Double videoLength;
	private Double latitude;
	private Double longitude;
	private Double videoWidth;
	private Double videoHeight;
	private List<Long> categories;
	
	private byte[] data;

    private List<String> thumbnails;
    
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the videographer
	 */
	public String getVideographer() {
		return videographer;
	}

	/**
	 * @param videographer the videographer to set
	 */
	public void setVideographer(String videographer) {
		this.videographer = videographer;
	}

	/**
	 * @return the videoTitle
	 */
	public String getVideoTitle() {
		return videoTitle;
	}

	/**
	 * @param videoTitle the videoTitle to set
	 */
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	/**
	 * @return the closedCaptioning
	 */
	public String getClosedCaptioning() {
		return closedCaptioning;
	}

	/**
	 * @param closedCaptioning the closedCaptioning to set
	 */
	public void setClosedCaptioning(String closedCaptioning) {
		this.closedCaptioning = closedCaptioning;
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

	/**
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * @return the videoLength
	 */
	public Double getVideoLength() {
		return videoLength;
	}

	/**
	 * @param videoLength the videoLength to set
	 */
	public void setVideoLength(Double videoLength) {
		this.videoLength = videoLength;
	}

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the videoWidth
	 */
	public Double getVideoWidth() {
		return videoWidth;
	}

	/**
	 * @param videoWidth the videoWidth to set
	 */
	public void setVideoWidth(Double videoWidth) {
		this.videoWidth = videoWidth;
	}

	/**
	 * @return the videoHeight
	 */
	public Double getVideoHeight() {
		return videoHeight;
	}

	/**
	 * @param videoHeight the videoHeight to set
	 */
	public void setVideoHeight(Double videoHeight) {
		this.videoHeight = videoHeight;
	}

	/**
	 * @return the categories
	 */
	public List<Long> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Long> categories) {
		this.categories = categories;
	}

	/**
	 * @return the data
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(byte[] data) {
		this.data = data;
	}

	/**
	 * @return the thumbnails
	 */
	public List<String> getThumbnails() {
		return thumbnails;
	}

	/**
	 * @param thumbnails the thumbnails to set
	 */
	public void setThumbnails(List<String> thumbnails) {
		this.thumbnails = thumbnails;
	}

}
