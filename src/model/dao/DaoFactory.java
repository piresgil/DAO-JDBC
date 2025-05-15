/**
 * @author Daniel Gil
 */
package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

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
