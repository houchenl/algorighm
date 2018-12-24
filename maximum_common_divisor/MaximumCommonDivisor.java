
class MaximumCommonDivisor {

    /**
    * 求最大公约数
    */
    public static int mcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return mcd(q, r);
    }

    public static void main(String[] args) {
        int result = 0;
        result = mcd(36, 25);
        System.out.println(result + "");
    }

}
