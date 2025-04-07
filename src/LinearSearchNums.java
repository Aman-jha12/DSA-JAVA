import java.util.Scanner;
class LinearSearchNums{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5,6};

        if(LinearSearch3(arr,3)!=Integer.MAX_VALUE){
            System.out.println("Element found ");
        }
        else{
            System.out.println("Element not found");
        }
    }
// Returning the index
    static int LinearSearch(int [] arr,int key){
        if(arr.length==0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }

//returning true or false
static boolean LinearSearch2(int [] arr,int key){
    if(arr.length==0) {
        return false;
    }
    for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
            return true;
        }
    }
    return false;
}
//returning the element itself if found
static int LinearSearch3(int [] arr,int key){
    if(arr.length==0) {
        return Integer.MAX_VALUE;
    }
    for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
            return arr[i];
        }
    }
    return Integer.MAX_VALUE;
}
}