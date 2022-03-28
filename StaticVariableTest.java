
public class StaticVariableTest {

	public static void main(String[] args) {
		
		int numberOfBalloons = 20;
		Balloon[] balloon = new Balloon[numberOfBalloons];
		
			for (int i = 0; i < numberOfBalloons; i++) {
				balloon[i] = new Balloon(i);
			}
		while (Balloon.countOfBalloon > 0) {
			int rand = randomNumberGenerator(Balloon.countOfBalloon);

			for (int i = 0; i < rand; i++) {
				Balloon.burstBallon();
				System.out.println("bursting balloon");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			System.out.println("Balloons bursted "+ rand);
			System.out.println("Remaining Balloons "+Balloon.countOfBalloon);

		}
	}

	public static int randomNumberGenerator(int count) {
		final int min = 1;
		int max = count;
		return (int) Math.floor(Math.random() * (max - min + 1) + min);

	}

}
class Balloon{
	static int countOfBalloon;
	int balloonNum;
	
	
	Balloon(int num){
		balloonNum = num;
		++countOfBalloon;
	}
	
	public static void balloonCount() {
		System.out.println("Total number of balloons :"+countOfBalloon );
	}
	
	public static void burstBallon() {
		--countOfBalloon;
	}
	

	
}
	
