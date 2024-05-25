package bit_manipulation;



public class evenorodd {
    public static void main(String[] args) {
        int bitmask=1;
        int number=5;
        if((number & bitmask)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
