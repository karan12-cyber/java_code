// import java.util.Scanner;


// public class reverse_array {
//     public static void main(String[] args) {
        
//          Scanner sc =new Scanner(System.in);
//         // num=sc.nextInt();
//         int num;
//         System.out.println("Enter the size of the array");
//         num=sc.nextInt();
//         int arr[]=new int[num];
//         System.out.println("Enter the elements of the array");
//         for(int i=0;i<num;i++){
//             arr[i]=sc.nextInt();
           
//             }int f=arr.length;
//             System.out.println("Reverse of the array is");
//             for(int i=f-1;i>=0;i--){
//                 System.out.print(arr[i]+" ");
//         }

//     }
                        
            
            
// } 
          

    import java.util.Scanner;
    public class reverse_array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                }
                System.out.println("Reverse of the array is");
                int m=arr.length;
                for(int i=0;i<n/2;i++){
                    int t=arr[i];
                    arr[i]=arr[m-i-1];
                    arr[m-i-1]=t;

                }
                    for(int i=0;i<n;i++){
                        System.out.print(arr[i]+" ");




                            
                    
                    }
                }
            }                      
                

                   
              
        
            




