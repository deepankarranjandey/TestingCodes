package arrays;

import java.util.Arrays;

public class TestMultArr {


    public static void main(String[] args) {

        int [] [] multArr= new int[2][3];
        multArr [0] [0]=2;
        multArr [0] [1]=3;
        multArr [0] [2]=4;
        multArr [1] [0]=2;
        multArr [1] [1]=3;
        multArr [1] [2]=2;

//        System.out.println(multArr[1][0]);

        for (int i=0; i< 2;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(multArr[i][j] + " ");

            }
            System.out.println();
        }



    }




}
