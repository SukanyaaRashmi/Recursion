import java.util.*;
public class CombinationSum {
    public static List<List<Integer>> combinationsum(int[] arr, int target){
        List<List<Integer>> ans=new ArrayList<>();
        findComb(0,ans,arr,target, new ArrayList<>());
        return ans;
    }

    public static void findComb(int ind, List<List<Integer>> ans,int arr[],int target, List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findComb(ind, ans, arr, target-arr[ind], ds);
            ds.remove(ds.size()-1);
        }
        findComb(ind+1, ans, arr, target, ds);
    }

    public static void main(String args[]){
        

    }
}
