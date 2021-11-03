import java.io.*;
import java.util.ArrayList;

public class MainClass {



    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Phone ph1 = new Phone("Sony", "Xperia X", 32, 12.5,4.6, true, 150);
        Phone ph2 = new Phone("Sony", "Xperia Z", 64, 14.2,5.6, true, 175);
        Phone ph3 = new Phone("Samsung", "Galaxy M", 64, 14.5,5.4, true, 180);
        Phone ph4 = new Phone("Nokia", "3330", 16, 13.2,2.3, false, 90);
        Phone ph5 = new Phone("Motorola", "M1", 8, 11.3,4.9, true, 100);
        Phone ph6 = new Phone("iPhone", "6", 32, 13.5,6.4, true, 250);
        Phone ph7 = new Phone("Alcatel", "A3", 8, 9.3,2.4, false, 50);

        //Serialize
        try{
            ArrayList<Phone> phonez = new ArrayList<>();
            phonez.add(ph1);
            phonez.add(ph2);
            phonez.add(ph3);
            phonez.add(ph4);
            phonez.add(ph5);
            phonez.add(ph6);
            phonez.add(ph7);
            phonez.add(new Phone("OnePlus", "8T", 128, 53.6, 6.1, true, 650));

            FileOutputStream fileOut = new FileOutputStream("phone.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//            objectOut.writeObject(ph1);
//            objectOut.writeObject(ph2);
//            objectOut.writeObject(ph3);
//            objectOut.writeObject(ph4);
//            objectOut.writeObject(ph5);
//            objectOut.writeObject(ph6);
//            objectOut.writeObject(ph7);
//            objectOut.writeObject(new Phone("OnePlus", "8T", 128, 53.6, 6.1, true, 650));
            objectOut.writeObject(phonez);
            objectOut.close();
            System.out.println("File serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Deserialize
        try {

//            Phone phone = new Phone();

            FileInputStream fileIn = new FileInputStream("phone.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//            Phone newPhone = (Phone) objectIn.readObject();
//            Phone newPhone2 = (Phone) objectIn.readObject();
//            Phone newPhone3 = (Phone) objectIn.readObject();
//            Phone newPhone4 = (Phone) objectIn.readObject();
//            Phone newPhone5 = (Phone) objectIn.readObject();
//            Phone newPhone6 = (Phone) objectIn.readObject();
//            Phone newPhone7 = (Phone) objectIn.readObject();
//            Phone newPhone8 = (Phone) objectIn.readObject();
            ArrayList<Phone> phones = (ArrayList) objectIn.readObject();
            objectIn.close();

            System.out.println("File deserialized");

            phones.remove(6);
            //phones.add(new Phone("OnePlus", "8T", 128, 53.6, 6.1, true, 650));

            System.out.printf("\n%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", "Make", "Model", "Memory GB", "Camera MP", "Screen Size Inches", "Smart", "Price EUR");

            System.out.println("-------------------------------------------------------------------------------------------------------");

//            Phone phone = new Phone();

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
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone.getMake(), newPhone.getModel(), newPhone.getMemoryGB(),
//                    newPhone.getCameraMP(), newPhone.getScreenSizeInches(), newPhone.isSmart(), newPhone.getPriceEUR());
//
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone2.getMake(), newPhone2.getModel(), newPhone2.getMemoryGB(),
//                    newPhone2.getCameraMP(), newPhone2.getScreenSizeInches(), newPhone2.isSmart(), newPhone2.getPriceEUR());
//
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone3.getMake(), newPhone3.getModel(), newPhone3.getMemoryGB(),
//                    newPhone3.getCameraMP(), newPhone3.getScreenSizeInches(), newPhone3.isSmart(), newPhone3.getPriceEUR());
//
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone4.getMake(), newPhone4.getModel(), newPhone4.getMemoryGB(),
//                    newPhone4.getCameraMP(), newPhone4.getScreenSizeInches(), newPhone4.isSmart(), newPhone4.getPriceEUR());
//
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone5.getMake(), newPhone5.getModel(), newPhone5.getMemoryGB(),
//                    newPhone5.getCameraMP(), newPhone5.getScreenSizeInches(), newPhone5.isSmart(), newPhone5.getPriceEUR());
//
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone6.getMake(), newPhone6.getModel(), newPhone6.getMemoryGB(),
//                    newPhone6.getCameraMP(), newPhone6.getScreenSizeInches(), newPhone6.isSmart(), newPhone6.getPriceEUR());
//
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone7.getMake(), newPhone7.getModel(), newPhone7.getMemoryGB(),
//                    newPhone7.getCameraMP(), newPhone7.getScreenSizeInches(), newPhone7.isSmart(), newPhone7.getPriceEUR());
//
//            System.out.printf("%-10s %-13s %-15s %-15s %-25s %-10s %-10s\n", newPhone8.getMake(), newPhone8.getModel(), newPhone8.getMemoryGB(),
//                    newPhone8.getCameraMP(), newPhone8.getScreenSizeInches(), newPhone8.isSmart(), newPhone8.getPriceEUR());

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
