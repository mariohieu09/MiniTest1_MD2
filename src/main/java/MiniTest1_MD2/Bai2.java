package MiniTest1_MD2;

public class Bai2 {
    public static void main(String[] args) {
        double []a = {1,2,5,0,3,7,9,10,3,8};
        System.out.println("Tong cac phan tu trong mang la:" + sum(a));
        System.out.println("Phan tu lon nhat cua mang la: " + max(a));
    }
    public static double sum(double[]a){
        double sum = 0;
        for(int i = 0; i< a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public static double max(double[]a){
        double max = a[0];
        for(int i = 1; i < a.length; i++){
            if( max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
