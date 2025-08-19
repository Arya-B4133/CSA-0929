import java.io.*;
class Main {
    public static void main(String args[]){
        double T_price=36, R_price=45.50, O_price=20;
        int Q_Tomato=5, Q_Onion=5, Q_Rice=2;
        double Tot_cost_T= T_price*Q_Tomato, Tot_cost_R=  R_price*Q_Rice, Tot_cost_O= O_price*Q_Onion;
        double G_tot=Tot_cost_T+Tot_cost_R+Tot_cost_O;
        System.out.print("--------BILL----------- \nSno. | Item name | Quantity | Price/kg | Total \n");
        System.out.println("1. "+"   "+"Tomato       "+Q_Tomato+"          "+T_price+"        "+Tot_cost_T);
        System.out.println("2. "+"   "+"Rice         "+Q_Rice+"          "+R_price+"        "+Tot_cost_R);
        System.out.println("3. "+"   "+"Onion        "+Q_Onion+"          "+O_price+"        "+Tot_cost_O);
        System.out.println("------GRAND TOTAL-------       \n      =  "+G_tot);
    }
}