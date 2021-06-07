import java.util.Arrays;

class DeleteElements {
    public static void remIndex( int [] arr, int remIndex )
{
   for ( int i = remIndex ; i < arr.length - 1 ; i++ )
   {
      arr[ i ] = arr[ i + 1 ] ; 
   }

         
          System.out.println(Arrays.toString(arr));
     }
      public static void main(String[] args) {
          int arr[] = {1,2,3,11,5};
          int index = 3;
          remIndex(arr, index );
      } 
    }

