public abstract class EnemyShip{

    private String name;
    private double amtDamage;

    public String getName(){return name;}
    public void setName(String newName){name = newName;}

    public String getDamage(){return amtDamage;}
    public void setDamage(String newDamege){name = newDamage;}

    public void followHeroShip(){
        System.out.print(getName() + " is following the hero");
    }
    
}