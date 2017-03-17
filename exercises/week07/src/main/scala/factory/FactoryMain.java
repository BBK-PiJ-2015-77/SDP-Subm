package factory;

import java.util.Scanner;

/**
 * Created by thomasmcgarry on 05/03/2017.

public class FactoryMain {

    public static void main(String[] args) {

        Creator productFactory = new Creator();

        Product building = null;

        Scanner userInput = new Scanner(System.in);

        System.out.print("What type of product? (H/O)");

        if (userInput.hasNextLine()){
            String typeOfProduct = userInput.nextLine();
            building = productFactory.makeProduct(typeOfProduct);
            if()

    }

}


    // Create the factory object
    EnemyShipFactory shipFactory = new EnemyShipFactory();

    // Enemy ship object
    EnemyShip theEnemy = null;

    Scanner userInput = new Scanner(System.in);

        System.out.print("What type of ship? (U / R / B)");

                if (userInput.hasNextLine()){
                String typeOfShip = userInput.nextLine();
                theEnemy = shipFactory.makeEnemyShip(typeOfShip);
                if(theEnemy != null){
                doStuffEnemy(theEnemy);
                } else System.out.print("Please enter U, R, or B next time");
                }
*/