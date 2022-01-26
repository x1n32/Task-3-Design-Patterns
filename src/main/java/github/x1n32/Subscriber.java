package github.x1n32;


public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    

    public Subscriber(String name) {
        this.name = name;
    }

    //Every time Channel does something, it will invoke update for every object of this class
    public void update(){
        System.out.println("Hi " + name + ", a video has been uploaded: " + channel.titlename);
    }
    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}
