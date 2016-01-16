package com.be.ictdynamic;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Test.
 *
 * @author Wim Van den Brande
 * @since 13/01/2016 - 18:36
 */
public class Test {
    public static void main(String[] args) {
        dummyJXLS();
    }

    static private void dummyJXLS() {
        InputStream is = null;

        try {
            is = new FileInputStream("c:\\temp\\jxls\\test1.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            OutputStream os = new FileOutputStream("c:\\temp\\jxls\\test2.xlsx");
            Context context = new Context();
            List<Employee> list = new ArrayList();
            Employee employee1 = new Employee("wim", "Edegem");
            Employee employee2 = new Employee("kris", "Niel");
            list.add(employee1);
            list.add(employee2);
            context.putVar("employees", list);
            JxlsHelper.getInstance().processTemplate(is, os, context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
