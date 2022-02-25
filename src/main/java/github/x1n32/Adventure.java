package github.x1n32;

public class Adventure {
  
    public static void main(String args[]) {
        CharacterImp StarterCharacter = new CharacterImp();
        StarterCharacter.details();

		Character decoratedKnight = new KnightWithSword(new CharacterImp());
        decoratedKnight.details();

        Character speedyKnight = new KnightWithLightBoots(new CharacterImp());
        speedyKnight.details();

        Character speedyDecoratedKnight = new KnightWithSword(new KnightWithLightBoots(new CharacterImp()));
        speedyDecoratedKnight.details();


    }
}
