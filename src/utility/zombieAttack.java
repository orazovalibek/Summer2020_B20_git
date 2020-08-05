package utility;
import java.util.Scanner;
import java.util.Arrays;

public class zombieAttack {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for(int i=0; i<inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }

            //TODO. Write you code below this line.

            int k = 0;
            System.out.print("Day "+(k++)+" ");
            System.out.println(Arrays.toString(inhabitants));


            for(int i = 0; i < inhabitants.length; i--) {



                for (int j = 0; j < inhabitants.length-1; j++) {

                    if(inhabitants[j] == 0 && inhabitants[j+1] != 0){
                        inhabitants[j+1] /= 2;
                        j++;
                    }else if(inhabitants[j] != 0 && inhabitants[j+1] == 0){
                        inhabitants[j] /= 2;
                    }




                }
                System.out.print("Day "+k+" ");
                System.out.println(Arrays.toString(inhabitants));
                k++;

                int[] arr = new int[inhabitants.length];

                if(Arrays.equals(inhabitants,arr)){
                    System.out.println("---- EXTINCT ----");
                    break;
                }
            }





        }

    }

