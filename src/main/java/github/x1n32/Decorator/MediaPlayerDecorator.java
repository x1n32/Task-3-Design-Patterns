package github.x1n32.Decorator;

public class MediaPlayerDecorator implements MediaPlayer {
	protected MediaPlayer mediaPlayer;
 
	public MediaPlayerDecorator(MediaPlayer mediaPlayer){
		this.mediaPlayer=mediaPlayer;
	}
 
	@Override
	public void assemble() {
		this.mediaPlayer.assemble();		
	}
}