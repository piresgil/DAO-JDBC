/**
 * @author Daniel Gil
 */
package main.java.application.model.dao;

import main.java.application.db.DB;
import main.java.application.model.dao.impl.DepartmentDaoJDBC;
import main.java.application.model.dao.impl.SellerDaoJDBC;

/**
 * Class DAO Factory
 * Class responsável por criar ligações de modelo DAO
 */
public class DaoFactory {

    /**
     * Method Create Seller DAO
     * cria conexão do Seller há DB
     *
     * @return Conexão do Seller há DB
     */
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    /**
     * Method Create Department DAO
     * cria conexão do Department há DB
     *
     * @return Conexão do Department há DB
     */
    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
