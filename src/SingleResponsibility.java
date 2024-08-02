public class SingleResponsibility {}


class Employee{
    String name;
    String Company;
    String position;

    public Employee(){}

    public Employee(String name, String company, String position) {
        this.name = name;
        Company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



}
class virmentsalaire{
    public int calculateSalary() {
        return 2000;
    }
}

class employeeRepository{
    public void saveEmployee(){

    }


}