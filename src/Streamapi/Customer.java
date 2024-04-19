package Streamapi;

public class Customer {
    private Integer cusId;
    private String cusName;
    private Integer deptId;
    private String status="active";
    private Integer salary;

    public Customer(Integer cusId, String cusName,Integer salary) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.salary = salary;
    }

    public Customer(Integer cusId, String cusName, Integer deptId, String status, Integer salary) {
        super();
        this.cusId = cusId;
        this.cusName = cusName;
        this.deptId = deptId;
        this.status = status;
        this.salary = salary;
    }



    public int getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Customer[cusId="+cusId+",cusName="+cusName+",deptId="+deptId+",status="+status+",salary="+salary+"]";
    }


}


