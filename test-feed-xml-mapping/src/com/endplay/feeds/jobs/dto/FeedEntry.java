package com.endplay.feeds.jobs.dto;


import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedEntry{
 
    private Map<String, Object> extensions = new HashMap<String, Object>();
 
    public <T> T get(String property) {
        return (T) extensions.get(property);
    }
    
    public <T> T get(String property, Class<T> returnType) {
        return (T) extensions.get(property);
    }
    
    public Boolean getBoolean(String property) {
        return get(property, Boolean.class);
    }
    
    public String getString(String property) {
        return get(property, String.class);
    }
    
    public Long getLong(String property) {
        return get(property, Long.class);
    }
    
    public Integer getInteger(String property) {
        return get(property, Integer.class);
    }
    
    public Float getFloat(String property) {
        return get(property, Float.class);
    }
    
    public Double getDouble(String property) {
        return get(property, Double.class);
    }
    
    public Date getDate(String property) {
        return get(property, Date.class);
    }
    
    public Calendar getCalendar(String property) {
        return get(property, Calendar.class);
    }
    
    public List getList(String property) {
        return get(property, List.class);
    }
    
    public FeedEntry getEntry(String property) {
        return get(property, FeedEntry.class);
    }
    
    public void put(String property, Object value) {
        if(value != null){
            extensions.put(property, value);
        }
    }
    
//    public Map<String, String> toStringMap(){
//        Map<String, String> stringMap = new HashMap<String, String>();
//        if (this.isNotEmpty()) {
//            for (String key : this.extensions.keySet()) {
//                Object valueObj = this.extensions.get(key);
//                if (valueObj instanceof String) {
//                    stringMap.put(key, (String)valueObj);
//                }
//            }
//        }
//        return stringMap;
//    }
    
//    public boolean isEmpty(){
//        if (MapUtils.isEmpty(extensions)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
//    public boolean isNotEmpty() {
//        return !isEmpty();
//    }
}
