/**
 * @author Daniel Gil
 */

package main.java.application;

import main.java.application.db.DB;
import main.java.application.model.dao.DaoFactory;
import main.java.application.model.dao.DepartmentDao;
import main.java.application.model.dao.SellerDao;
import main.java.application.model.entities.Department;
import main.java.application.model.entities.Seller;

import java.util.List;

/**
 * Method Main
 * não esquecer de ativar o service do workbench no windows para iniciar o servidor do SQL (MySQL84)
 */

public class main {
    public static void main(String[] args) {

        System.out.println("*** Seller ***");
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n*** Department ***");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findAll =======");
        List<Department> listDepartment = departmentDao.findAll();
        for (Department d : listDepartment) {
            System.out.println(d);
        }

        DB.closeConnection();
    }

}
