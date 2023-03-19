public static boolean sortArray(int[] a,int j)
    {
        //if j is reached upto the length-1,it means array is sorted
        if( j ==a.length-1)
            return true;

        if(a[j] > a[j+1])
        return false;

        else
            return sortArray(a,j+1);

    }
