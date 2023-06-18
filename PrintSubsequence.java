import java.util.*;
public class PrintSubsequence{
    public static void printseq(ArrayList<Integer> ds, int index, int arr[], int n){
        if(index==n){
            for(int i=0;i<n;i++){
                System.out.print(ds.get(i));
            }
            return;
        }

        ds.add(arr[index]);
        printseq(ds,index+1,arr,n);
        ds.remove(arr[index]);
        printseq(ds,index+1,arr,n);

    }

    public static void main(String args[]){
        int arr[]={3,1,2};
        int n=3;
        ArrayList<Integer> ds=new ArrayList<>();
        printseq(ds,0,arr,n);
    }
}