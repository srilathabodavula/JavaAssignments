
public class Day14Assignment extends Exception{

	public Day14Assignment() {
		// TODO Auto-generated constructor stub
		
	}
	

	public static void main(String[] args) throws MycustomException {
		// TODO Auto-generated method stub
        int conval; 
		String[] strlist = {"23", "45.67", "test", "123f"};
		try
		{
			for(int i=0; i< strlist.length;i++)
			{
				conval = Integer.parseInt(strlist[i]);
				System.out.println(conval);
				
			}
		
		}
		catch(Exception e)
		{
			throw new MycustomException("Hi");
			
		//System.out.println("Exception is :"+ e);
			}
		
		// Custom exception------------------------------------------------
		
		
		}

}
