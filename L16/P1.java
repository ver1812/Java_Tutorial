import java.io.*;
class p1{
    public static void main(String[] args) {
        Console c = System.console();

        while(true){
            try{
                int op = Integer.parseInt(c.readLine("1 square , 2 cube and 3 exit "));
                if(op==1){
                    try{
                        double num = Double.parseDouble(c.readLine ("enter number ")); 
                        double res = num * num;
                        String msg = "square =" + String. format("%.2f", res);
                        System.out.println(msg);

                    }catch(NumberFormatException e){
                        System.out.println("numbers only");
                    }
                }else if(op==2){
                    try{
                        double num = Double.parseDouble(c.readLine("enter number "));
                        double res = num * num * num;
                        String msg = "cube = " + String.format("%.2f", res);
                        System.out.println(msg);
                    }catch(NumberFormatException e) {
                        System.out. println("numbers only");
                        } 
                }else if(op ==3){
                    break;
                }else{
                    System.out.println("Invalid ");
                }

                
            }catch(NumberFormatException e){
                System.out.println("Integers Only ");
            }
        }
    }
}