package coreJavaExercise;

class Ex11{
	public int a,b;
	public int c=2;
	public static int x=6;
}

public class Ex11Test {

	public static void main(String[] args) {
		Ex11 instanceA = new Ex11();
		Ex11 instanceB = new Ex11();
		instanceA.a=8;
		instanceB.b=instanceA.x;
		instanceA.x++;//AFTER EXECUTION x=7
        instanceB.a = 10;
        instanceB.c = 90;
        instanceB.x++;//After execution x=8
        System.out.println(instanceA.a);
        System.out.println(instanceB.b);
        System.out.println(instanceA.x++);//Print x= 8 then increment to x=9
        System.out.println(instanceB.a);
        System.out.println(instanceB.c);
        System.out.println(instanceB.x++);//x=9 will printed then increment

	}

}
