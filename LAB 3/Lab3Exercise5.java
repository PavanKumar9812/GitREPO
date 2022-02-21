public class Lab3Exercise5
{    
    public static void main(String[] args) 
      {    
        String string = "Welcome to capgemini";    
        int counter = 0;    
           
        for(int i = 0; i < string.length(); i++) 
         {    
            if(string.charAt(i) != ' ')    
                counter++;    
         }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters : " + counter);    
    }    
}