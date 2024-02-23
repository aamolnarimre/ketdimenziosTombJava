
package ketdimenziostomb;


import java.util.Random;

public class KetdimenziosTomb {



    public static void main(String[] args) {
         int [] [] ketdimenziosTomb = new int [5] [3] ;
        Random rnd = new Random();
    //[    [3,3,3], [3,3,3], [3,3,3], [3,3,3],[3,3,3]]
           for (int i = 0; i < ketdimenziosTomb.length; i++) {
            System.out.println("");
            for (int j = 0; j < ketdimenziosTomb[i].length; j++) {
                ketdimenziosTomb [i] [j] = rnd.nextInt(1,1000);
           
               
            }
        }
        for (int i = 0; i < ketdimenziosTomb.length; i++) {
            System.out.println("");
            for (int j = 0; j < ketdimenziosTomb[i].length; j++) {
                System.out.print(ketdimenziosTomb[i][j] + " ");
           
               
            }
        }
       
       
        /*
        0 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0      int[] asd = new int [4] [5]
        0 0 0 0 0
        */
   
    }
   
}

//Video 2:27
    
    





   
  
       
  