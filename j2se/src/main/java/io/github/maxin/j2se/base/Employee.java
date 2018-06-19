package io.github.maxin.j2se.base;

public class Employee {
    //这个实例变量对子类可见
    public String name;
    int age;
    String designation;
    //静态的私有变量，仅在该类可见
    private static double salary;

    //DEPARTMENT是一个常量
    public static final String DEPARTMENT="开发人员";

    //Employee 类的构造器
    //在构造器中对name赋值
    public Employee(String empName){
        name=empName;
    }

    //设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }

    /*设置designation的值*/
    public void empDesignation(String empDesig){
        designation=empDesig;
    }

    /*设置salary的值*/
    public void empSalary(double empSalary){
        salary=empSalary;
    }

    /*打印信息*/
    public void printEmployee(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("职位："+designation);
        System.out.println("薪水："+salary);
    }

    public static void main(String[] args){
        Employee empOne=new Employee("RUNOOB");
        empOne.empSalary(1000);
        empOne.printEmployee();
        System.out.println(DEPARTMENT+"平均工资:"+salary);
    }
}
