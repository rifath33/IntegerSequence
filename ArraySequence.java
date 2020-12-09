/*
You are adding onto your NumberSequence lab. I will give you the majority of the period and homework for this to be completed.

Range does not allow for non-consecutive values, however non-consecutive values are still sequences, so we need a new implementation of this interface:
public class ArraySequence implements IntegerSequence
This implementation will unfortunately have to store all of the values, but can be used interchangeably with Range.

Similar to before you will throw a NoSuchElementException when the user tries to get the next value when there are no more values left.
*/

import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }


  public void reset(){
    currentIndex = 0;
  }


  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    return(currentIndex < data.length);
  }

  //@throws NoSuchElementException
  public int next() throws NoSuchElementException{
    if(!hasNext())
    throw new NoSuchElementException();
    else{
      int memory = data[currentIndex];
      currentIndex++;
      return memory;
    }
  }

}
