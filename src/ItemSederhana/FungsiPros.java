package ItemSederhana;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FungsiPros {
    static ArrayList<String> listItems = new ArrayList<>();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /*Show Menu*/
    static void showMenu() throws IOException{
        System.out.println("=========MENU========");
        System.out.println("[1] Show all items");
        System.out.println("[2] Insert item");
        System.out.println("[3] Edit item");
        System.out.println("[4] Delete item");
        System.out.println("[5] Exit");
        System.out.println("Choose Menu");

        int selectedMenu = Integer.parseInt(input.readLine());

        switch (selectedMenu) {
            case 1 -> showAllItems();
            case 2 -> insertItem();
            case 3 -> editItem();
            case 4 -> deleteItem();
            case 5 -> System.exit(0);
            default -> System.out.println("Pilihan anda tidak tersedia!");
        }
    }

    static void showAllItems(){
        if(listItems.isEmpty()){
            System.out.println("Data kosong!");
        } else {
            for(int i = 0; i < listItems.size(); i++){
                System.out.printf("[%d] %s%n", i, listItems.get(i));
            }
        }
    }

    static void insertItem() throws IOException{
        System.out.println("Nama item: ");
        String namaItem = input.readLine();
        listItems.add(namaItem);
    }

    static void editItem() throws IOException{
        System.out.println("Pilih nomor item: ");
        int indexItem = Integer.parseInt(input.readLine());

        System.out.println("Nama baru: ");
        String namaBaru = input.readLine();

        listItems.set(indexItem, namaBaru);
    }

    static void deleteItem() throws IOException{
        System.out.print("Pilih nomor item: ");
        int indexItem = Integer.parseInt(input.readLine());

        listItems.remove(indexItem);
    }
}
