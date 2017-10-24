package Assignment;

import java.io.IOException;

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

        System.out.println("New InstantNoodle: id("+id+"),name("+name+"),balance("+balance+"),weight:("+weight+")");
        return new InstantNoodle(name, id , balance , weight);
    }
}
