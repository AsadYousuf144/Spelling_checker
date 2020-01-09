/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbas
 */


public class Searching {
   
boolean BinarySearch(String data[], int lb,int ub, String find)
 {
      
		int mid;
                while(lb<ub) 
		{
			    if(data[lb].equals(find)|| data[ub].equals(find))
                    {

                            return true;
                          
                    }
		   else 
		   {   
			mid = (lb+ub)/2;
                        
                            if(data[mid].equals(find))
                            {	
                                return true;			
                            }
                            else
                            {	
                                if(data[mid].compareTo(find)>0)
                                {   
                                    ub = mid-1;
                                }
                                else 
                                {       	
                                     lb = mid+1;
                                }
                            }
                      }
                }
		return false;
	}
	
    
    boolean LinearSearch (String data[], int lb,int ub, String find) 
    { 
        for (int i=lb ; i<=ub ; i++)
        { 
            if (data[i].equals(find)) 
            { 
                return true; 
            } 
        } 
        
        return false; 
    }
    
    
}
