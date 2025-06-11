/**
 * @author Daniel Gil
 */
package main.java.application.model.dao;

import java.util.List;

import main.java.application.model.entities.Department;

/**
 * Interface Department DAO
 */
public interface DepartmentDao {

    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();
}
