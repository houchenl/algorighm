
class MaximumCommonDivisor {

    /**
    * get maximum common divisor
    */
    public static int mcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return mcd(q, r);
    }

    public static void main(String[] args) {
        int result = mcd(36, 25);
        System.out.println(result + "");
    }

}
