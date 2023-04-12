package oopsproject;

public class Ball {
	private String radius;
	//const
	Ball(){
		
	}
	Ball(String radius){
		//L.I
		this.radius=radius;
	}
	//getter & setter method
	public String getradius() {
		return radius;
	}
	public void setradius() {
		this.radius=radius;
	}
}
 class Tennis extends Ball{
	 String game="Tennis Ball";
	 Tennis(){
		 super("5");
	 }
 } 
 class Basketball extends Ball{
	 String game="Basketball";
	 Basketball(){
		 super("15");
	 }
 } 