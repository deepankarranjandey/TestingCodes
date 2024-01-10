package arrays;


/*
*
* Find the minimum value  of the row where we have received the maximum value
*
* */
public class FindMinofMaxValueRow {
    public static void main(String[] args) {

        int [] [] arr = {{9,3,6 },{23,1,6}, {2,5,12}};
        int max_Value= arr[0][0];
        int row_num= 0;


        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3;j++)
            {
                if (arr[i][j]>max_Value)
                {
                    max_Value= arr[i][j];
                    row_num=i;


                }
            }

        }
        System.out.println("The maximum value: "+ max_Value + "the row number is : " + row_num);



    }
}
