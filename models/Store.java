package models;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class Store {
    private String name;
    private Integer id_store;
    private List<Client> banned_clients;
    private Map<Product, Integer> available_products;
    private Storage storage;


    //constructors
    
    


    public Store() {
        this.name = "Nothing";
        this.id_store = 0;
        this.banned_clients = new ArrayList<Client>();
        this.available_products=new HashMap<Product, Integer>();
        this.storage = new Storage();
    }

    public Store(String name, Integer id_store, List<Client> banned_customers, Map<Product, Integer> available_products, Storage storage) {
        this.name = name;
        this.id_store = id_store;
        this.banned_clients = banned_customers;
        this.available_products=available_products;
        this.storage = storage;
    }

    public Store(String name, Integer id_store, Map<Product, Integer> available_products) {
        this.name = name;
        this.id_store = id_store;
        this.banned_clients = new ArrayList<Client>();
        this.available_products=available_products;
        this.storage = new Storage();
    }

    public Store(String name, Integer id_store) {
        this.name = name;
        this.id_store = id_store;
        this.banned_clients = new ArrayList<Client>();
        this.available_products=new HashMap<Product, Integer>();
        this.storage = new Storage();
    }
    
    //getters setters

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Integer getId_store() {

        return this.id_store;
    }



    public Storage getStorage() {
        return this.storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }


    public void setId_store(Integer id_store) {
        this.id_store = id_store;
    }
    public List<Client> getBanned_clients() {
        return this.banned_clients;
    }

    public void setBanned_clients(List<Client> banned_clients) {
        this.banned_clients = banned_clients;
    }

    public Map<Product,Integer> getAvailable_products() {
        return this.available_products;
    }

    public void setAvailable_products(Map<Product,Integer> available_products) {
        this.available_products = available_products;
    }
        

    

    

    @Override
    public String toString() {
        return "Store{" +
            " name='" + getName() + "'" +
            ", id_store='" + getId_store() + "'" +
            ", banned_clients='" + getBanned_clients() + "'" +
            ", available_products='" + getAvailable_products() + "'" +
            ", storage='" + getStorage() + "'" +
            "}";
    }


    
}
