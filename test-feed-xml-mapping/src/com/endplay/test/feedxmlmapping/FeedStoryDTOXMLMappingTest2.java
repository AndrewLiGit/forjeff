package com.endplay.test.feedxmlmapping;


import com.endplay.feeds.jobs.dto.FeedEntry;
import com.endplay.feeds.jobs.dto.FeedStoryDTO;
import com.endplay.feeds.jobs.dto.ImageDTO;
import com.endplay.feeds.jobs.dto.InBoundWireFeedDTO;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.JAXBContextFactory;

public class FeedStoryDTOXMLMappingTest2 {
	
	/*This is feed XML mapping*/
    private static File xmlmapping = new File("resource/feedentry(azteca)_feedmapping3.xml");
//    private static File xmlmapping = new File("resource/feedstorydto(ap)_feedmapping.xml");
    
    /*This is feed XML source*/
    private static File xmlsource = new File("resource/feedentry(azteca)_source.xml");
//    private static File xmlsource = new File("resource/feedstorydto(ap)_source.xml");


	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Map<String, Object> properties = new HashMap<String, Object>(1);
        //properties.put(JAXBContextProperties.OXM_METADATA_SOURCE, xmlmapping);
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, xmlmapping);

        JAXBContext jc = JAXBContext.newInstance("com.endplay.feeds.jobs.dto", FeedEntry.class.getClassLoader(), properties);

        Unmarshaller unmarshaller = jc.createUnmarshaller();

        //unmarshal ROOT entry.
        FeedEntry feedEntry = (FeedEntry) unmarshaller.unmarshal(xmlsource);
        System.out.println("title: " + feedEntry.getString("title"));
        List<FeedEntry> storyEntries = feedEntry.getList("stories");
        System.out.println("externalStoryId: " + storyEntries.get(0).getString("externalStoryId"));
        System.out.println("headline: " + storyEntries.get(0).getString("headline"));
        System.out.println("abstract: " + storyEntries.get(0).getString("abstract"));
        System.out.println("body: " + storyEntries.get(0).getString("body"));
        System.out.println("author: " + storyEntries.get(0).getString("author"));
        List<FeedEntry> imageEntries = storyEntries.get(0).getList("images");
        System.out.println("location: " + imageEntries.get(0).getString("location"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
        
//        System.out.println(feedEntry);
	}

}
