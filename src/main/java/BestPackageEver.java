public class BestPackageEver{
	private static double function(int a,double b,double c){
		int first = 0;
		int i = 0;
		first = (7 + 5);
		for(i = 0; i < 15; i += 2){
			first += 3;
		}
		return (a + (b + c));
	}
	private static int isValid(double b){
		if (b > 10.0) {
			return 1;
		}
		return 0;
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
		double res = 0;
		int isResValid = 0;
		a = 5.4;
		for(i = 0; i < 10; i += 1){
			res = testIf(i);
			System.out.println(res);
			isResValid = isValid(6.0);
			System.out.println(isResValid);
		}
	}

}