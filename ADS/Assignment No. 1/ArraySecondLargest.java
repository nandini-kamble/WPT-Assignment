import java.util.*;

class ArraySecondLargest
{
static void display()
{
	int largest = -1;
	int secondLargest = -1;
	
int arr[] = {10, 0, 5, 20, 0, 8, 15};

int temp[] = new int[arr.length];

int j = 0;

for(int i = 0 ; i < arr.length ; i++)
{
	if(arr[i] > largest)
	{
		largest = arr[i];
	}
	
	  if (arr[i] != 0)
	  {
                temp[j++] = arr[i];
        }
}

 while (j < arr.length)
	 
            temp[j++] = 0;
     
        for (int i = 0; i < arr.length; i++)
			
            arr[i] = temp[i];

for(int i = 0 ; i < arr.length ; i++)
{
	if(arr[i] > secondLargest && arr[i] != largest)
	{
		secondLargest = arr[i];
	}	
}

System.out.println(secondLargest);
System.out.println(Arrays.toString(temp));
}

public static void main(String args[])
{
display();
}
}
