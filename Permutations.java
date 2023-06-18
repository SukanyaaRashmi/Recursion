import java.util.*;
public class Permutations {
    public static List<List<Integer>> permute(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
        recurpermute(0,arr,ans);
        return ans;
    }

    public static void recurpermute(int ind, int arr[], List<List<Integer>> ans){
        if(ind==arr.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(i, ind, arr);
            recurpermute(ind+1,arr,ans);
            swap(i,ind,arr);
        }
    }

    public static void swap(int i, int j, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String args[]){
        int arr[]={1,2,3};
        List<List<Integer>> ans=permute(arr);

        System.out.println(ans);

    }
}
