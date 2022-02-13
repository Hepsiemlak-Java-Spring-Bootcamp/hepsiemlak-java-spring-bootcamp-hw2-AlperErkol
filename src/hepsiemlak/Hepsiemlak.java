
package hepsiemlak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hepsiemlak {
    
    
    public static void getAllMessages(List<Message> messagesDB, Map<Integer, User> usersDB){
        
        for(Message message : messagesDB){
            System.out.println("Message Title : "+message.getTitle());
            System.out.println("Users of this message");
            User receiver = getUserById(message.getReceiverId(),usersDB);
            User sender = getUserById(message.getSenderId(),usersDB);
            System.out.println("1) "+sender.getName()+" "+sender.getSurname()+" (Sender)");
            System.out.println("2) "+receiver.getName()+" "+receiver.getSurname()+" (Receiver)");
        }
        
    }
    
    public static User getUserById(int id, Map<Integer, User> usersDB){
        
        User user = usersDB.get(id);
        return user;
        
    }
    
    public static User getUserByMail(String mail, Map<Integer, User> usersDB){
        
        for (Map.Entry<Integer, User> entry : usersDB.entrySet()) {
            User user = entry.getValue();
            if(user.getMail().equals(mail)){
                return user;
            }
        }
        
        return null;
    }
    
    public static void getFavorites(String mail, Map<Integer, User> usersDB){
        
        User user = getUserByMail(mail, usersDB);
        System.out.println(user.displayFavorites());
    }
    
    public static void getAdverts(List<Advert> advertsDB){
        
        System.out.println("***Specific Adverts***");
        
        for(Advert advert : advertsDB){
            
            int price = advert.getPrice();
            House house = (House)advert.getProperty();
            String province = house.getAddress().getProvince();
            int roomNumber = house.getRoomNumber();
            int saloonNumber = house.getSaloonNumber();
            
            if(province.equalsIgnoreCase("istanbul") && ((roomNumber == 2 && saloonNumber == 1) || (roomNumber == 3 && saloonNumber == 1)) && price < 3000){
                System.out.println(advert.getSpecificAdvert());
            }
            
        }
        
    }
    
    

    public static void main(String[] args) {
        
        Map<Integer,User> usersDB = new HashMap<>();
        List<Message> messagesDB = new ArrayList<>();
        List<Advert> advertsDB = new ArrayList<>();
        
        // Creation of users
        User user1 = new User("Bireysel", "Ayse", "Sari", "ayse.sari@gmail.com", "123456SeveN");
        User user2 = new User("Bireysel", "Alper", "Erkol", "alper.erkol@yahoo.com.tr", "1234");
        User user3 = new User("Bireysel", "John", "Doe", "john_doe@hotmail.com", "12345");
        
        // Insert users into user table.
        usersDB.put(user1.getUserId(), user1);
        usersDB.put(user2.getUserId(), user2);
        usersDB.put(user3.getUserId(), user3);

        
        
        // Creation of Messages
        Message message = new Message(user1.getUserId(), user2.getUserId(), "İlan", "İlan hala geçerli mi?");
        
        // Insert users into user table.
        messagesDB.add(message);
        
        // Add message to relavent users message box.
        List<Message> messageBox = user1.getMessages();
        messageBox.add(message);
        user1.setMessages(messageBox);
        messageBox = user2.getMessages();
        messageBox.add(message);
        user2.setMessages(messageBox);
        
        
        // Creation of Address;
        Address address1 = new Address("Ankara", "Cankaya", "Ap #799-7613 Sed Street");
        Address address2 = new Address("İstanbul", "Beylikduzu", "123-1430 Mi Road");
        Address address3 = new Address("İstanbul", "Mecidiyekoy", "Ap #754-6920 Dolor, Av.");
        Address address4 = new Address("Ankara", "Kecioren", "Ap #861-1852 Ac Street");
        Address address5 = new Address("İstanbul", "Sultangazi", "439-3154 Dapibus St.");
        
        //Factory Design Pattern
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification;
        
        // Creation of Property
        Property house1 = new House("Apartman Dairesi",3,1,2,"Kombi",25,5,"Satilik",address1,150);
        notification = NotificationFactory.createNotification(house1);
        notification.sendNotification();
        Property house2 = new House("Apartman Dairesi",2,1,1,"Merkezi",15,4,"Kiralik",address2,95);
        notification = NotificationFactory.createNotification(house2);
        notification.sendNotification();

        Property house3 = new House("Villa",5,2,3,"Dogalgaz",5,3,"Kiralik",address3,210);
        notification = NotificationFactory.createNotification(house3);
        notification.sendNotification();
        Property house4 = new House("Villa",3,1,2,"Kombi",10,1,"Kiralik",address4,120);
        notification = NotificationFactory.createNotification(house4);
        notification.sendNotification();
        Property house5 = new House("Apartman Dairesi",3,1,2,"Kombi",6,3,"Kiralik",address5,125);
        notification = NotificationFactory.createNotification(house5);
        notification.sendNotification();
        
        
        // Creation of Advert
        Advert advert1 = new Advert(user1.getUserId(),house1,"ankara cankayada satilik apartman dairesi",1250000,"04-02-2022");
        Advert advert2 = new Advert(user2.getUserId(),house2,"istanbul beylikduzunde kiralik apartman dairesi",2500,"03-02-2022");
        Advert advert3 = new Advert(user3.getUserId(),house3,"istanbul mecidiyekoyde kiralik villa",2750,"01-02-2022");
        Advert advert4 = new Advert(user3.getUserId(),house4,"ankara keciorende kiralik villa",2999,"01-02-2022");
        Advert advert5 = new Advert(user2.getUserId(),house5,"istanbul sultangazi daire",2750,"31-01-2022");
        
        // Insert adverts into adverts table.
        advertsDB.add(advert1);
        advertsDB.add(advert2);
        advertsDB.add(advert3);
        advertsDB.add(advert4);
        advertsDB.add(advert5);
        
        
        // Add advert to relavent user's advert list.
        Set<Advert> advertList = user1.getAdvertList();
        advertList.add(advert1);
        user1.setAdvertList(advertList);
        advertList.clear();
        
        advertList.add(advert2);
        advertList.add(advert5);
        user2.setAdvertList(advertList);
        advertList.clear();
        
        advertList.add(advert3);
        advertList.add(advert4);
        user3.setAdvertList(advertList);
        
        // Add advert to relavent user's favorite advert list.
        Set<Advert> favoriteAdvertList = user1.getFavorites();
        favoriteAdvertList.add(advert2); // Advert 2 added to favorite advert list.
        favoriteAdvertList.add(advert3); // Advert 3 added to favorite advert list. 
        user1.setFavorites(favoriteAdvertList);
        advertList.clear();
        
        

        // --------------------------- HW REQUIREMENTS ---------------------------
        
        // İstanbul'da bulunan, 2+1 ve 3+1, fiyatı 3000TL altında olan ilanlar
        getAdverts(advertsDB);
        
        // Sistemde bulunan bütün mesajların başlıkları ve bu mesajlardaki kullanıcıların kimler olduğu
        getAllMessages(messagesDB,usersDB);
        
        //ayse.sari@gmail.com mail adresine sahip kullanıcının favori ilanları
        getFavorites("ayse.sari@gmail.com", usersDB);
        
    }
    
}
