package com.atguigu.team.service;

import com.atguigu.team.domain.*;

import static com.atguigu.team.service.Data.*;

/**
* 管理公司所有员工
* @author Hefei Li
* 2020/6/12 15:22
*/
public class NameListService {

    private Employee[] employees;

    public NameListService(){
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < EMPLOYEES.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment = null;
            double bonus;
            int stock;

            switch(type){
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
                default:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
            }
        }
    }

    /**
     * 根据 Data 类的数据构建对应的 Equipment 对象
     * @param i
     * @return
     */
    public Equipment createEquipment(int i){
        Equipment equipment = null;

        int equType = Integer.parseInt(EQUIPMENTS[i][0]);

        switch(equType){
            case PC:
                equipment = new PC(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
                break;
            case NOTEBOOK:
                equipment = new NoteBook(EQUIPMENTS[i][1], Double.parseDouble(EQUIPMENTS[i][2]));
                break;
            case PRINTER:
                equipment = new Printer(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
                break;
        }

        return equipment;
    }

    /**
     * 获取公司所有员工信息
     * @return
     */
    public Employee[] getAllEmployees(){
        return employees;
    }

    /**
     * 根据员工 id 获取员工对象
     * @param id
     * @return
     * @throws TeamException
     */
    public Employee getEmployee(int id) throws TeamException{
        for (Employee employee : employees) {
            if(id == employee.getId()){
                return employee;
            }
        }

        throw new TeamException("找不到指定员工！");
    }
}
