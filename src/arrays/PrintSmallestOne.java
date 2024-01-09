package arrays;

public class PrintSmallestOne {

    public static void main(String[] args) {



        int [] [] arr = {{9,3,6 },{23,1,6}, {2,5,12}};
        int min=arr[0][0];
        for (int i=0; i <3; i++)
        {
            for(int j=0; j<3;j++)
            {
                if (arr [i][j] < min)
                {
                    min= arr[i][j];
                }



            }

        }
        System.out.println("Smallest one is :" + min);
    }




}
