package hepsiemlak;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class User {
    
    static int userCount = 0;
    
    // Primary Key - Auto Generated ID
    private int userId = userCount;
    private String type;
    private String name;
    private String surname;
    private String mail;
    private String password;
    private Date creationDate;
    private Set<Advert> favorites;
    private Set<Advert> advertList;
    private List<Message> messages;
    private Set<Address> addresses;

    public User(String type, String name, String surname, String mail, String password) {
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.favorites = new HashSet<Advert>();
        this.advertList = new HashSet<Advert>();
        this.messages = new ArrayList<Message>();
        this.addresses = new HashSet<Address>();
        userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }

    public static void setUserCount(int userCount) {
        User.userCount = userCount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set<Advert> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<Advert> favorites) {
        this.favorites = favorites;
    }

    public Set<Advert> getAdvertList() {
        return advertList;
    }

    public void setAdvertList(Set<Advert> advertList) {
        this.advertList = advertList;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
    
    public void displayMessages(){
        
        messages.forEach(message -> {
            System.out.println(message.toString());
        });
    }
    
    public String displayFavorites(){
        String output = "";
        int counter = 1;
        output+="***FAVORITES***\n\n";
        for(Advert advert : favorites){
            output+="Advert "+counter+"\n---------------\n";
            output+=advert.getSpecificAdvert();
            counter++;
        }
        
        return output;
    }
    
    
    
}
