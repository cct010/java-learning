import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-26
 * Time: 19:27
 */
class SeqList {
    public int[] e;
    public int usedSize;
    public SeqList(){
        this.e = new int[10];
    }
    // 打印顺序表
    public void display() {
        for(int i=0;i<this.usedSize;i++){
            System.out.print(e[i]+" ");
        }
        System.out.println();
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(pos<0||pos>usedSize){
            System.out.println("输入不合法");
            return ;
        }
        if(pos>e.length){
            this.e = Arrays.copyOf(this.e,2*this.e.length);
        }
        for(int i =this.usedSize-1;i>=pos;i--){
            this.e[i+1] = this.e[i];
        }
        this.e[pos] = data;
        this.usedSize ++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i =0;i<this.usedSize;i++){
            if(this.e[i]==toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i =0;i<this.usedSize;i++){
            if(this.e[i]==toFind){
                return i;
            }
        }
        return -1; }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0||pos>=this.usedSize&&this.usedSize != 0){
            System.out.println("输入不合法！");
            return -1;
        }
        if(this.usedSize == 0){
            System.out.println("列表为空！");
            return -1;
        }
        return this.e[pos]; }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0||pos>this.usedSize&&this.usedSize != 0){
            System.out.println("输入不合法！");
            return ;
        }
        if(this.usedSize == 0){
            System.out.println("列表为空！");
            return ;
        }
        this.e[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if(this.usedSize==0){
            System.out.println("空！");
        }
        int index = search(toRemove);
        if(index == -1){
            System.out.println("不存在你想要删除的数");
        }
        for(int i= index ;i<this.usedSize-1;i++){
            this.e[i]= this.e[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize; }
    // 清空顺序表
    public void clear() {
        /*
        for(int i = 0;i<this.usedSize;i++){
            this.e[i] = null;
        }//引用类型
         */
        this.usedSize = 0;
    }
}
public class Test{
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.display();
        boolean b = seqList.contains(1);
        System.out.print(b);
        seqList.setPos(0,2);
        seqList.display();
        int x= seqList.size();
        System.out.println(x);
    }
}

