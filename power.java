private int power(int n,int x)
    {int q;
        if(x==0)
            return 1;
        else {
            x--;
            q = n * power(n, x);
        }
        return q;
    }
