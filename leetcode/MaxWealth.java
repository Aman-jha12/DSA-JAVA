//leetcode question link=" https://leetcode.com/problems/richest-customer-wealth"

public class MaxWeaalth{

    class Solution {
        public int maximumWealth(int[][] accounts) {
            int[] wlt = new int[accounts.length];
            for( int i= 0 ; i<= accounts.length-1; i++){
                if(accounts[i].length != 1){
                    for(int j = 1; j<= accounts[i].length-1; j++){
                        accounts[i][j] = accounts[i][j-1] + accounts[i][j];
                        wlt[i] = accounts[i][j];
                    }
                }
                else{
                    wlt[i] = accounts[i][0];
                }


            }
            int max = 0;
            for(int x = 0; x<= wlt.length -1; x++){
                if(wlt[x] > wlt[max]){
                    max = x;
                }
            }
            return wlt[max];
        }
    }
    }

