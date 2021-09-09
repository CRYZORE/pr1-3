import java.util.Random;

public class Random {
    public static void main(String[] args) {
        int[] arr =new int[5];
        for (int i=0; i<arr.length;i++){
            int a = (int) (1+Math.random()*100);
            arr[i]=a;
            System.out.print(arr[i] + " ");
        }
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted=true;
            for(int i= 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    sorted = false;
                }
            }
        }
        System.out.println(" ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}