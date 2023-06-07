/*Finding the biggest number */
import java.util.Scanner;
public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i =0; i<size ;i++ ){
            System.out.println();
            arr[i] = sc.nextInt();
        }
        int big =0;
        System.out.println("The bigest number is : ");
        for(int i= 0; i<size; i++){
            if (arr[i]>big)
            big = arr[i];
        }
        System.out.println(big);
    }
}



/*Reversing the Array */
import java.util.Scanner;
public class Array11 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i =0; i<size ;i++ ){
           // System.out.println();
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before reverse : ");
        for(int i =0; i<size ;i++ ){
            System.out.print(arr[i]+"\t");
            
        }
        System.out.println();
        System.out.println("Array after reverse : ");
        for(int i =size -1; i>=0 ;i-- ){
            System.out.print(arr[i]+"\t");
            
        }
   } 
}




/*Searching an element in Array */
import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i =0; i<size ;i++ ){
            System.out.print(arr[i]+"\t");
            
        }
        System.out.println();
        System.out.println("Enter the element you want to search : ");
        int a = sc.nextInt();
        int count=0;
        for (int i=0; i<size; i++) {
            if (arr[i] == a){
                System.out.println(arr[i]+" is found at index "+i+".");
                count++;
                break;
            } 

        }
        if(count ==1){
            System.out.println("Element is already founded.");
        }else{
            System.out.println("Element is not found");
        }
    
    }
}




/*Deleting an element from the Array */
import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size - 1];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + "\t");

        }
        System.out.println();
        System.out.println("Enter the element you want to delete : ");
        int a = sc.nextInt();

        for (int i = 0, k = 0; i < size; i++) {
            if (arr1[i] != a) {
                arr2[k] = arr1[i];
                k++;
                //System.out.println(arr2[k]);
            } /* */
        }
        System.out.println("After deletion array elements are : ");
        for (int i = 0; i < size-1; i++) {
            System.out.print(arr2[i] + "\t");

        }
    }
}
