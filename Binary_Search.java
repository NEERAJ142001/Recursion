 private boolean binary_search(int arr[],int start,int end,int element)
    {
        if(start>end)
            return false;
        int mid=start+(end-start)/2;
        if(arr[mid]==element)
            return true;
        if(element>arr[mid])
            return binary_search(arr,mid+1,end,element);
        else
            return binary_search(arr,start,mid-1,element);
    }
