package com.endplay.feeds.jobs.dto;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * DTO for FeedStory.
 * 
 * @(#)FeedStoryDTO.java
 * @author
 */
/**
 * @author developer
 *
 */
public class FeedStoryDTO implements Serializable {

	/** */
	private static final long serialVersionUID = -8692730890243854139L;

	private Long id;
	
	private Double storyVersion;
	private String externalStoryId;
	private String headline;
	private String longAbstract;
	private String author;
	private String title;
	private String copyright;
	private String byLine;
	private String body;
	private String dateline;
	private String keywords;
	private String shortAbstract;
	private String shortHeadline;
	private String subHeadline;
	private String category;
	private Calendar publishedDate;
	private String description;
	private String name;
	private String feedPublisher;
	private String feedAuthor;
	private String feedStoryCountry;
	private String feedStoryStateProv;
	private String feedStoryCity;
	// private List<ComponentDTO> relatedStories;

	private Long feedId;
	private String pageDESC;
	private List<String> catCollection;
	private String pageKeywords;
	private String pageTitle;
	private Calendar createdDate;
	private Calendar lastModifiedDate;
	private Boolean pageBreakingNews;

	private String additionalAuthor;
	private String byttl;

	private String feedStoryStatus;

	private List<String> bodyAsParagraphs;

	// images
	private List<ImageDTO> images;

	// Videos
	private List<VideoDTO> videos;

	private int storyStatus;
	private String storyArticleId;
	private String topicKeywords;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getStoryVersion() {
        return storyVersion;
    }
    public void setStoryVersion(Double storyVersion) {
        this.storyVersion = storyVersion;
    }
    public String getExternalStoryId() {
        return externalStoryId;
    }
    public void setExternalStoryId(String externalStoryId) {
        this.externalStoryId = externalStoryId;
    }
    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public String getLongAbstract() {
        return longAbstract;
    }
    public void setLongAbstract(String longAbstract) {
        this.longAbstract = longAbstract;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCopyright() {
        return copyright;
    }
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
    public String getByLine() {
        return byLine;
    }
    public void setByLine(String byLine) {
        this.byLine = byLine;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getDateline() {
        return dateline;
    }
    public void setDateline(String dateline) {
        this.dateline = dateline;
    }
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    public String getShortAbstract() {
        return shortAbstract;
    }
    public void setShortAbstract(String shortAbstract) {
        this.shortAbstract = shortAbstract;
    }
    public String getShortHeadline() {
        return shortHeadline;
    }
    public void setShortHeadline(String shortHeadline) {
        this.shortHeadline = shortHeadline;
    }
    public String getSubHeadline() {
        return subHeadline;
    }
    public void setSubHeadline(String subHeadline) {
        this.subHeadline = subHeadline;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Calendar getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(Calendar publishedDate) {
        this.publishedDate = publishedDate;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFeedPublisher() {
        return feedPublisher;
    }
    public void setFeedPublisher(String feedPublisher) {
        this.feedPublisher = feedPublisher;
    }
    public String getFeedAuthor() {
        return feedAuthor;
    }
    public void setFeedAuthor(String feedAuthor) {
        this.feedAuthor = feedAuthor;
    }
    public String getFeedStoryCountry() {
        return feedStoryCountry;
    }
    public void setFeedStoryCountry(String feedStoryCountry) {
        this.feedStoryCountry = feedStoryCountry;
    }
    public String getFeedStoryStateProv() {
        return feedStoryStateProv;
    }
    public void setFeedStoryStateProv(String feedStoryStateProv) {
        this.feedStoryStateProv = feedStoryStateProv;
    }
    public String getFeedStoryCity() {
        return feedStoryCity;
    }
    public void setFeedStoryCity(String feedStoryCity) {
        this.feedStoryCity = feedStoryCity;
    }
    public Long getFeedId() {
        return feedId;
    }
    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }
    public String getPageDESC() {
        return pageDESC;
    }
    public void setPageDESC(String pageDESC) {
        this.pageDESC = pageDESC;
    }
    public List<String> getCatCollection() {
        return catCollection;
    }
    public void setCatCollection(List<String> catCollection) {
        this.catCollection = catCollection;
    }
    public String getPageKeywords() {
        return pageKeywords;
    }
    public void setPageKeywords(String pageKeywords) {
        this.pageKeywords = pageKeywords;
    }
    public String getPageTitle() {
        return pageTitle;
    }
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
    public Calendar getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }
    public Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }
    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    public Boolean getPageBreakingNews() {
        return pageBreakingNews;
    }
    public void setPageBreakingNews(Boolean pageBreakingNews) {
        this.pageBreakingNews = pageBreakingNews;
    }
    public String getAdditionalAuthor() {
        return additionalAuthor;
    }
    public void setAdditionalAuthor(String additionalAuthor) {
        this.additionalAuthor = additionalAuthor;
    }
    public String getByttl() {
        return byttl;
    }
    public void setByttl(String byttl) {
        this.byttl = byttl;
    }
    public String getFeedStoryStatus() {
        return feedStoryStatus;
    }
    public void setFeedStoryStatus(String feedStoryStatus) {
        this.feedStoryStatus = feedStoryStatus;
    }
    public List<String> getBodyAsParagraphs() {
        return bodyAsParagraphs;
    }
    public void setBodyAsParagraphs(List<String> bodyAsParagraphs) {
        this.bodyAsParagraphs = bodyAsParagraphs;
    }
    public List<ImageDTO> getImages() {
        return images;
    }
    public void setImages(List<ImageDTO> images) {
        this.images = images;
    }
    public List<VideoDTO> getVideos() {
        return videos;
    }
    public void setVideos(List<VideoDTO> videos) {
        this.videos = videos;
    }
    public int getStoryStatus() {
        return storyStatus;
    }
    public void setStoryStatus(int storyStatus) {
        this.storyStatus = storyStatus;
    }
    public String getStoryArticleId() {
        return storyArticleId;
    }
    public void setStoryArticleId(String storyArticleId) {
        this.storyArticleId = storyArticleId;
    }
    public String getTopicKeywords() {
        return topicKeywords;
    }
    public void setTopicKeywords(String topicKeywords) {
        this.topicKeywords = topicKeywords;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
	
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof FeedStoryDTO))
            return false;
        FeedStoryDTO castOther = (FeedStoryDTO) other;
        return new EqualsBuilder().append(storyVersion, castOther.storyVersion)
                .append(externalStoryId, castOther.externalStoryId)
                .append(headline, castOther.headline)
                .append(longAbstract, castOther.longAbstract)
                .append(author, castOther.author)
                .append(title, castOther.title)
                .append(copyright, castOther.copyright)
                .append(byLine, castOther.byLine).append(body, castOther.body)
                .append(dateline, castOther.dateline)
                .append(keywords, castOther.keywords)
                .append(shortAbstract, castOther.shortAbstract)
                .append(shortHeadline, castOther.shortHeadline)
                .append(subHeadline, castOther.subHeadline)
                .append(category, castOther.category)
                .append(publishedDate, castOther.publishedDate)
                .append(description, castOther.description)
                .append(name, castOther.name)
                .append(feedPublisher, castOther.feedPublisher)
                .append(feedAuthor, castOther.feedAuthor)
                .append(feedStoryCountry, castOther.feedStoryCountry)
                .append(feedStoryStateProv, castOther.feedStoryStateProv)
                .append(feedStoryCity, castOther.feedStoryCity)
                .append(feedId, castOther.feedId)
                .append(pageDESC, castOther.pageDESC)
                .append(catCollection, castOther.catCollection)
                .append(pageKeywords, castOther.pageKeywords)
                .append(pageTitle, castOther.pageTitle)
                .append(createdDate, castOther.createdDate)
                .append(lastModifiedDate, castOther.lastModifiedDate)
                .append(additionalAuthor, castOther.additionalAuthor)
                .append(byttl, castOther.byttl)
                .append(feedStoryStatus, castOther.feedStoryStatus)
                .append(bodyAsParagraphs, castOther.bodyAsParagraphs)
                .isEquals();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(storyVersion)
                .append(externalStoryId).append(headline).append(longAbstract)
                .append(author).append(title).append(copyright).append(byLine)
                .append(body).append(dateline).append(keywords)
                .append(shortAbstract).append(shortHeadline)
                .append(subHeadline).append(category).append(publishedDate)
                .append(feedPublisher).append(feedAuthor)
                .append(feedStoryCountry).append(feedStoryStateProv)
                .append(feedStoryCity).append(feedId).append(pageDESC)
                .append(catCollection).append(pageKeywords).append(pageTitle)
                .append(createdDate).append(lastModifiedDate)
                .append(additionalAuthor).append(byttl).append(feedStoryStatus)
                .toHashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("storyVersion", storyVersion)
                .append("externalStoryId", externalStoryId)
                .append("headline", headline)
                .append("longAbstract", longAbstract).append("author", author)
                .append("title", title).append("copyright", copyright)
                .append("byLine", byLine).append("body", body)
                .append("dateline", dateline).append("keywords", keywords)
                .append("shortAbstract", shortAbstract)
                .append("shortHeadline", shortHeadline)
                .append("subHeadline", subHeadline)
                .append("category", category)
                .append("publishedDate", publishedDate)
                .append("description", description).append("name", name)
                .append("feedPublisher", feedPublisher)
                .append("feedAuthor", feedAuthor)
                .append("feedStoryCountry", feedStoryCountry)
                .append("feedStoryStateProv", feedStoryStateProv)
                .append("feedStoryCity", feedStoryCity)
                .append("feedId", feedId).append("pageDESC", pageDESC)
                .append("catCollection", catCollection)
                .append("pageKeywords", pageKeywords)
                .append("pageTitle", pageTitle)
                .append("createdDate", createdDate)
                .append("lastModifiedDate", lastModifiedDate)
                .append("additionalAuthor", additionalAuthor)
                .append("byttl", byttl)
                .append("feedStoryStatus", feedStoryStatus)
                .append("bodyAsParagraphs", bodyAsParagraphs)
                .toString();
    }
	
}