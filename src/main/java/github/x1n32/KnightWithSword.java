package github.x1n32;

public class KnightWithSword extends KnightClass{

    public KnightWithSword(KnightClass knight)  {   //This extends the knight class and can override its methods
        super(knight);
    }  
 

    public String job() {
        return super.job() + decorateWithSword();
    }
    

    private String decorateWithSword() {
        return " with a sword!";
    }

}
