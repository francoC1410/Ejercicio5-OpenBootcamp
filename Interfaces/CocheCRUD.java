package Interfaces;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDImpl cocheCRUDImpl);

    List<CocheCRUD> findAll();

    void delete(CocheCRUDImpl cocheCRUDImpl);
}
