public class Test {
 public static void main(String[] args) {
  Solution s=new Solution();
  int[] no={Integer.MIN_VALUE,-27,-1,0,2,6,45,Integer.MAX_VALUE,1162261466};
  for(int n:no) if(s.isPowerOfThree(n)) throw new AssertionError(n);
  for(long p=1;p<=Integer.MAX_VALUE;p*=3) if(!s.isPowerOfThree((int)p)) throw new AssertionError(p);
  for(int n=1;n<=100000;n++){int v=n;while(v%3==0)v/=3;if(s.isPowerOfThree(n)!=(v==1))throw new AssertionError(n);}
  System.out.println("Examples, all 20 powers, integer boundaries and 100000 differential checks passed");
 }
}