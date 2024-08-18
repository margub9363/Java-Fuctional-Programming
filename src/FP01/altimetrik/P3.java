package src.FP01.altimetrik;
/*
Given a value of V Rs and an infinite supply of each of the denominations {1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes,
 The task is to find the minimum number of coins and/or notes needed to make the change?
   (int x[]={1, 2, 5, 10, 20, 50, 100, 500, 1000};   , don’t use any List/ArrayList/Set,etc.. to solve this)
input :V=70 output:2
*/
public class P3 {
    public static void main(String[] args) {
     int [] denominations = new int[] {1, 2, 5, 10, 20, 50, 100, 500, 1000};
     int v = 72;

     int output = 0;
     for (int i= denominations.length-1; i>= 0; i--) {
         if(v%denominations[i] < v){
             v = v%denominations[i];
             output++;
         }
     }
        System.out.println("Output :" + output);
    }
}


/*
     for (int i= denominations.length-1; i>= 0; i--) {
         if (v/denominations[i]!=0 && v%denominations[i]==0)
             System.out.println(denominations[i]);
     }
 */