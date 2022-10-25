public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delobghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImgUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImgUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImgUrl("image3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }
        IndividualCustomer individualCustomer =new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222277777");
        individualCustomer.setCustomerNumber("");
        individualCustomer.setFirstName("Engin ");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("Kodlama.io");
        corporateCustomer.setPhone("053333344444");
        corporateCustomer.setCompanyName("1111111111111");
        corporateCustomer.setTaxNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}
