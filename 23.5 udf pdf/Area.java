class Area
{

    int cal(int a)
    {
        return a*a;
    }
    int cal(int l, int b)
    {
        return l*b;
    }
        public static void main(String arg[])
        {
            Area sq = new Area();
            Area rec = new Area();
            int result = sq.cal(40);
            System.out.println(result);
            System.out.println(rec.cal(5,6));
        }
}
