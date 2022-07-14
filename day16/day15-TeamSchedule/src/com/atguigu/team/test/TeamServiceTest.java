package com.atguigu.team.test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;
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
