package github.x1n32;

public class KnightWithSword extends KnightClass{
    

    public KnightWithSword(Character c) {
        super(c);
    }
    

    

    public String job() {
        return super.job() + decorateWithSword();
    }
    

    private String decorateWithSword() {
        return " with a sword!";
    }


    public static void main (String[] arg){
        Character tree1 = new KnightWithSword(new CharacterImp());

          
    }
}
