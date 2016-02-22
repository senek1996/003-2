/*
 * Эта прога выводит массив из неч. чисел от 1 до 99 в прямом и обратном порядке
   Автор: Бредихин А.И.
 */
package лаб.работа.pkg3.pkg2;


public class ЛабРабота32 {

    
    public static void main(String[] args) {
        int i,n=50;
        int[] a;
        a=new int[51];
        for (i=1; i<=n; i++) {
            a[i]=2*i-1;
            System.out.print(a[i]+" ");
        }
        
        System.out.print("\n");
        
        for (i=n; i>=1; i--) {
            System.out.print(a[i]+" ");
        }
    }
    
}
