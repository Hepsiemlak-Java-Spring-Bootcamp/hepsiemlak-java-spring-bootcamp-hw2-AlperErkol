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
public class HouseNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("House is created.. (Notification Factory)");
    }
    
}
