public class Pattern1 {
    public static void main(String[] args) {
        Pattern1(6);
    }
    static void  Pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
