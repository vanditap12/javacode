package exception_pro;

public class ClassnotFound_ex {
    
	    public static void main(String args[]) 
	    {
	        try 
	        {
	            Class.forName("Class_namme");
	        }
	        catch (ClassNotFoundException ex)
	        {
	            ex.printStackTrace();
	        }
	    }
	
}
