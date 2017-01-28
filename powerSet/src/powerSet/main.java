package powerSet;

public class main 
{
    public static void main(String[] args) 
    {
        SubsetGenerator s = new SubsetGenerator("abc");
        s.generateSubsets();
        s.printSubsets();
    }

}