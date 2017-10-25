public class StarVar{
    public static String star = "*";
    public static String space = " ";
    public static void main(String[] args){
        patternA();
        patternB();
    }
    public static void patternA(){
        
        for (int i=0; i<10; i++){
            printItemA((10-i), star);
        }
    }
    public static void patternB(){
        for (int i=0;i<10;i++){
            printItemB((10-i), space);
        }
    }
    public static void printItemA(int num, String st) {
        for(int j = 0; j < num; j++) {
            if (j<(num-1)){
                System.out.print(st);
            }
            else{
                System.out.println(st);
            }
        }
    }
    public static void printItemB(int num, String st) {
        for(int j = 0; j < num; j++) {
            if (j<(num-1)){
                System.out.print(st);
            }
            else{
                for (int k = 0;k<(10-num);k++){
                    if (k<((10-num)-1)){
                        System.out.print(star);
                    }
                    else{
                        System.out.println(star);
                    }
                }
            }
        }
    }
}
