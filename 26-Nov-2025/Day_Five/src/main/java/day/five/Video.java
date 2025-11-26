package day.five;

public abstract class Video {

	protected ProcessingQuality processingQuality;

	public Video(ProcessingQuality processingQuality) {
		this.processingQuality = processingQuality;
	}

	public abstract void playVideo();

}
