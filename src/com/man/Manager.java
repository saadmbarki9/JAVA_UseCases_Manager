package com.man;

import java.util.ArrayList;

public class Manager extends Person  {
    private int respBonus;
    private ArrayList<Employee> employees;


    public Manager(String firstName, String lastName, float baseSalary, int respBonus, ArrayList<Employee> employees) throws ManagerException {
        super(firstName, lastName, baseSalary);
        if (respBonus < 0.1 *baseSalary) {
            throw new ManagerException();
        } else {
            this.respBonus = respBonus;
            this.employees = employees;
        }
    }

    public int getRespBonus() {
        return respBonus;
    }

    public void setRespBonus(int respBonus) throws ManagerException {
        if (respBonus < 0.1 * this.getBaseSalary()) {
            throw new ManagerException();
        } else {
            this.respBonus = respBonus;

        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Employee bestEmplyee() {
        int maxx = 0;
        Employee besttEmployee = null;
        for (Employee i : this.employees) {
            if (i.getPerformance() > maxx) {
                maxx = i.getPerformance();
                besttEmployee = i;
            }
        }
        return besttEmployee;
    }

    public ArrayList<Employee> worstEmployee() {
        ArrayList<Employee> worstt = new ArrayList<Employee>();
        for (Employee i : this.employees) {
            if (i.getPerformance() < i.getObjective()) {
                worstt.add(i);
            }
        }
        return worstt;
    }


    public void addEmployee(Employee a) {
        this.employees.add(a);

    }

    public void displayEmployees() {
        for (Employee i : this.employees) {
            System.out.println(i.getFirstName());
        }
    }
}
