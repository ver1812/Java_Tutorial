class P13 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        try{
        int num = Integer.parseInt(args[0]);
        String res = num % 2== 0 ? "Even " : "Odd";
        System.out.println(res);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter a valid number ");

        }
        catch(NumberFormatException e){
            System.out.println("Enter a valid number ");
        }
        System.out.println("bye");

    }
    
}
