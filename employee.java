public class employee{
    private String name;
    private String jobTitle;
    private int salary;

    public employee(String inputName, String jobInput, int salaryInput){
        this.name = inputName;
        this.jobTitle = jobInput;
        this.salary = salaryInput;
        return;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getJob(){
        return jobTitle;
    }

    public void setJob(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}