package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * Created on 31.03.2016
 */
/*
import logic.organization.Department;
import logic.ManagementSystem;
import logic.organization.Person;
import servlet.forms.MainFrameForm;
import servlet.forms.PersonForm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;*/

@WebServlet("/main")
public class MainFrameServlet extends HttpServlet
{
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // ��������� ��������� ��� �������� ����������
        req.setCharacterEncoding("UTF-8");
       /* if(req.getParameter("Add") != null){
            try {
                Person p = new Person();
                java.util.Date date = new java.util.Date();
                date.setTime(100000);
                p.setBirthDay(new java.sql.Date(date.getTime()));
                Collection departments = ManagementSystem.getInstance().getDepartments();
                PersonForm pForm = new PersonForm();
                pForm.initFromPerson(p);
                pForm.setDepartments(departments);
                req.setAttribute("person", pForm);
                getServletContext().getRequestDispatcher("/PersonFrame.jsp").forward(req, resp);
                return;
            } catch (SQLException sql_e) {
                throw new IOException(sql_e.getMessage());
            }catch (Exception e){
                e.printStackTrace();
            }

        }*/

      /*  // if (answer == 2) {
        if(req.getParameter("Edit") != null){
            // ��� ���� ������� ����� ������ �����, ������� ������������ �������
            // �� ������ JSP ��� ����� ������ � ��������
            try {
                if (req.getParameter("personId") != null) {
                    int pId = Integer.parseInt(req.getParameter("personId"));
                    Person p = ManagementSystem.getInstance().getPersonById(pId);
                    Collection departments = ManagementSystem.getInstance().getDepartments();
                    PersonForm pForm = new PersonForm();
                    pForm.initFromPerson(p);
                    pForm.setDepartments(departments);
                    req.setAttribute("person", pForm);
                    getServletContext().getRequestDispatcher("/PersonFrame.jsp").forward(req, resp);
                    return;
                }
            } catch (SQLException sql_e) {
                throw new IOException(sql_e.getMessage());
            } catch (Exception e){
                e.printStackTrace();
            }
        }*/
        String d = req.getParameter("departmentId");
        String nd = req.getParameter("nameDepartment");
        String chd = req.getParameter("chief");
        String apdp = req.getParameter("amount_people");
        String y = req.getParameter("year");

        //if (answer == 3) {
        /*if(req.getParameter("MoveGroup") != null){
            if (req.getParameter("personId") != null){
                String newDep = req.getParameter("newDepartmentId");
                String[] s = req.getParameterValues("personId");
                Department dep,dep2;

                for (int i = 0; i < s.length; i++) {
                    try {
                        dep = new Department();
                        dep.setDepartmentId(Integer.parseInt(d));
                        dep2 = new Department();
                        dep2.setDepartmentId(Integer.parseInt(newDep));
                        ManagementSystem.getInstance().movePersonsToDepartment(dep,dep2,Integer.parseInt(s[i]));

                    } catch (SQLException sql_e) {
                        throw new IOException(sql_e.getMessage());
                    }catch (Exception e){
                        e.printStackTrace();
                    }}}
        }

        if(req.getParameter("Delete") != null) {
            if (req.getParameter("personId") != null) {
                String[] s = req.getParameterValues("personId");
                Person p;
                for (int i = 0; i < s.length; i++) {
                    p = new Person();
                    p.setPersonId(Integer.parseInt(s[i]));
                    try {
                        ManagementSystem.getInstance().deletePerson(p);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        int departmentId = -1;
        if (d != null) {
            departmentId = Integer.parseInt(d);
        }
        String year = "";
        if (y != null) {
            year = y;
        }
        MainFrameForm form = new MainFrameForm();
        Department dep = null;
        try {
            Collection departments = ManagementSystem.getInstance().getDepartments();
            dep = new Department();
            dep.setDepartmentId(departmentId);
            if (departmentId == -1) {
                Iterator i = departments.iterator();
                dep = (Department) i.next();
            }
            Collection persons = ManagementSystem.getInstance().getPersonsFromDepartment(dep);
            form.setDepartmentId(dep.getDepartmentId());
            form.setNameDepartment(dep.getNameDepartment());
            form.setChief(dep.getChief());
            form.setAmount_people(dep.getAmount_people());
            form.setDepartments(departments);
            form.setPersons(persons);

        } catch (SQLException sql_e) {
            throw new IOException(sql_e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }

        req.setAttribute("form", form);
        getServletContext().getRequestDispatcher("/MainFrame.jsp").forward(req, resp);*/
    }

    // ������������� ����������� ������
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

}
