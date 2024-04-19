package Streamapi;

import java.util.Collections;

public class Employee {
    private Integer EId;
    private String name;
    private Double salary;

    public Employee() {}

    public Employee(Integer EId,String name,double salary){
        this.EId=EId;
        this.name=name;
        this.salary=salary;
    }

    public Integer getEId() {
        return EId;
    }

    public void setEId(Integer EId) {

        this.EId = EId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String toString(){

        return "Employee[EId="+EId+",name="+name+",salary="+salary+"]";
    }

}
