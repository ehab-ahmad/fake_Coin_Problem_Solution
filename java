import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ehab_Ahmad
 */
public class fake_Coin_Problem_Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //index of the fake coin
        int counterfeit = randInt(0,11);
        int t=0;
        //wight of the fake coin is between 6 and 9 while the true weight is 10
    int counterValue = randInt(6,9);
    
    System.out.print("we have 10 coins one of them is made from a lighter metal");
    System.out.print("\n");
    System.out.print("we have to find the fake coin");
    System.out.print("\n");
    int coins[] = new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
  
    coins[counterfeit] = (counterValue);
       
    
    System.out.print(" \n [");
    for(int x = 0; x < 12; x++){
      System.out.print(coins[x]);

    
      if(x != 11){
        System.out.print(", ");
      }
      
    }
    System.out.println("] \n");



    //weighting coins
    // NOTE: you can improve this algorithm by splitting into two groups of six instead of four groups of three
    int wg1=0;
    for(int x = 0; x <3; x++){
         wg1+=coins[x];
     }


    int wg2=0;
    for(int x = 3; x <6; x++){
         wg2+=coins[x];
     }
    int wg3=0;
    for(int x = 6; x <9; x++){
         wg3+=coins[x];
     }
    int wg4=0;
    for(int x = 9; x <12; x++){
         wg4+=coins[x];
     }


    if (wg1<wg2){
    
    if (coins[0]<coins[1]){ System.out.println("index is 0");t+=1;}
    if (coins[0]>coins[1]){ System.out.println("index is 1");t+=1;}
    if (coins[0]==coins[1]){ System.out.println("index is 2");t+=1;}
      }

     if (wg1>wg2){
     
    if (coins[3]<coins[4]){ System.out.println("index is 3");t+=1;}
    if (coins[3]>coins[4]){ System.out.println("index is 4");t+=1;}
    if (coins[3]==coins[4]){ System.out.println("index is 5");t+=1;}
      
     }

     if (wg3<wg4){

    if (coins[6]<coins[7]){ System.out.println("index is 6");t+=1;}
    if (coins[6]>coins[7]){ System.out.println("index is 7");t+=1;}
    if (coins[6]==coins[7]){ System.out.println("index is 8");t+=1;}

     }

     if (wg3>wg4){

    if (coins[9]<coins[10]){ System.out.println("index is 9");t+=1;}
    if (coins[9]>coins[10]){ System.out.println("index is 10");t+=1;}
    if (coins[9]==coins[10]){ System.out.println("index is 11");t+=1;}
    
     }
    }
//method for random numbers
  public static int randInt(int min, int max) {

    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
  }
}

