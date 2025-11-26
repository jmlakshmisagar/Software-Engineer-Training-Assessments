package day.five;

public class Prime extends Video {

	public Prime(ProcessingQuality processingQuality) {
		super(processingQuality);
	}

	@Override
	public void playVideo() {
		System.out.println("Playing video from Prime..");
		processingQuality.processingVideo();
	}

}
