/*
 * Fractional Knapsack
    Given the weights and values of N items, 
    put these items in a knapsack of capacity W 
    to get the maximum total value in the knapsack.    
    Example: 
    value = [60, 100, 120]
    weight = [10, 20, 30]
    W: 50
    ans = 240
 */
package T25Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class L2FractionalKnapsack {
   public static void main(String[] args) {
      int[] value = { 60, 100, 120 };
      int[] weight = { 10, 20, 30 };
      int w = 50;
      System.out.println(fractionalKnapsack(value, weight, w));
   }

   static double fractionalKnapsack(int[] val, int[] weight, int w) {
      // defining items matrix and calculating val/weight ratio
      double[][] items = new double[val.length][3];
      for (int i = 0; i < val.length; i++) {
         items[i][0] = val[i];
         items[i][1] = weight[i];
         items[i][2] = val[i] / weight[i];
      }

      // sorting item based on v/w ratio
      Arrays.sort(items, Comparator.comparingDouble(o -> o[2]));

      // calculating max value
      double max = 0; // max value
      int capacity = w; // remaining capacity of knapsack

      // reverse looping through item array and filling knapsack with item having max
      // ratio
      for (int i = items.length - 1; i >= 0; i--) {
         // if weight of item <= remaining capacity of knapsack
         if (items[i][1] <= capacity) {
            max += items[i][0]; // max value += item's value
            capacity -= items[i][1]; // remaining capacity -= items's weight
         } else {
            // select fraction of item
            max += capacity * items[i][2]; // max value += reaming capacity * v/w ratio of item
            break;
         }
      }

      return max;
   }
}