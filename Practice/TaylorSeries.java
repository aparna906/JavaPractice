

class TaylorSeries{
    static double p = 1, f = 1;
static double Tay(int x, int n)
{
    double r;
    if (n == 0)
    return 1;
    r = Tay(x, n - 1);
    p = p * x;
    f = f * n;
    return (r + p / f);
}
    public static void main(String[] args) {
        int x = 5, n = 20;
        System.out.println((Tay(x, n)));
    }
}