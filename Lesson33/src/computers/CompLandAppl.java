package computers;

import computers.dao.CompLandImpl;
import computers.model.Computer;

import java.util.Arrays;
import java.util.Comparator;

public class CompLandAppl {
    public static void main(String[] args) {

        CompLandImpl compLand = new CompLandImpl(100);

        Computer[] computers = new Computer[5];

        computers[0] = new Computer(100_001, "Samsung", "Windows 10", 520);
        computers[1] = new Computer(200_002, "Lenovo", "Windows 11", 256);
        computers[2] = new Computer(300_003, "HP", "Windows 10", 1024);
        computers[3] = new Computer(400_004, "Lenovo", "Windows 11", 256);
        computers[4] = new Computer(500_005, "Macbook", "IOS", 1024);

        for (Computer computer : computers) {
            compLand.addComputer(computer);
        }
        System.out.println(compLand.size());
        System.out.println("======== Unsorted ============");
        printComp(computers);
        System.out.println("======== Sorted ============");
        Arrays.sort(computers);
        printComp(computers);


        Comparator<Computer> comparator = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return Integer.compare(o1.getDiskCapacity(),o2.getDiskCapacity());
            }
        };

        System.out.println("======== Sorted Comparator ============");
        Arrays.sort(computers, comparator);
        printComp(computers);

        System.out.println("======== Sorted Lambda ============");
        Arrays.sort(computers, (s1, s2) -> {
            return s1.getModel().compareTo(s2.getModel());
        });
        printComp(computers);

        System.out.println("======== Search Predicate ===========");
        Computer[] lenovo = compLand.findComputerByModel("Lenovo");
        printComp(lenovo);

    }

    public static void printComp(Computer[] computers){
        for (Computer computer : computers){
            System.out.println(computer);
        }
    }
}
