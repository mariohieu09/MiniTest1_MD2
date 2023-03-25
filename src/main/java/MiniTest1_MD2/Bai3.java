package MiniTest1_MD2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int []a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu:" + (i + 1));
             a[i] = sc.nextInt();
        }
        for(int j = 0; j < a.length; j++){
            System.out.print(a[j] + " ");
        }
    }

}
