package github.x1n32.Decorator;

public class VLCPlayer extends MediaPlayerDecorator {
	public VLCPlayer(MediaPlayer mediaPlayer) {
		super(mediaPlayer);
	}
 
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding functionality to run VLC files.");		
	}
}