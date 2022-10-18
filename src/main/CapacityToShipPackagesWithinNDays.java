package main;

public class CapacityToShipPackagesWithinNDays {
    static boolean isPossible(int[] weights, int n, int days, int mid){
        int noOfShips = 1;
        int weight = 0;

        for(int i=0;i<n;i++){
            if(weights[i]>mid) return false;
            if(weight + weights[i]>mid){
                noOfShips++;
                weight = weights[i];
            }else{
                weight+=weights[i];
            }
        }
        if(noOfShips>days) return false;
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        for(int i=0;i<n;i++) sum+=weights[i];

        int low = 0;
        int high = sum;
        int result = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(weights,n,days,mid)){
                result = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return result;
    }
}
