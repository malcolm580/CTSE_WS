package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InstantNoodleCreateCommand extends CreateCommand {


    @Override
    public FoodItem factoryMethod( ) {

        System.out.println("Enter ItemID:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int id = Integer.parseInt(line);


        System.out.println("Enter name:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String name = line;

        System.out.println("Enter balance:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int balance = Integer.parseInt(line);

        System.out.println("Enter Weight:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int weight = Integer.parseInt(line);

        System.out.println("New IstantNoodle: id("+id+"),name("+name+"),balance("+balance+"),weight:("+weight+")");
        return new IstantNoodle(name, id , balance , weight);
    }
}
