package jp.kenschool.exercise4;

public class JavaExam4_3 {

	public static void main(String[] args) {
		/*
		AbstractPlayer[] array = null;
		ExDVDPlayre dvd = new ExDVDPlayre();
		array[0] = dvd;
		
		
		ExCDPlayer cd = new ExCDPlayer();
		array[1] = cd;
		
		*/

		AbstractPlayer[] array = { new ExDVDPlayre(), new ExCDPlayer() };

		for (AbstractPlayer player : array) {
			player.play();
			player.stop();
			player.electrify();
		}
	

	}

}
