
package github.x1n32;

public abstract class KnightClass implements Character { 
    //This is a 'character' Decorator. Like Character Imp, it takes Character and overrides the methods to do something new.

    private KnightClass knight;

    public KnightClass(KnightClass knight)  {   //This has the ability to create more decorated objects.
        this.knight=knight;  
    }  




    @Override
    public String job() {
        return knight.job();
    }

    @Override
    public int str() {
        return knight.str();
    }

    @Override
    public int mag() {
        
        return knight.mag();
    }

    @Override
    public int spd() {
     
        return knight.spd();
    }

}