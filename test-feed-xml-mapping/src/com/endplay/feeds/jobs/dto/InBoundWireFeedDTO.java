package com.endplay.feeds.jobs.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * DTO class for Inbound feed
 * @author Dileep Kanneganti
 *
 */
public class InBoundWireFeedDTO<E> implements Serializable {

	/** */
	private static final long serialVersionUID = 3926519776361601011L;
	
	private String id;
	private String lastRetrivedArticleId;
	private Calendar updated;
	private int numClosings;
	
	private List<E> entries = new ArrayList<E>();
	private E entry;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the lastRetrivedArticleId
	 */
	public String getLastRetrivedArticleId() {
		return lastRetrivedArticleId;
	}

	/**
	 * @param lastRetrivedArticleId the lastRetrivedArticleId to set
	 */
	public void setLastRetrivedArticleId(String lastRetrivedArticleId) {
		this.lastRetrivedArticleId = lastRetrivedArticleId;
	}

	/**
	 * @return the updated
	 */
	public Calendar getUpdated() {
		return updated;
	}

	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(Calendar updated) {
		this.updated = updated;
	}

	/**
	 * @return the entries
	 */
	public List<E> getEntries() {
		List<E> tempList = new ArrayList<E>(this.entries);
		if (this.entries != null && this.entries.size() > 0) {
			return this.entries;
		} else if (this.entry != null) {
			tempList.add(getEntry());
			return tempList;
		} else {
			return null;
		}
	}

	/**
	 * @param entries the entries to set
	 */
	public void setEntries(List<E> entries) {
		this.entries = entries;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InBoundWireFeedDTO))
			return false;
		@SuppressWarnings("unchecked")
		InBoundWireFeedDTO<E> castOther = (InBoundWireFeedDTO<E>) other;
		return new EqualsBuilder().append(id, castOther.id)
				.append(lastRetrivedArticleId, castOther.lastRetrivedArticleId)
				.append(updated, castOther.updated)
				.append(entry, castOther.entry)
				.append(entries, castOther.entries).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(lastRetrivedArticleId)
				.append(updated).append(entries).append(entry).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("id", id)
				.append("lastRetrivedArticleId", lastRetrivedArticleId)
				.append("updated", updated).append("entries", entries)
				.append("entry", entry)
				.toString();
	}

	public int getNumClosings() {
		return numClosings;
	}

	public void setNumClosings(int numClosings) {
		this.numClosings = numClosings;
	}

	public E getEntry() {
		return entry;
	}

	public void setEntry(E entry) {
		this.entry = entry;
	}


	
	
}