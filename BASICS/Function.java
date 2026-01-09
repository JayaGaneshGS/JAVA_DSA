public class Function {
    
    int apple_price = 20;
    int apple_count = 5;
    void total_money(){
        int total = apple_price * apple_count;
        System.out.println(total);
    }
    public static void main(String args[]){
        Function fruit = new Function();
        fruit.total_money();

    }
}
