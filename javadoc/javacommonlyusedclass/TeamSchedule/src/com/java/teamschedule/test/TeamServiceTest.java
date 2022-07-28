package com.java.teamschedule.test;

import com.java.teamschedule.domain.Employee;
import com.java.teamschedule.service.NameListService;
import com.java.teamschedule.service.TeamException;
import com.java.teamschedule.service.TeamService;
import org.junit.Test;

public class TeamServiceTest {

    public TeamService ts = new TeamService();
    public NameListService nls = new NameListService();

    @Test
    public void testAddMember(){
        try {
            Employee e = nls.getEmployee(2);
            ts.addMember(e);
            System.out.println("添加成功！");
        } catch (TeamException ex) {
            System.out.println("添加失败，原因：" + ex.getMessage());
        }

    }
}
