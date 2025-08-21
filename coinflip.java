class Main {
    public static void main(String[] args) {
        int ch=( (int) (Math.random()*10));
        if (ch<=4){
            System.out.print("   ---- \n /      \\\n| HEADS  |\n \\      /\n   ---- ");
        }else{
            System.out.print("   ---- \n /      \\\n| TAILS  |\n \\      /\n   ---- ");
        }
    }
}
/*
OUTPUT-
   ---- 
 /      \
| HEADS  |
 \      /
   ---- 
*/