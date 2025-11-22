public class nestedif {
    public static void main(String[]args){
        int age=19;
        Boolean haslicense=True;
        if(age>=18)
        {
            if(haslicense==True)
            {
                System.out.println("car driver");
            }
            else{
                System.out.println("cannot Drive without license");
            }
        }
        else
        {
            System.out.println("too young");
        }
    }
}