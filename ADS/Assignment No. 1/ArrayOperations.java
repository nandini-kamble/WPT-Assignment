class Array
{
static int arr[] = {1, 3, 3, 3, 5, 6, 8};

static int arrPeak[] = {1, 2, 18, 4, 5, 0};

static int count = 0 , index = 0, peakElement = 0, firstOccurance = 0, lastOccurance = 0;

static int largest = -1;

static int returnCount(int key)
{
for(int i = 0 ; i < arr.length ; i++)
{
if(arr[i] == key)
{
count++;
}
}
return count;
}

static int returnIndex(int key)
{
for(int i = 0 ; i < arr.length ; i++)
{
if(arr[i] == key)
{
 index = arr[i] - 1;
}
}
return index;
}

static int returnPeakElement()
{
for(int i = 0 ; i < arrPeak.length ; i++)
{
if(arrPeak[i] > largest)
{
largest = arrPeak[i];
peakElement = largest;
}
}
return peakElement;
}

static int returnFirstOccurance(int key)
{
for(int i = 0 ; i < arr.length ; i++)
{
if(arr[i] == key)
{
 firstOccurance = i;
 break;
}
}
return firstOccurance;
}

static int returnLastOccurance(int key)
{
for(int i = arr.length - 1 ; i >= 0 ; i--)
{
if(arr[i] == key)
{
 lastOccurance = i;
 break;
}
}
return lastOccurance;
}
}
class ArrayOperations
{
public static void main(String args[])
{
Array obj = new Array();

System.out.println("Key found at index : " + " " + obj.returnIndex(3));
System.out.println("First Occurance : " + " " + obj.returnFirstOccurance(3));
System.out.println("Last Occurance : " + " " + obj.returnLastOccurance(3));
System.out.println("Total Elements: : " + " " + obj.returnCount(3));
System.out.println("Peak Element : " + " " + obj.returnPeakElement());
}
}