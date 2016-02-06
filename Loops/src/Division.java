public class Division {

	public static void main(String[] args) {
		
		int n = 0;
		int k = 0;
		
        Console console = new Console();

		
		System.out.println("Insert value of the number");
        n=Integer.parseInt(console.readLine());
		int i = n;
        if (n>100000||n<=1) {
        System.out.println("Error");
        return;
        }
    	System.out.println(n);	
    	while (i<=n && i>=2)
        {
        	i/=2;
        	k++;
        }
		System.out.println("The number was devided "+ k + " times ");

	}

}
