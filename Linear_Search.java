private boolean linear_search(int arr[],int n,int element)
    {
        if(n == arr.length)
            return false;
        if(arr[n] == element)
            return true;
        else {

            return linear_search(arr , n + 1, element);
        }
    }
    private boolean linear_search_two(int arr[],int n,int element)
    {
        if(n==-1)
            return false;
        if(arr[n]==element)
            return true;
        return linear_search_two(arr,n-1,element);
    }
