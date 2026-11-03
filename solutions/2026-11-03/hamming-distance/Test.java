public class Test {
 public static void main(String[] args){Solution s=new Solution();
  if(s.hammingDistance(1,4)!=2||s.hammingDistance(3,1)!=1||s.hammingDistance(0,Integer.MAX_VALUE)!=31)throw new AssertionError();
  for(int x=0;x<256;x++)for(int y=0;y<256;y++){int expected=0;for(int b=0;b<31;b++)if(((x>>b)&1)!=((y>>b)&1))expected++;if(s.hammingDistance(x,y)!=expected)throw new AssertionError();}
  System.out.println("Examples, maximum distance and 65536 bit-by-bit differential checks passed");
 }
}