public class test {
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        arr[0]=8;
        System.out.println("new element "+arr[0]);
        System.out.println(arr.length);
       
        //Printing array
        for(int i=0;i<arr.length;i++){
            System.out.println("value at index"+i+"is "+arr[i]);
        }

        int max=arr[0];   // finding max of array
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max"+max);

        int min=arr[0];    //finding min of array
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min"+min);


        int n=arr.length;  // reverse array
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
       for(int i=0;i<n;i++) System.out.println(arr[i]);


       int rrr[]={9,8,7,6}; // Linear search
       int target=9;
       int index=-1;
       for(int i=0;i<rrr.length;i++){
        if(target==rrr[i]){
            index=i;
            break;
        }
       }
       if(index!=-1){
        System.out.println("element found at index"+index);
       }
       else{
        System.out.println("not found");
       }

       int k[]={12,40,30,20,100}; // Bubble sort
       int m=k.length;
       for(int i=0;i<m-1;i++)
    {
        for(int j=0;j<m-1-i;j++){
            if(k[j]>k[j+1]){
                int temp=k[j];
                k[j]=k[j+1];
                k[j+1]=temp;
            }
        }
    }
    for(int i=0;i<m;i++)  System.out.println(k[i]);


    int[] a = {10, 20, 30, 40, 50, 60, 70}; //Binary search Find the index of a target number in a sorted array
        int tar = 60;
        
        int left = 0;
        int right = a.length - 1;
        int inde = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (a[mid] == tar) {
                inde= mid;
                break; 
            } else if (a[mid] < tar) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        System.out.println("Target found at index: " + inde);
    

        int[] ar = {2, 7, 11, 15}; // Two Sum (Using Two-Pointers) Must be sorted for this approach
        int targe = 18;
        
        int lef = 0;
        int righ = ar.length - 1;
        
        while (lef < righ) {
            int currentSum = ar[lef] + ar[righ];
            
            if (currentSum == targe) {
                System.out.println("Found numbers: " + ar[lef] + " and " + ar[righ]);
                break;
            } else if (currentSum < targe) {
                lef++; // We need a bigger sum, move left pointer right
            } else {
                righ--; // We need a smaller sum, move right pointer left
            }
        }
    }
}

    
