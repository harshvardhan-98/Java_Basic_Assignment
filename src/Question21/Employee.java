package Question21;
import java.util.*;

class employee {

    private String Id;
    private String Name;
    private String Destination;


    public employee (String Id, String Name, String Destination ) {
        this.Id = Id;
        this.Name = Name;
        this.Destination = Destination;
    }

    public String toString()
    {
        return this.Id+"\t"+this.Name+"\t\t"+this.Destination+"\t\t\t";
    }



    public static  void main(String[] args)
    {

        try {

            Map< String, List<employee>> m= new HashMap<>();
            List<employee> ListForFinance= new ArrayList<>();
            Scanner scn1=new Scanner(System.in);
            String Id;
            String Name;
            String Destination;


            while(true)
            {
                System.out.print("\nThe Choices:\n1. Add\n2. Remove\n3. Display\n\n");
                System.out.println("Enter the choice: ");
                System.out.println("To quit type -1");
                int num=scn1.nextInt();
                if(num == -1)
                {
                    break;
                }

                switch(num)
                {
                    case 1:
                    {
                        System.out.print("\nDestination: ");
                        Destination=scn1.next();
                        System.out.print("\nId: ");
                        Id=scn1.next();
                        System.out.print("\nName: ");
                        Name=scn1.next();

                        employee employee1 = new employee(Id,Name,Destination);
                        ListForFinance.add(employee1);
                        m.put(Destination, ListForFinance);
                        break;
                    }

                    case 2:
                    {
                        System.out.println("Type Destination to be modified");
                        Destination=scn1.next();
                        System.out.println("Modification values");
                        System.out.print("\nId: ");
                        Id=scn1.next();
                        System.out.print("\nName: ");
                        Name=scn1.next();

                        Set<String> s=m.keySet();
                        Iterator<String> i=s.iterator();

                        employee employee1=new employee(Id,Name, Destination);

                        // m.get(Destination.setId("ID");
                        ListForFinance.add(employee1);
                        m.put(Destination, ListForFinance);

                        while(i.hasNext())
                        {
                            System.out.println(i.next());
                        }

                        break;
                    }



                    case 3:
                    {
                        System.out.println("=========================================================");
                        System.out.println("ID"+"\t"+"NAME"+"\t\t"+"DESTINATION");
                        System.out.println("=========================================================");
                        Set<String> s=m.keySet();

                        for (String dept : s) {
                            List<employee> employees = m.get(dept);
                            for (Question21.employee employee : employees) {
                                System.out.print("\n" + employee + "\n\n");
                            }
                        }
                        break;
                    }

                }
            }
        }

        catch(Exception e) {
            System.out.println("NOTE: \n" + "Please enter specified key format..!!!");
            System.out.println("======================================");
            System.out.println("Now you are Signing out");
            System.out.println("Thank You,Login Again");
            System.out.println("======================================");

        }

//           default:

        System.out.println("=============================================================");
        System.out.println("Now Exiting... \n");
        System.out.println("Bye...!!!");
        System.out.println("=============================================================");
    }
}
