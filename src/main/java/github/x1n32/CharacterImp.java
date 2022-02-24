package github.x1n32;

public class CharacterImp implements Character { //implements the Character Interface. Can override the methods to do things.

    @Override
    public String job() {
        return "Job: ";
    }

    @Override
    public int str() {

        return 10;
    }

    @Override
    public int mag() {
      
        return 10;
    }

    @Override
    public int spd() {
      
        return 10;
    }
    
}
