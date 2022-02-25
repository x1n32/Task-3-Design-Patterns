package github.x1n32.Decorator;

public class DecoratorPatternTest {
	public static void main(String args[]){
		MediaPlayer vLCPlayer = new VLCPlayer(new BasicMedialayer());
		vLCPlayer.assemble();
		System.out.println();
 
		MediaPlayer decoratedVLCPlayer = new VLCPlayer(new MP4Player(new BasicMedialayer()));
		decoratedVLCPlayer.assemble();
	}
}