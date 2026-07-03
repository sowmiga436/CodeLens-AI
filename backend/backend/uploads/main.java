import java.util.*;

//public class main {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //print all elements
       /* int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }*/
       //count even numbers
       /*int n= sc.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
       }
       int count =0;
       for (int i = 0; i < arr.length; i++) {
          if(arr[i]%2==0){
            count++;
          }
       }
       System.out.print(count);*/
// count odd numbers
       /*int n= sc.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
       }
       int count=0;
       for (int i = 0; i < arr.length; i++) {
          if(arr[i]%2!=0){
            count++;
          }
           
       }
       System.out.print(count);
    }
    }*/
   //sum of array
   /*int n= sc.nextInt();
   int arr[] = new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   int sum=0;
   for (int i = 0; i < n; i++) {
       sum = sum+arr[i];
       
   }
   System.out.print("sum="+ sum);
}

    }*/
   /*int n = sc.nextInt();
   int arr[] = new int[n];
   for (int i = 0; i < n; i++) {
       arr[i]=sc.nextInt();
   }
   int sum = 0;

for(int i = 0; i < arr.length; i++)
{
    sum += arr[i];
}

double avg = (double)sum / arr.length;

System.out.println("Average = " + avg);*/
/* 
int arr[]= {10, 20, 30, 40, 50};
int key = 30;
boolean found = false;
for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
        found=true;
        break;
    }
   }
   if(found){
    System.out.print("element found");
   }
   else{
    System.out.print("not found");
   }*/
/*nt[] arr = {10,20,30,40,50};

        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }*/
      /*int[] arr = {40,10,30,20,50};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <smallest)
            {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest &&
                    arr[i] != smallest)
            {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest = "
                            + secondSmallest);*/


/*class Main
{
    static int numberOfCarries(int num1 , int num2)
    {
        int carry = 0, sum, p, q, count = 0;
        while((num1!=0)&&(num2!=0))
        {
            p = num1 % 10;
            q = num2 % 10;
            sum = carry + p + q;
            if(sum>9)
            {
                carry = 1;
                count++;
            }
            else
            {
                carry = 0;
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return count ;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int x, y, res;
        x = sc.nextInt() ;
        y = sc.nextInt() ;
        res = numberOfCarries(x, y);
        System.out.print(res);*/
        
       
   

 
    


    
    
    
    
    

