 private int sum(int arr[],int n)
    {int sum=0;
        if(n==arr.length-1)
            return arr[n];
        return arr[n] + sum(arr,n+1);
    }
    private int sum_two(int arr[],int n)
    {
        if(n<=0)
            return 0;
        return arr[n-1]+sum_two(arr,n-1);
    }
