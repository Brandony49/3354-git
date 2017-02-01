//package adder;

public class add {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide any number of integers to add");
            System.err.println("Invalid character");
          
        }
    }

    private static int addArguments(String[] args) {
      int sum = 0;
      
      if((args[0]) == "-"){
       
       for (int i = 1; i <args.length; i++)
           sum = sum - Integer.valueOf(args[i]); 
    } 
  	  else{
      	for (int i = 0; i <args.length; i++)
           sum = sum + Integer.valueOf(args[i]); 
    } 
     
      return sum;
    }
}
