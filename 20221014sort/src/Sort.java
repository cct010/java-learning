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
    //选择排序
    public static void selectSort(int[] array) {
        for(int i =0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    swap(array,i,j);
                }
            }
        }
    }
    public static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    //优化选择排序
    public static void selectSort1(int[] array){
        for(int i =0;i<array.length;i++){
            int minIndex = i;
            for(int j = i+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                        minIndex = j;
                }
            }
            swap(array,i,minIndex);
        }
    }
    //优化冒泡排序
    public static void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            boolean isSort = true;
            for (int j=0;j<array.length-i-1;j++){
                int tmp = 0;
                if(array[j+1]<array[j]){
                    swap(array,j,j+1);
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
    }
    //鸡尾酒排序
    public static void bubbleSort1(int[] array){
        for (int i=0;i<array.length/2;i++){
            boolean isSort = true;
            for (int j=i;j<array.length-i-1;j++){
                //int tmp = 0;
                if(array[j+1]<array[j]){
                    swap(array,j,j+1);
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
            isSort = true;
            for (int j=array.length-i-1;j>i;j--){
                //int tmp = 0;
                if(array[j-1]>array[j]){
                    swap(array,j,j-1);
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
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
        int[] array2 ={122,213,455,776,908,910,314,562,691};
        System.out.println("\n选择排序：");
        selectSort1(array2);
        for (int x:array2){
            System.out.print(x+" ");
        }
        int[] array3 ={122,213,455,776,908,910,314,562,691};
        System.out.println("\n优化冒泡排序：");
        bubbleSort(array3);
        for (int x:array3){
            System.out.print(x+" ");
        }
        int[] array4 ={122,213,455,776,908,910,314,562,691};
        System.out.println("\n鸡尾酒排序：");
        bubbleSort1(array4);
        for (int x:array4){
            System.out.print(x+" ");
        }
    }
}
