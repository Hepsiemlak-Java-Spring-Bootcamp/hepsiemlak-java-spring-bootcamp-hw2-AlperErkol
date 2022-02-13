
package hepsiemlak;


public class Address {
    
    static int addressCount = 0;
    
    private int addressId = addressCount;
    private String province;
    private String district;
    private String fullAddress;

    public Address(String province, String district, String fullAddress) {
        this.province = province;
        this.district = district;
        this.fullAddress = fullAddress;
        addressCount++;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
    
    public String displayAddress(){
        String output ="";
        output+="Province : "+this.province+"\n";
        output+="District : "+this.district+"\n";
        output+="Full Address : "+this.fullAddress+"\n";
        
        return output;
    }
    
    
    
    
}
