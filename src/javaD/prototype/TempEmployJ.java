package javaD.prototype;

public class TempEmployJ extends EmployeePrototypeJ{
    @Override
    public EmployeePrototypeJ shallowCopy()  {return this.clone();}
    @Override
    public EmployeePrototypeJ DeepCopy(){
        TempEmployJ emp = new TempEmployJ();
        emp = (TempEmployJ) this.clone();
        AddressJ address = new AddressJ(
                this.EmpAddress.getBuilding(),
                this.EmpAddress.getStreetName(),
                this.EmpAddress.getCity()
        );
        emp.setEmpAddress(address);
        emp.setName(this.Name);
        return emp;
    }
}
