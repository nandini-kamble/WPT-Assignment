class Recursion
{
static int i = 2;
static int sum = 0;

static boolean isPrime(int n , int i)
{
if(n <= 2)
{
return (n == 2) ? true : false;
}

if(n % i == 0)
{
	return false;
}
if(i * i > n)
{
	return true;
}
return isPrime(n , i + 1);
}
static int power(int a , int b)
{
	if (b == 0)
        return 1;
    
    else
        return a * power(a, b - 1);
}

static int sumOfDigits(int num)
{
	if(num == 0)
	{
		return 0;
	}
	
	return num % 10 + sumOfDigits(num / 10);
}

static boolean isPalRec(String str, int s, int e)
    {
        if (s == e)
        return true;

        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
     
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);
 
        return true;
    }
 
    static boolean isPalindrome(String str)
    {
        int n = str.length();

        if (n == 0)
            return true;
 
        return isPalRec(str, 0, n - 1);
    }
	
	static int fibonacci(int n)
	{
		if(n <= 1)
		
			return n;
		
		else
		
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
class RecursiveMethods
{
public static void main(String args[])
{
	Recursion obj = new Recursion();
    System.out.println(obj.isPrime(7, 2));
	
	String str = "racecar";
	
	System.out.println(obj.isPalindrome(str));
	
	System.out.println(obj.sumOfDigits(1234));
	
	System.out.println(obj.power(2,5));
	
	    int n = 5;
        int result = obj.fibonacci(n);
        System.out.println(result);
}
}
