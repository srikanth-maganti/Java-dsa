package backtracking;

public class gridways {
   
    public static int noofgridways(int n,int m,int i,int j)
    {   if(i==n-1 && j==m-1)
        {
                
                return 1;
        }
        else if(i==n || j==m)
        {
            return 0;
        }
        return noofgridways(n,m,i+1,j)+ noofgridways(n,m,i,j+1);
            
      
           
        
        
        
    }
    public static void main(String[] args) {
        
        int count=noofgridways(3,3,0,0);
        System.out.println(count);
        
    }
}
