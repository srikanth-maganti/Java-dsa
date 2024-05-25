


public class shortpath {
    public static double shortest(String str)
    {   int x=0;
        int y=0;

        for(int i=0;i<str.length();i++)
        {   char c=str.charAt(i);
            if(c=='E')
            {x++;

            }
            else if(c=='W')
            {x--;

            }
            else if(c=='N')
            {
                y++;
            }
            else if(c=='S')
            {
                y--;
            }


        }
        int X=x*x;
        int Y=y*y;
        return Math.sqrt(X+Y);
    }
   public static void main(String[] args) {
     String str="WNEENESENNN";
     System.out.println(shortest(str));
   } 
}
