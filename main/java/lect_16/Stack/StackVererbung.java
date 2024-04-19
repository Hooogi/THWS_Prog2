package lect_16.Stack;

import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList
{
  public Object pop(){
      return this.remove(this.size()-1);
  }

  public void push(Object obj){
      this.add(obj);
  }
}
