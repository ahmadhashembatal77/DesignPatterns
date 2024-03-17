package javaD.prototype;

public abstract class EmployeePrototypeJ implements Cloneable {

    public int Id;

    public String Name;

    public AddressJ EmpAddress;
    public abstract EmployeePrototypeJ shallowCopy();
    public abstract EmployeePrototypeJ DeepCopy();

    public int getId() {
        return Id;
    }

    public AddressJ getEmpAddress() {
        return EmpAddress;
    }

    public void setEmpAddress(AddressJ empAddress) {
        EmpAddress = empAddress;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "EmployeePrototypeJ{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", EmpAddress=" + EmpAddress +
                '}';
    }


    @Override
    public EmployeePrototypeJ clone() {
        try {
            return (EmployeePrototypeJ) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}