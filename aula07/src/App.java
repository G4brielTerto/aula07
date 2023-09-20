public class App {
    public static void main(String[] args) throws Exception {
        float x, y;
        x=30;
        y=20;
        x=y;

        System.out.println("o valor é: "+x);

        x=10+5;
        System.out.println("o valor é: "+x);
        x=10-5;
        System.out.println("o valor é: "+x);
        x=10*5;
        System.out.println("o valor é: "+x);
        x=10/5;
        System.out.println("o valor é: "+x);

        x=100;
        // x=y;
        if(x<y && x>0){
            System.out.println("X É MAIOR QUE 0");
        }else if(x>y){
            System.out.println("X É MAIOR QUE Y");
        }else if(x==0){
            System.out.println("X É 0");
        }else{
            System.out.println("X É MENOR QUE 0");
        }
    }
}
