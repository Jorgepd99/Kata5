package kata5;

public class Kata5 {

    
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\J0RG3PD99\\Desktop\\Uni\\3º\\Primer semestre\\IS2\\proyec\\Kata5\\sqlite\\miercoles.db";
        DataBase database = new DataBase(url);
        database.open();

        database.select_PERSONAS();
        
        People people = new People("Santiago","Sanchez","Marketing");
        database.insert_PERSONAS(people);
 
        System.out.println(" * * * * * * * * *");
        
        database.select_PERSONAS();
        
        database.close();
    }
    
}
