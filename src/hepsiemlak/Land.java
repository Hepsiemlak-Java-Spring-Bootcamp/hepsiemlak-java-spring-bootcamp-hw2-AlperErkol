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
public class Land extends Property {
    
    private int parcelNo;
    private int blockNo;
    private String municipality;

    public Land(int parcelNo, int blockNo, String municipality, String status, Address address, int size) {
        super(status, address, size);
        this.parcelNo = parcelNo;
        this.blockNo = blockNo;
        this.municipality = municipality;
    }

    public int getParcelNo() {
        return parcelNo;
    }

    public void setParcelNo(int parcelNo) {
        this.parcelNo = parcelNo;
    }

    public int getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(int blockNo) {
        this.blockNo = blockNo;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

}
