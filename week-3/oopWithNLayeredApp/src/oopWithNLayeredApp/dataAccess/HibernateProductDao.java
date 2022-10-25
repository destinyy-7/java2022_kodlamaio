package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public  void Add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("Hibernatre ile veri tabanına eklendi");
    }

    @Override
    public void add(Product product) {

    }
}
