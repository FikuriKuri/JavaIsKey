public class Monster {
    //Declare every attributes
    private String name;
    private int Hp;
    private int baseAttack;
    
    public Monster(String name){
        //Construct Monster by assigning value for every attributes
        this.name = name;
        this.Hp = 100;
        this.baseAttack = 10;
    }
    
    //Create the method attack
    public int attack(){
        //your code goes here
        return this.baseAttack;
    }
    
    public void attacked(int damage){
        //Decrease the health point by the given damage
        this.Hp -= damage;
        System.out.println("Ouch! " + this.name + " was hit for " + damage + " damage!\n");
    }

    public void checkStatus(){
        //Print the characters health point
        System.out.println(this.name + "'s Status: ");
        System.out.println("HP: " + this.Hp);
        System.out.println("Attack: " + this.baseAttack);
        System.out.println();
    }
    
    public boolean healthChecker(){
        //Check this character's health point to see if the character was defeated
        if(this.Hp == 0){
            System.out.println(this.name + " Defeated!");
            return true;
        }
        else return false;
    }
    public void reset(){
        //Reset the character's HP
        this.Hp = 100;
    }
}