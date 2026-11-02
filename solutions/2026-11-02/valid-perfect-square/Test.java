class Test {
    public static void main(String[] args) {
        Solution s=new Solution(); int count=0;
        for(int r=1;r<=46340;r++) for(int delta=-1;delta<=1;delta++) {
            long v=(long)r*r+delta; if(v<1) continue;
            boolean expected=(delta==0);
            if(s.isPerfectSquare((int)v)!=expected) throw new AssertionError(v);
            count++;
        }
        if(s.isPerfectSquare(Integer.MAX_VALUE)) throw new AssertionError();
        System.out.println(count+" square and adjacent nonsquare checks plus integer maximum passed");
    }
}
