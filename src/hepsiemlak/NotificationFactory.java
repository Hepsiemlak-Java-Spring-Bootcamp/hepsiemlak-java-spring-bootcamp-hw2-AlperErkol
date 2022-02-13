
package hepsiemlak;

public class NotificationFactory {
    
    public static Notification createNotification(Property propertyType) {
        
        if(propertyType instanceof House){
            return new HouseNotification();
        }else if(propertyType instanceof Land){
            return new LandNotification();
        }
        return null;
        
    }
    
}
