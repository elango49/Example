package oopsproject;

public class Bag {
	Ball ball;
	Bag(){
		
	}
	public  void addBall(Ball ball) {
		if(this.ball!=null) {
			System.out.println("Already Bag Contains Ball");
		}else {
			this.ball=ball;
			System.out.println("Ball Added Successfully");
		}
	}
	public  void removeBall() {
		if(this.ball!=null) {
			this.ball=null;
			System.out.println("Ball Removed Successfully");
		}else {
			
			System.out.println("No Ball Exits To Remove");
		}
	}
	public boolean isBagEmpty() {
		if(this.ball==null)
			return true;
		else
			return false;
	}
	public void ShowGame() {
		if(this.ball instanceof Tennis) {
//			Ball ball=Tennis Ball;
			//ref is upcasted to access the child members down casting
			Tennis ref=(Tennis)ball;
			System.out.println("The Game Being Played is"+ref.game);
		}else if(this.ball instanceof Basketball) {
//			Ball ball=Basketball;
			//ref is upcasted to access the child members down casting
			Basketball ref=(Basketball)ball;
			System.out.println("The Game Being Played is"+ref.game);
		}else {
			System.out.println("No Live Game");
		}
			}
}
