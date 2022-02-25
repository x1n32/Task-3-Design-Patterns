package github.x1n32;

public class Adventure {
  
    public static void main(String args[]) {
        CharacterImp StarterCharacter = new CharacterImp();

        System.out.println(StarterCharacter.job());

        KnightClass BasicKnight = new KnightClass(StarterCharacter);
        KnightClass SwordKnight =new KnightWithSword(BasicKnight); 
    

    }
}
