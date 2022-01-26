package github.x1n32;

public class StreamingSite {

    public static void main (String args[]){

        Channel streamBBC = new Channel();

         Subscriber s1 = new Subscriber("Subscriber 1");
         Subscriber s2 = new Subscriber("Subscriber 2");
         Subscriber s3 = new Subscriber("Subscriber 3");
         Subscriber s4 = new Subscriber("Subscriber 4");
         Subscriber s5 = new Subscriber("Subscriber 5");

         streamBBC.subscribe(s1);
         streamBBC.subscribe(s2);
         streamBBC.subscribe(s3);
         streamBBC.subscribe(s4);
         streamBBC.subscribe(s5);


         s1.subscribeChannel(streamBBC);
         s2.subscribeChannel(streamBBC);
         s3.subscribeChannel(streamBBC); 
         s4.subscribeChannel(streamBBC);
         s5.subscribeChannel(streamBBC);

         streamBBC.upload("Infinite Monkey Cage");

         streamBBC.unsubscribe(s3);

         streamBBC.upload("The Turing Test");


    }

    
}
