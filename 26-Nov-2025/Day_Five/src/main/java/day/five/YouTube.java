package day.five;

public class YouTube extends Video {

	public YouTube(ProcessingQuality processingQuality) {
		super(processingQuality);
	}

	@Override
	public void playVideo() {
		System.out.print("Playing video from YouTube..");
		processingQuality.processingVideo();
	}

}
