package com.man;

public class Employee extends Person implements Comparable {
    private int performance, perfBonus, objective;
    private Manager manager;


    public Employee(String firstName, String lastName, float baseSalary, int performance, int perfBonus, int objective, Manager manager) {
        super(firstName, lastName, baseSalary);
        this.performance = performance;
        this.perfBonus = perfBonus;
        this.objective = objective;
        this.manager = manager;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getPerfBonus() {
        return perfBonus;
    }

    public void setPerfBonus(int perfBonus) {
        this.perfBonus = perfBonus;
    }

    public int getObjective() {
        return objective;
    }

    public void setObjective(int objective) {
        this.objective = objective;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public int isBetterthan(Employee a) {
        if (this.getPerformance()<a.getPerformance()){
            return -1;
        }if (this.getPerformance()==a.getPerformance()){
            return 0;
        }else {
            return 1;
        }

    }
}
