package powerSet;

import java.util.ArrayList;

//Generates subsets of a string
public class SubsetGenerator
{
    private String original;
    private String remaining;
    private ArrayList<String> subsets;
    //Constructs a subset generator
    //@param input string to have subsets generated
    public SubsetGenerator(String input)
    {
        original = input;
        remaining = original;
        subsets = new ArrayList<String>();
    }

    public void printSubsets()
    {
        System.out.print(subsets);
    }
    //gets subsets
    public void generateSubsets()
    {       
        //if the string is empty, it has no subsets
        if(remaining.length() == 1)
        {
            subsets.add(remaining);
            return;
        }
        else
        {
            //remove the first character and hold onto it
            String removed = remaining.substring(0,1);
            remaining = remaining.substring(1);
            //recursion. Eventually it should add the last character in the string to the ArrayList and return
            generateSubsets();
            //Take each element that is in the ArrayList, add the removed character to it, add this back to the list
            for (int i = 0; i < subsets.size(); i++)
            {
                String temp = removed + subsets.get(i);
                subsets.add(temp);
            }
            subsets.add(removed);//add the removed character by itself
            return;
        }
    }

}