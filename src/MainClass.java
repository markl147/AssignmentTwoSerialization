import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Create global ArrayList
        ArrayList<Phone> phones = new ArrayList<>();
        //Create objects
        Phone ph1 = new Phone("Sony", "Xperia X", 32, 12.5, 4.6, true, 150);
        Phone ph2 = new Phone("Sony", "Xperia Z", 64, 14.2, 5.6, true, 175);
        Phone ph3 = new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, true, 180);
        Phone ph4 = new Phone("Nokia", "3330", 16, 13.2, 2.3, false, 90);
        Phone ph5 = new Phone("Motorola", "M1", 8, 11.3, 4.9, true, 100);
        Phone ph6 = new Phone("iPhone", "6", 32, 13.5, 6.4, true, 250);
        Phone ph7 = new Phone("Alcatel", "A3", 8, 9.3, 2.4, false, 50);
        //Create GUI Object
        GUI gui = new GUI();
        //Serialize
        try {
            //Create list and add all phone objects to it
            ArrayList<Phone> phonez = new ArrayList<>();
            phonez.add(ph1);
            phonez.add(ph2);
            phonez.add(ph3);
            phonez.add(ph4);
            phonez.add(ph5);
            phonez.add(ph6);
            phonez.add(ph7);

            //Create serialization file and write the arraylist to it
            FileOutputStream fileOut = new FileOutputStream("phone.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(phonez);
            objectOut.close();

            System.out.println("File serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Deserialize
        try {
            //Take in the serialized file and deserialize it
            FileInputStream fileIn = new FileInputStream("phone.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            //Read in the old array list to the new array list
            phones = (ArrayList) objectIn.readObject();
            objectIn.close();

            System.out.println("File deserialized");

            //remove the alcatel by removing the object at index number 6
            phones.remove(6);
            System.out.println("Alcatel removed");

            //add a new phone
            phones.add(new Phone("OnePlus", "8T", 128, 53.6, 6.1, true, 650));
            System.out.println("Oneplus added");

            System.out.printf("\n%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", "Make", "Model", "Memory GB", "Camera MP", "Screen Size Inches", "Smart", "Price EUR");

            System.out.println("-------------------------------------------------------------------------------------------------------");

            for (Phone phone : phones) {
                String make = phone.getMake();
                String model = phone.getModel();
                int memory = phone.getMemoryGB();
                double mp = phone.getCameraMP();
                double screen = phone.getScreenSizeInches();
                boolean smart = phone.isSmart();
                int price = phone.getPriceEUR();

                System.out.printf("\n%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", make, model, memory, mp, screen, smart, price);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Create another Arraylist and let it equal to the deserialized one
        ArrayList<Phone> finalPhones = phones;
        //add an action listener to the button in the gui
        gui.b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //clears the textbox
                gui.display.setText("");
                //for loop to cycle through array
                for (Phone phone : finalPhones) {
                    //puts a space between each object in the text box
                    if(gui.display.getText().length() != 0)
                    {
                        gui.display.append("\n");
                    }
                    //using the toString to display the onjects
                    gui.display.append(phone.toString());
                }
            }
        });

        //clears the text box
        gui.b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.display.setText("");
            }
        });
    }
}
