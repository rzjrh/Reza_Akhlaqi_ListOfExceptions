/* 
Create ArrayList
Try to cast each element to an Integer
Use try/catch blocks to handle the exceptions
*/
package lists.of.exceptions;


import java.util.ArrayList;     //lib method for Array

public class Exceptions {
    public void TryError(){
    ArrayList<Object> NewList = new ArrayList<>();     //Creating an array list as an object

    NewList.add(2019);
    NewList.add("Coding");     
    NewList.add("Merit America");
    NewList.add("Dojo");
    NewList.add(2018);
    NewList.add("X99");
    NewList.add("My best Year");
    NewList.add(2020);
    
    for(int i = 0; i < NewList.size(); i++) {
    try{
            Integer castedValue = (Integer) NewList.get(i);
            System.out.println("Nice! Accepted Value is:  "+ castedValue);
        } catch (ClassCastException e){
            System.out.println("There is a problem!");
        }
    }
    }
    
    
//end
}
