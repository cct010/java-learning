/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-10-14
 * Time: 19:41
 */
public class Sort {
    //直接插入排序
    public static void  insertSort(int[] array){
        for(int i = 1;i<array.length;i++){
            int tmp = array[i];
            int j= i-1;
            for (;j>=0;j--){
                if (array[j] > tmp) {
                    array[j+1]=array[j];
                }
                else {
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    //希尔排序
    public static void shell(int[] array,int gap){
        for (int i =0;i<array.length;i++){
            int tmp = array[i];
            int j = i-gap;
            for (;j>=0;j-=gap){
                if(array[j]>tmp){
                    array[j+gap] = array[j];
                }
                else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] array){
        int gap = array.length;
        while(gap>1){
            shell(array,gap);
            gap /=2;
        }
        shell(array,1);
    }
    public static void main(String[] args) {
        int[] array ={12,23,45,76,98,90,34,52,61};
        int[] array1 ={12,23,45,76,98,90,34,52,61};
        System.out.println("直接插入排序：");
        insertSort(array);
        for (int x:array){
            System.out.print(x+" ");
        }
        System.out.println("\n希尔排序：");
        shellSort(array1);
        for (int x:array1){
            System.out.print(x+" ");
        }
    }
}
