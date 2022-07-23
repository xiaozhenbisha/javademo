package theme7array;

/**
 * @author shkstart
 * @create 2022-07-23 23:02
 */

public class BubbleSort {
    public static void main(String args[ ]){
        int i,j;
        //将要排序的数字存储到数 组中
        int intArray[]={30,1,-9,70,25};
        int len=intArray.length;
        //依次读取数组中的每一个 数值
        for( i=0;i<len-1;i++){
            for( j=i+1;j<len;j++){
                if(intArray[i]>intArray[j]){
                    int temp=intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=temp;
                }
            }
        }
        for(int I=0;I<len;I++)
            System.out.println(intArray[I]+ " ");
    }
}
