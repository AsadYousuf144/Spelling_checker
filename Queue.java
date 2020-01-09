/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbas
 */

public class Queue {
     
    public static final int capacity = 1000;    
    static String [] Mistakes = new String [capacity];
    public static int front=0; 
    public static  int rear=-1; 
    public static final int size=0;



public static void Enqueue(String a){
		
	Mistakes[++rear]=a;
                                
}
	
public static void Dequeue(){

    for(int i=0; i<rear; i++)
    {
         Mistakes[i]=Mistakes[i+1];
    }
    rear--;
}


}




