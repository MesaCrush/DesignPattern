import...

public class EnemyShipTesting{

    public static void main(String[] args){
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        System.out.println("What type ship?(U / R)");

        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        if(theEnemy != null){

             doStuffEnemy(theEnemy);
        }else  System.out.println("What type ship?(U / R)");
        
    }
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.followHeroShip();
    }
}