public class Rnote{
    public static void main(String[] args){
        String ransom="We will hold him hostage",magazine="New watering teachnology has revolutionized irrigation and helped saving water and helped out even more on advanced cr....! (read more on pg 5)";
        ransom=ransom.replaceAll("\\s","");
        int count=0,i,j, len=ransom.length();
        for(i=0;i<len;i++){
            char ch=ransom.charAt(i);
            ch=Character.toLowerCase(ch);
            for(j=0;j<magazine.length();j++){
                char cha=magazine.charAt(j);
                cha=Character.toLowerCase(cha);
                if(ch==' '){
                    break;
                }
                else if(ch==cha){
                    count++;
                    magazine=magazine.replaceFirst(String.valueOf(cha),"");
                    break;
                }
            }
        }if(count==len){
            System.out.print("The ransom note can be constructed!");
        }else{
            System.out.print(count+" "+len+" The note cannot be constructed!");
        }
    }
}