
import java.util.Scanner;
public class array_of_student_marks {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num;
        int min;
        int max;
        String name;
        System.out.println("enter the range of loop");
        num=sc.nextInt();
        int marks[]=new int[num];
        String [] array = new String[num];
        for(int j=0;j<num;j++){
            System.out.println("enter the marks of student "+(j+1));
            marks[j]=sc.nextInt();
            System.out.println("enter the name of Student:"+(j+1));
            sc.nextLine();
            array[j]=sc.nextLine();
            
        }
        min=marks[0];
        max=marks[0];
        for(int i=1;i<num;i++){
            if(marks[i]<min){
                min=marks[i];
                
            }
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("minimum marks is "+min);
        System.out.println("maximum marks is "+max);
        for(int i=0;i<num;i++){
            if(marks[i]==min){
                System.out.println("minimum marks student name is "+array[i]);
            }
            if(marks[i]==max){
                System.out.println("maximum marks student name is "+array[i]);


            }
       
        }
   
    }

           
                        
}
        

    


        






