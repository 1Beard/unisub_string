package ua.proj_test.unisub_string;


public class App 
{
    public static void main( String[] args )
    {
        String t = "";
        int n = 0, f = 0;
        char x = ' ';
        if(args[0].length() > 0){
               while(true){
            	   for(int i = 0; i < args[0].length(); i++){
            		   x = args[0].charAt(n);
            		   if(i != n){
            			   if(args[0].charAt(i) == x){
            				   f++;
            			   }
            		   }
            	   }
            	   if(f == 0){
            		   t += x;
            	   }
            	   f = 0;
            	   n++;
            	   if(n < args[0].length()){
        		
            	   }else{
            		   break;
            	   }
               }
               System.out.println(t);
        }
   }
}
