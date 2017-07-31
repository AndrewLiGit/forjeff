package com.endplay.test.feedxmlmapping;


import com.endplay.feeds.jobs.dto.FeedEntry;

import java.io.File;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.eclipse.persistence.jaxb.JAXBContextFactory;


public class FeedXMLMappingHTTPTest {
    
    /*This is feed XML mapping*/
    //private static File xmlmapping = new File("resource/feedentry(cmgap)_feedmapping.xml");
    private static File xmlmapping = new File("resource/nxs_cnn_feedmapping.xml");

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
    	
    	
		HttpClient client = new HttpClient();
		client.setConnectionTimeout(15000);
		client.setTimeout(15000);
		client.getHostConfiguration().setProxy("192.168.179.199", 8118);
		HttpMethod httpget = new GetMethod("http://www.ibnewscontent.com/17036074?format=rss_2.0&view=feed"); 	
		
		byte[] content = null;
		if (client.executeMethod(httpget) == HttpStatus.SC_OK) {
			content = httpget.getResponseBody();
		}
		
		String source = new String(content, "ISO-8859-1");
		StringReader sr = new StringReader(source);
    	
        //ByteArrayInputStream feedXMLIS = new ByteArrayInputStream(content);

        Map<String, Object> properties = new HashMap<String, Object>(1);
        //properties.put(JAXBContextProperties.OXM_METADATA_SOURCE, xmlmapping);
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, xmlmapping);
//        properties.put(Marshaller.JAXB_ENCODING, "UTF-8");
        //properties.put(Marshaller.JAXB_ENCODING, "ISO-8859-1");


        JAXBContext jc = JAXBContext.newInstance("com.endplay.feeds.jobs.dto", FeedEntry.class.getClassLoader(), properties);

        Unmarshaller unmarshaller = jc.createUnmarshaller();

        
        //

        //unmarshal ROOT entry.
        FeedEntry feedEntry = (FeedEntry) unmarshaller.unmarshal(sr);
        
        
        
//        //get attributes from root entry.
        System.out.println("lastRetrivedArticleId :"+feedEntry.getString("lastRetrivedArticleId"));
//        System.out.println("updated:" + feedEntry.getString("updated"));
//        
//        //get attributes from entry.
        List<FeedEntry> entries = feedEntry.getList("entries");
        System.out.println("Entries size:" + entries.size());
        for (FeedEntry entry : entries) {
            System.out.println("headline:" + entry.getString("headline"));
//            System.out.println("body:" + entries.get(0).getString("body"));
//            System.out.println("title:" + entries.get(0).getList("entryCategorys"));
//            System.out.println("bodyAsParagraphs:" + entries.get(0).getList("bodyAsParagraphs"));
//
//            System.out.println("byLine:" + entries.get(0).getString("byLine"));
//            System.out.println("additionalAuthor:" + entries.get(0).getString("additionalAuthor"));
//            System.out.println("extStoryId:" + entries.get(0).getString("externalStoryId"));
//           //System.out.println(((FeedEntry)entries.get(0).getList("images").get(0)).getString("location"));
//           // System.out.println(((FeedEntry)entries.get(0).getList("images").get(0)).getString("caption"));
//
        }
        
//        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(feedEntry, System.out);

    }

}
