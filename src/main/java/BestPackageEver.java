public class BestPackageEver{
	private static double function(int a,double b,double c){
		int first = 0;
		first = (7 + 5);
		first += 3;
		return (a + (b + c));
	}
	private static double testIf(int index){
		if (index > 10) {
			System.out.println(111);
		}
		else {
			System.out.println(112);
			return -1;
		}
		double d = 0;
		d = function(index, 100.0, 20.0);
		return d;
	}
	public static void main(String[] args){
		double a = 0;
		int i = 0;
		int r = 0;
		a = 5.4;
		for(i = 0; i < 10; i += 1){
			r = 10;
			System.out.println(r);
			testIf(i);
			System.out.println(i);
		}
	}

}