package greedy;

import java.util.Arrays;

public class Platform {

   public static void min_no_platform(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,min=0,max=0;
        while(i<n&&j<n){
            if(arr[i]<dep[j]){
                i++;
                min++;
                max=Math.max(max, min);
            }
            else{
                j++;
                min--;
            }
        }
        System.out.println(max);

    }public static void main(String[] args) {
         int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        min_no_platform(arr, dep, n);

        
    }
    
}
