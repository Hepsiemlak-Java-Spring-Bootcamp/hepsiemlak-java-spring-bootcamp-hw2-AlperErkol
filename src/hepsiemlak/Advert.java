/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hepsiemlak;

import java.util.Date;

/**
 *
 * @author alper
 */
public class Advert {
    
    static int advertCount = 0;
    
    // Primary Key - Auto Generated ID
    private int advertId = advertCount;
    // userId -> Foreign Key
    private int userId;
    // propertyId -> Foreign Key
    private Property property;
    private String title;
    private int price;
    private String creationDate;
    private String editionDate;
    private boolean highlightStatus = false;

    public Advert(int userId, Property property, String title, int price, String creationDate) {
        this.userId = userId;
        this.property = property;
        this.title = title;
        this.price = price;
        this.creationDate = creationDate;
    }

    public int getAdvertId() {
        return advertId;
    }

    public void setAdvertId(int advertId) {
        this.advertId = advertId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public boolean isHighlightStatus() {
        return highlightStatus;
    }

    public void setHighlightStatus(boolean highlightStatus) {
        this.highlightStatus = highlightStatus;
    }
    
    public String getSpecificAdvert(){
        
        String output = "";
        
        output+="Advert Title :"+this.getTitle()+"\n";
        output+="Advert Price :"+this.getPrice()+"\n";
        output+="Advert Creation Date :"+this.getCreationDate()+"\n";
        output+=this.getProperty().displayProperty();
            
        return output;
    }
    
    
    
}
