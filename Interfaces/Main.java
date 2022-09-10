package Interfaces;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.save(new CocheCRUDImpl());
        cocheCRUD.findAll();
        cocheCRUD.delete(new CocheCRUDImpl());

    }


}
