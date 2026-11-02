class Test {
    public static void main(String[] args) {
        Solution s=new Solution(); int count=0;
        for(int r=0;r<=46340;r++) for(int offset=-1;offset<=1;offset++) {
            long v=(long)r*r+offset;
            if(v<0 || v>Integer.MAX_VALUE) continue;
            int answer=s.mySqrt((int)v);
            if((long)answer*answer>v || (long)(answer+1)*(answer+1)<=v) throw new AssertionError(v);
            count++;
        }
        if(s.mySqrt(Integer.MAX_VALUE)!=46340) throw new AssertionError();
        System.out.println(count+" perfect-square boundary checks plus integer maximum passed");
    }
}
