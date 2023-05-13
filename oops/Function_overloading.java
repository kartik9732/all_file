public class Function_overloading {
    // same class multiple function with same name with different parameter.
    //type of parameter and no of parameter.
    public static int sum(int a,int b){
        return a+b;

    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    } //no of parameter;
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static float sum(float a,float b,float c,float d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(4,4,4));
        System.out.println(sum(2,3,4,5));
        System.out.println(sum(2.3f,3.5f,4.7f,5.8f));

        
    }
    
}
