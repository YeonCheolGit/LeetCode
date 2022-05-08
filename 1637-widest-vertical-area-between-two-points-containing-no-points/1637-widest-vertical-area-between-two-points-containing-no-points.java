import java.util.*;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> widths = new ArrayList<>();
        
        for (int i=0; i<points.length; i++) {
            widths.add(points[i][0]);
        }
        
        Collections.sort(widths);
        
        return getMaxWidth(widths);
    }
    
    public int getMaxWidth(List<Integer> widths) {
        int maxWidth = 0;
        for (int i=0; i<widths.size()-1; i++) {
            int differenceBetweenCurrentAndNext =  calculateDifference(widths.get(i+1), widths.get(i));
            if (differenceBetweenCurrentAndNext > maxWidth) {
                maxWidth = differenceBetweenCurrentAndNext;
            }
        }
        return maxWidth;
    }
    
    public int calculateDifference(int from, int minusTo) {
        return from - minusTo;
    }
    
}