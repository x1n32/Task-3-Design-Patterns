
package github.x1n32;

public abstract class KnightClass implements Character {
    private KnightClass knight;



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