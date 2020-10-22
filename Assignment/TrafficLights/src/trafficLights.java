import java.util.*;
public class trafficLights {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lights;
		System.out.println("Select one of the lights\nRed\nyellow\nGreen  ");
		lights=sc.nextLine();
		if(lights.equalsIgnoreCase("red")){
			System.out.println("Stop");
		}
		else if(lights.equalsIgnoreCase("yellow")) {
			System.out.println("Ready");
		}
		else {
			System.out.println("Go");
		}
	}

}
