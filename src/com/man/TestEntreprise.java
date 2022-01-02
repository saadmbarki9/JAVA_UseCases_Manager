package com.man;

import java.util.ArrayList;

public class TestEntreprise {

    public static void main(String[] args) throws ManagerException {
	// write your code here
        Employee e_youssef=new Employee("Youssef","A",11000,30,3000,100,null);
        Employee e_mohammed=new Employee("Mohammed","A",10000,200,3000,100,null);
        Employee e_mouna=new Employee("Mouna","A",11000,100,3000,100,null);

        Manager m_ahmed;
        Manager m_imane;
        try {
            //creation du manager Ahmed+l'ajout des emplyes au liste des emplyee
            m_ahmed = new Manager("Ahmed","B",18000,3000,new ArrayList<Employee>());
            m_ahmed.addEmployee(e_youssef);
            m_ahmed.addEmployee(e_mouna);
            e_youssef.setManager(m_ahmed);
            e_mouna.setManager(m_ahmed);
            for (Employee i:m_ahmed.getEmployees()){
                System.out.println(i.getFirstName());
            }

            //worst emplyee de ahmed
            System.out.print("Worst emplyee:");
           for (Employee e :m_ahmed.worstEmployee()){
               System.out.println(e.getFirstName());
           }
           //Best emplyee de Ahmed
            System.out.print("Best employe :");
            m_ahmed.bestEmplyee().getFirstName();
        } catch (ManagerException e) {
            e.printStackTrace();
        }

        try {
            // creation de manger imane+l'ajouts des emplyes au liste des employee
            m_imane = new Manager("Imane","A",15000,5000,new ArrayList<Employee>());
            m_imane.addEmployee(e_mohammed);
            e_mohammed.setManager(m_imane);

        }catch (ManagerException e){
            e.printStackTrace();
        }

    }
}
