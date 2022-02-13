package hepsiemlak;

import java.util.ArrayList;
import java.util.List;


public class Property {
    
    final int MAX_IMAGES_NUMBER = 5;
    static int propertyCount = 0;
    
    
    private int propertyId = propertyCount;
    // Satılık, kiralık, günlük kiralık...
    private String status;
    private Address address;
    private int size;
    private List<String> imagesList;

    public Property(String status, Address address, int size) {
        this.status = status;
        this.address = address;
        this.size = size;
        this.imagesList = new ArrayList<>();
        propertyCount++;
    }
    
    
    public String displayProperty(){
        String output = "";
        output+="Property Status : "+this.status+"\n";
        output+="Property Address\n"+this.address.displayAddress();
        output+="Property Size : "+this.size+"\n";
        
        return output;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}
