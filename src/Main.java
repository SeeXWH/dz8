import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        float[] fl = {1.57f, 7.654f, 9.986f};
        int [] sam = {10, 9, 8};
        // task 2
        for (int i =0; i<3; i++){
            if (i!=2){
                System.out.print(arr[i] +", ");
            }
            else{
                System.out.println(arr[i]);
            }
        }
        for (int i =0; i<3; i++){
            if (i!=2){
                System.out.print(fl[i] +", ");
            }
            else{
                System.out.println(fl[i]);
            }
        }
        for (int i =0; i<3; i++){
            if (i!=2){
                System.out.print(sam[i] +", ");
            }
            else{
                System.out.println(sam[i]);
            }
        }
        // task 3
        for (int i =2; i>=0; i--){
            if (i!=0){
                System.out.print(arr[i] +", ");
            }
            else{
                System.out.println(arr[i]);
            }
        }
        for (int i =2; i>=0; i--){
            if (i!=0){
                System.out.print(fl[i] +", ");
            }
            else{
                System.out.println(fl[i]);
            }
        }
        for (int i =2; i>=0; i--){
            if (i!=0){
                System.out.print(sam[i] +", ");
            }
            else{
                System.out.println(sam[i]);
            }
        }
        // task 4
        for (int i = 0; i<3; i++){
            if (arr[i] % 2 != 0 ){
                arr[i]++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
