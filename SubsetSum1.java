import java.util.*;
public class SubsetSum1 {
    public static ArrayList<Integer> subsetsum(int arr[]){
        ArrayList<Integer> sumsubset=new ArrayList<>();
        int n=arr.length;
        func(0,0,arr,n,sumsubset);
        return sumsubset;
    }

    public static void func(int ind, int sum, int arr[], int n, ArrayList<Integer> sumsubset){
        if(ind==n){
            sumsubset.add(sum);
            return;
        }
        func(ind+1,sum+arr[ind],arr,n,sumsubset);
        func(ind+1,sum,arr,n,sumsubset);
    }

    public static void main(String args[]){
        int arr[]={3,1,2};
        ArrayList<Integer> ans=subsetsum(arr);
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }
}
