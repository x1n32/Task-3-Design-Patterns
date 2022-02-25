package github.x1n32.Decorator;

 
public class MP4Player extends MediaPlayerDecorator {
	public MP4Player(MediaPlayer mediaPlayer) {
		super(mediaPlayer);
	}
 
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding functionality to run MP4 files.");		
	}
}