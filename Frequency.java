public class Frequency{
    public static void main(String[] args){
        int i, j,count;
        int[] arr= {1,2,3,4,4,5,1,4,3,2};
        for(i=0;i<arr.length;i++){
            if(arr[i]==-1){
                continue;
            }count=1;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }else{
                    continue;
                }
            }System.out.println(arr[i]+" | "+count);
        }
    }
}