public class trappingRainwater{
    public static int trappedRainwater(int array[]){
        int n = array.length;
        int trappedWater = 0;
        //Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = array[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(array[i], leftMax[i-1]);
        }
        //Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = array[n-1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(array[i], rightMax[i+1]);
        }
        //Loops
        for(int i = 0; i < n; i++){
            //waterlevel = min(leftMax boundary, rightMax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedwater = waterlevel - height[i]
            trappedWater += (waterLevel - array[i]);
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("The total rainwater trapped is : "+ trappedRainwater(height));
    }
}