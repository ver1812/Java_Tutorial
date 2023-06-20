package com.example;

class Employee{
    private int eid;
    private String ename;
    private double salary;

    public Employee(){ }

    public Employee(int eid, String ename, double salary){
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
    public double getEsalary(){
        return salary;
    }
    public void setEid(int eid){
        this.eid = eid;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    public void setEsalary(double salary){
        this.salary = salary;
    }
}