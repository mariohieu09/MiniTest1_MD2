package MiniTest1_MD2;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban muon: ");
        int n = sc.nextInt();
        for(int i = 2; i <= n; i++){
            if(checkPr(i) == 1){
                System.out.println(i);
            }
        }

    }
    public static int checkPr(int a){

        int check = 1;
        for(int j = 2; j < a; j++){
            if(a % j == 0){
                check = 0;
                break;
            }
        }
        return check;
    }
}
