package github.x1n32;

import java.util.ArrayList;

/**
 * Subject of interest. 
 * Subscriber class is an observer
 */
public class Channel {
    private ArrayList<Subscriber> subs = new ArrayList<>(); 
    String titlename;


    //Method to add to the array list
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }
    //Method to leave to array list
    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    //Method to call/notify all objects of this class when called.
    public void notifySubscibers(){
        for (Subscriber sub: subs){
            sub.update();
        }
    }

    public void upload(String title ){
        this.titlename = title;
        notifySubscibers();
    }


}
