/*
  void reset();     //start over from the start of the sequence
  int length();     //returns the total length of the sequence
  boolean hasNext(); //does the sequence have more elements?
  int next();       //return the current value in the sequence and advances to the next element.

This means if you have an integer sequence `s` Then you could use it as follows:

while ( s.hasNext() ){
   int d = s.next();
   //do sometehing with d
  }

The easiest way to see this is by creating one that does NOT store all of the values! We don't have to make an array or list of
numbers if we want all of the numbers in a given range. If I say "tell me the sequence of integers from 30 to 50", you don't
need to keep all of them in memory, you can just step through each value, keeping track of the current one and incrementing to the next.

You will now implement this interface as a Range object. This is an IntegerSequence that is a contiguous range from a to b inclusive.
Range does not allow for non-consecutive values, but can store a big set of numbers without taking up a lot of space!
You will implement this using a start/end value, and keep track of the current value.
You will throw a NoSuchElementException when the user tries to get the next value when there are no more values left.

*/

import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int startingIndex,  int endingIndex){
    start = startingIndex;
    end = endingIndex;
    current = startingIndex;
  }

  public void reset(){
    current = start;
  }


  public int length(){
    return end - start + 1;
  }

  public boolean hasNext(){
    return(current <= end);
  }


}
