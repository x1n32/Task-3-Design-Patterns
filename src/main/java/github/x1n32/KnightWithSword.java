package github.x1n32;

public class KnightWithSword extends KnightClass{

    public KnightWithSword(Character character)  {   
        this.character=character;  
    }  


    public String job() {
        return super.job() + decorateWithSword();
    }
    

    private String decorateWithSword() {
        return " with a sword!";
    }

}
