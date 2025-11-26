package day.five;

public class App {
	public static void main(String[] args) {
		Video youtubeHd = new YouTube(new HDProcessing());
		youtubeHd.playVideo();

		Video prime4K = new Prime(new FourKProcessing());
		prime4K.playVideo();

		Video prime8K = new Prime(new EightKProcessing());
		prime8K.playVideo();

	}
}
