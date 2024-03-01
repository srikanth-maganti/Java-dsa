class reverse
{   public static void rev(int a[])
    {
        int first=0;
        int last=a.length-1;
        while(first<last)
        {
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;

            first++;
            last--;

        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,4,5,10};
        rev(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}