package remainingproduct;

public class Multiplyindex {
	
	public static void check(int[]a) {
		
		for(int i=0;i<a.length;i++) {
		int	n=1;
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					continue;
				}
				else {
					n*=a[j];
				}
			}
			System.out.println(n);
			
		}
	}
	
public static void main(String[] args) {
	int[] a = new int[] {1,2,3,4,5};
	Multiplyindex.check(a);
	
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}
	
}
}
