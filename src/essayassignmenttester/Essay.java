/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package essayassignmenttester;

/**
 *
 * Essay subclass
 */
public class Essay extends Document{
    //Declare variables
    private int wrds;
    
    
  /**
   * pre: void
   * post: void
   * Default constructor of  subclass to call to superclass
   */
    public Essay(){
        super();
    }
    
  /**
   * pre: void
   * post: boolean value
   * Method to determine if the essay is a valid length
   */
    public boolean validLength(){
       
        final int MIN_WORDS=1500, MAX_WORDS=1000;
        wrds = super.getWords();
        
        if(wrds<MIN_WORDS || wrds>MAX_WORDS){
            return false;
        }
        else{
            return true;
        }
    }
    
    
}
