package Programs;
import java.util.*;
class Demo{
	public static void main(String [] args){
		Demo d=new Demo();
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println(d instanceof Demo);
		System.out.println(sc instanceof Scanner);
		System.out.println(sc instanceof Object);

	}
}