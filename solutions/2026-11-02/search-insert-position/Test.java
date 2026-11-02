class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arrays = {{1,3,5,6},{1},{-10000,0,10000}};
        int checks = 0;
        for (int[] a : arrays) for (int target=-10001;target<=10001;target++) {
            int expected=0; while(expected<a.length && a[expected]<target) expected++;
            if(s.searchInsert(a,target)!=expected) throw new AssertionError(target);
            checks++;
        }
        System.out.println(checks+" linear-oracle comparisons passed");
    }
}
