package javaD.prototype;


public class PrototypeMain {
    public static void main(String[] args)  {
        EmployeePrototypeJ temp = new TempEmployJ();
        temp.Name = "Temp Employ 1";
        temp.Id = 1;
        temp.EmpAddress = new AddressJ("Haj Habib","Sulimania","Aleppo");
        // test shallow copy just put shallowCopy() function.
        EmployeePrototypeJ temp2 = temp.DeepCopy();
        System.out.println("------------- temp1 ---------------");
        System.out.println(temp);
        System.out.println("------------- temp2 ---------------");
        System.out.println(temp2.toString());
        temp2.EmpAddress.setCity("new City");
        System.out.println("------------- temp1 1 ---------------");
        System.out.println(temp);

        System.out.println("------------- temp2 1---------------");
        System.out.println(temp2);
    }
}