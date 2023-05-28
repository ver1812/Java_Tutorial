class P6
{
    public static void main(String[] args)
    {
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        double n3 = Double.parseDouble(args[2]);
        double avg = (n1 + n2+ n3) /3;
        System.out.println("avg = " + avg);
        System.out.println(String.format("%.2f",avg));
        System.out.println(String.format("%.3f",avg));
    }
}