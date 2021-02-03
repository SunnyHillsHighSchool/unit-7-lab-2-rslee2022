//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rachel Lee
//Date - 02/03/2021

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	//Method that checks if the last value in the list occurs more than once, returns a boolean
  //Parameter: Integer list
  public static boolean go( List<Integer> ray)
	{
    //Initialize and declare boolean variable named lastVal, set to false
    boolean lastVal = false;
    //For loop: loop control variable Integer i, loop as long as i is less than size - 1, i increments by 1
    for(Integer i = 0; i < ray.size() - 1; i++)
    {
      //if i equals the element at index size-1 of ray
      if(ray.get(i).equals(ray.get(ray.size()-1)))
      {
        //set lastVal to true
        lastVal = true;
        //return lastVal
        return lastVal;
      }
    }
    //return lastVal
    return lastVal;
	}
}