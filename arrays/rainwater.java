class rainwater
{   public static int watertrap(int a[])
    {
        int leftmax[]=new int[a.length];
        int rightmax[]=new int[a.length];
        leftmax[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],a[i]);
        }  
        rightmax[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],a[i]);
        }
        int trappedwater=0;
        for(int i=0;i<a.length;i++)
        {   int wl=Math.min(leftmax[i],rightmax[i]);
            int bl=a[i];
            int w=1;
            trappedwater=trappedwater+((wl-bl)*w);
        }
        return trappedwater;
    }
    public static void main(String args[])
    {
        int a[]={4,2,0,6,3,2,5};
        int wt=watertrap(a);
        System.out.println(wt);
    }
}