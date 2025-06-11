/**
 * @author Daniel Gil
 */
package main.java.application.model.dao;

import java.util.List;

import main.java.application.model.entities.Department;
import main.java.application.model.entities.Seller;

/**
 * Interface Seller DAO
 */
public interface SellerDao {

    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();

    List<Seller> findByDepartment(Department department);
}
