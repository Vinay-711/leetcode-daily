public class Test {
 public static void main(String[] args){Solution s=new Solution();
 for(int n:new int[]{6,28,496,8128,33550336})if(!s.checkPerfectNumber(n))throw new AssertionError(n);
 for(int n:new int[]{1,2,7,16,25,36,100000000})if(s.checkPerfectNumber(n))throw new AssertionError(n);
 for(int n=1;n<=2000;n++){int sum=0;for(int d=1;d<n;d++)if(n%d==0)sum+=d;if(s.checkPerfectNumber(n)!=(sum==n))throw new AssertionError(n);}
 System.out.println("Known examples, square boundaries and 2000 independent divisor checks passed");
 }
}