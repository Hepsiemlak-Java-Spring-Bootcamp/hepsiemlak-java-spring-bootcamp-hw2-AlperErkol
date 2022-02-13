/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hepsiemlak;

/**
 *
 * @author alper
 */
public class House extends Property {
    
    // Villa, apartman dairesi, rezidans dairesi....
    private String houseType;
    private int roomNumber;
    private int saloonNumber;
    private int bathroomNumber;
    private String heatingType;
    private int ageOfBuilding;
    private int numberOfFloor;
    
    public House(String houseType, int roomNumber, int saloonNumber, int bathroomNumber, String heatingType, int ageOfBuilding, int numberOfFloor, String status, Address address, int size) {
        super(status, address, size);
        this.houseType = houseType;
        this.roomNumber = roomNumber;
        this.saloonNumber = saloonNumber;
        this.bathroomNumber = bathroomNumber;
        this.heatingType = heatingType;
        this.ageOfBuilding = ageOfBuilding;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String displayProperty() {
        String output = super.displayProperty();
        output+="House Type : "+this.houseType+"\n";
        output+="Room Number : "+this.roomNumber+"+"+this.saloonNumber+"\n";
        output+="Bathroom Number :"+this.bathroomNumber+"\n";
        output+="Heating System : "+this.heatingType+"\n";
        output+="Age of building : "+this.ageOfBuilding+"\n";
        output+="Number of floor :"+this.numberOfFloor+"\n\n";
        return output;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getSaloonNumber() {
        return saloonNumber;
    }

    public void setSaloonNumber(int saloonNumber) {
        this.saloonNumber = saloonNumber;
    }

    public int getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public String getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(String heatingType) {
        this.heatingType = heatingType;
    }

    public int getAgeOfBuilding() {
        return ageOfBuilding;
    }

    public void setAgeOfBuilding(int ageOfBuilding) {
        this.ageOfBuilding = ageOfBuilding;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
    
    

    
    
    
    
}
