public class Test {
 public static void main(String[] args){
  Solution s=new Solution();
  for(long p=1;p<=Integer.MAX_VALUE;p*=4)if(!s.isPowerOfFour((int)p))throw new AssertionError(p);
  for(int n:new int[]{Integer.MIN_VALUE,-1,0,2,5,8,32,Integer.MAX_VALUE})if(s.isPowerOfFour(n))throw new AssertionError(n);
  for(int n=1;n<=100000;n++){int v=n;while(v%4==0)v/=4;if(s.isPowerOfFour(n)!=(v==1))throw new AssertionError(n);}
  System.out.println("All powers, boundaries and 100000 differential cases passed");
 }
}