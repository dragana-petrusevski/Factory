/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

public class Main {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        int x = 5;
        Car auto1 = new Car();
        
        auto1.setModel("Audi");
        auto1.setBuildYear(2003);
        auto1.setCcm(2000);
        
//        Car audi9 = new Car("Audi9", 2020, 3000, "silver");
        
        System.out.println("Model automobila 1 je: " +auto1.getModel());
        auto1.printAttributes();
        
        int y = 29;
        Car auto2 = new Car();
        auto2.setModel("Fiat");
        auto2.setBuildYear(2019);
        auto2.printAttributes();
        
        System.out.println("Model automobila 2 je: " +auto2.getModel());
        
        
        Car lada = new Car("Lada Niva", 1990, "green", 120, 50);
        lada.setModel("Lada");
        
        Car opel = new Car("Opel", 2002, "blue", 200, 1300, 7, 150000);
        opel.printAttributes();
        opel.goToTravel(200);
        opel.printAttributes();
        opel.goToTravel(400);
        opel.printAttributes();
    }

}
    
    

