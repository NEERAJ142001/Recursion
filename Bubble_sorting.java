private int[] bubble(int arr[],int n)
    {
        int temp=0;
        if(n==1)
            return arr;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return bubble(arr,n-1);
    }
