package backtracking;

public class subsets {
    public static void findsubsets(String str,StringBuilder ans,int i)
    {   //base
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes
        findsubsets(str, ans.append(str.charAt(i)), i+1);
        ans.deleteCharAt(ans.length()-1);

        //no
        findsubsets(str,ans,i+1);
    }
    public static void main(String[] args) {
        findsubsets("abc",new StringBuilder(""),0);
    }
}
