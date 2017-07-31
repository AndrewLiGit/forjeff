package com.endplay.test.feedxmlmapping;


import com.endplay.feeds.jobs.dto.FeedEntry;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

//import org.apache.commons.lang.ArrayUtils;
import org.eclipse.persistence.jaxb.JAXBContextFactory;


public class FeedXMLMappingTest {
    
    /*This is feed XML mapping*/
//    private static File xmlmapping = new File("resource/nxs_cca_feedmapping.xml");
    private static File xmlmapping = new File("resource/json_mapping01.xml");

    /*This is feed XML source*/
//    private static File xmlsource = new File("resource/nxs_cca_source.xml");
    private static File xmlsource = new File("resource/json_data01.json");

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        Map<String, Object> properties = new HashMap<String, Object>(1);
        //properties.put(JAXBContextProperties.OXM_METADATA_SOURCE, xmlmapping);
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, xmlmapping);
        properties.put(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        ClassLoader classLoader = FeedEntry.class.getClassLoader();

        JAXBContext jc = JAXBContext.newInstance("com.endplay.feeds.jobs.dto", classLoader, properties);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
  
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        InputStream in = null;
//        byte[] file = null;
//        in = new FileInputStream(xmlsource);
//        byte[] buffer = new byte[1024 * 100];
//		for (int amountRead = in.read(buffer); amountRead != -1; amountRead = in.read(buffer)) {
//			baos.write(buffer, 0, amountRead);
//		}
//		file = baos.toByteArray();
//		byte[] feedJsonBytes = {};
//		feedJsonBytes = ArrayUtils.addAll(feedJsonBytes, "{\"root\":{\"objects\":".getBytes());
//		feedJsonBytes = ArrayUtils.addAll(feedJsonBytes, file);
//		feedJsonBytes = ArrayUtils.addAll(feedJsonBytes, "}}".getBytes());
//		file = feedJsonBytes;
////		String xmlList1 = file.toString();
//		ByteArrayInputStream feedXMLIS = new ByteArrayInputStream(file);
		
//		String xmlList = feedXMLIS.toString();
        //unmarshal ROOT entry.
        FeedEntry feedEntry = (FeedEntry) unmarshaller.unmarshal(xmlsource);
        
//        //get attributes from root entry.
//        System.out.println("lastRetrivedArticleId :"+feedEntry.getString("lastRetrivedArticleId"));
//        System.out.println("updated:" + feedEntry.getString("updated"));
//        
        //get attributes from entry.
        List<FeedEntry> entries = feedEntry.getList("entries");
        System.out.println("Entries size: " + entries.size());
        if (entries.size() > 0) {
            System.out.println("headline: " + entries.get(0).getString("headline"));
            System.out.println("body: " + entries.get(0).getString("body"));
//            System.out.println("title: " + entries.get(0).getList("entryCategorys"));
//            System.out.println("bodyAsParagraphs: " + entries.get(0).getList("bodyAsParagraphs"));

//            System.out.println("byLine: " + entries.get(0).getString("byLine"));
//            System.out.println("additionalAuthor: " + entries.get(0).getString("additionalAuthor"));
//            System.out.println("extStoryId: " + entries.get(0).getString("externalStoryId"));
//           System.out.println("image url " + ((FeedEntry)entries.get(0).getList("images").get(0)).getString("location"));
//           System.out.println(" " + ((FeedEntry)entries.get(0).getList("images").get(0)).getString("location"));
           // System.out.println(((FeedEntry)entries.get(0).getList("images").get(0)).getString("caption"));

        }
        
//        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(feedEntry, System.out);

    }

}
