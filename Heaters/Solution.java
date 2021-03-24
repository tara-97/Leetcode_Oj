
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int minRadius = 0;
        int maxRadius = 1_000_000_000;
        TreeSet<Integer> heatersSet = new TreeSet<>();
        for(int i:heaters) heatersSet.add(i);

        while(minRadius<maxRadius){
            int mid = minRadius + (maxRadius-minRadius) / 2;
            if(isWarmed(houses,mid,heatersSet)) maxRadius = mid;
            else minRadius = mid+1;
        }
        return minRadius;

    }
    public boolean isWarmed(int[] houses,int radius,TreeSet<Integer> heaters){
        for(int i:houses){
            Integer heater = heaters.floor(i+radius);
            if(heater == null || Math.abs(i-heater) > radius) return false;
        }
        return true;
    }
}