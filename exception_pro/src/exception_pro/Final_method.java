package exception_pro;

public class Final_method extends Final_keywrd
{
	/* void print_str()
	{
		System.out.println("final method");
	}*/
	void print()
	{
		System.out.println("non-final method");
	}
	public static void main(String[] args) 
	{
	 Final_method obj= new Final_method();
	 obj.print_str();
	 obj.print();
    
	}

}
