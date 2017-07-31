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


public class FeedStoryDTOXMLMappingTest {
    
    /*This is feed XML mapping*/
    private static File xmlmapping = new File("resource/feedentry(azteca)_feedmapping.xml");
//    private static File xmlmapping = new File("resource/feedstorydto(ap)_feedmapping.xml");
    
    /*This is feed XML source*/
    private static File xmlsource = new File("resource/feedentry(azteca)_source.xml");
//    private static File xmlsource = new File("resource/feedstorydto(ap)_source.xml");

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        Map<String, Object> properties = new HashMap<String, Object>(1);
        //properties.put(JAXBContextProperties.OXM_METADATA_SOURCE, xmlmapping);
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, xmlmapping);
//        properties.put("eclipselink-oxm-xml", xmlmapping);
        JAXBContext jc = JAXBContext.newInstance("com.endplay.feeds.jobs.dto", InBoundWireFeedDTO.class.getClassLoader(), properties);

        Unmarshaller unmarshaller = jc.createUnmarshaller();

        //unmarshal ROOT entry.
        FeedEntry feedEntry = (FeedEntry) unmarshaller.unmarshal(xmlsource);
        System.out.println("title: " + feedEntry.getString("title"));
        List<FeedStoryDTO> storyEntries = feedEntry.getList("stories");
        System.out.println("externalStoryId: " + storyEntries.get(0).getExternalStoryId());
        System.out.println("headline: " + storyEntries.get(0).getHeadline());
        System.out.println("abstract: " + storyEntries.get(0).getLongAbstract());
        System.out.println("body: " + storyEntries.get(0).getBody());
        System.out.println("author: " + storyEntries.get(0).getAuthor());
        List<ImageDTO> imageEntries = storyEntries.get(0).getImages();
        System.out.println("location: " + imageEntries.get(0).getLocation());
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
//        System.out.println("headline: " + entries.get(0).getString("headline"));
        
//        System.out.println(feedEntry);

    }

}
