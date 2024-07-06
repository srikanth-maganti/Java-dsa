package recurssion;

public class duplicatestr {
    public static void removedup(String str,int idx,StringBuilder newstr,boolean map[])

    {
      
        if(idx==str.length())
        {
            System.out.println(newstr);
            return;
        }
        char c=str.charAt(idx);
        if(map[c-'a']==true)
        {
            removedup(str,idx+1,newstr,map);
        }
        else{
            map[c-'a']=true;
            removedup(str,idx+1,newstr.append(c),map);
        }
    }
    public static void main(String[] args) {
        String str="aapnnacollege";
        removedup(str,0,new StringBuilder(""),new boolean[26]);
        
    }
}
