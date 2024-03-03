package OOP;

public class ArbitraryNoOfArgs {
    static void add(int ... elements){
        int sum=0;
        for(int i:elements) sum+=i;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20,30);
        add(10, 20,30,40);
        add(10, 20,30,40,50,60);
        add(10, 20,30,40,50,60,70);
        add(10, 20,30,40,50,60,70,80);
        add(10, 20,30,40,50,60,70,80,90);
        add(10, 20,30,40,50,60,70,80,90,100);
        
    }
}
