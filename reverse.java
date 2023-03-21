private String reverse(String s)
    {
       if(s==null ||s.length()<=1)
           return s;
       else
           return reverse(s.substring(1))+ s.charAt(0);
    }
    private String reverse2(String s,String reverse,int i)
    {
        if(i<0)
            return reverse;
        else
            return reverse2(s,reverse+s.charAt(i),i-1);
    }
