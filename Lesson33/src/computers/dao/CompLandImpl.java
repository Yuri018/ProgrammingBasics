package computers.dao;

import computers.model.Computer;

import java.util.function.Predicate;

public class CompLandImpl implements CompLand {
    Computer[] computers;
    int size;

    public CompLandImpl(int capacity) {
        computers = new Computer[capacity];
    }

    @Override
    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputerByDeviceCode(computer.getDeviceCode()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    @Override
    public Computer removeComputer(long deviceCode) {
        return null;
    }

    @Override
    public Computer findComputerByDeviceCode(long deviceCode) {

        for (int i = 0; i < size; i++) {
            if (computers[i].getDeviceCode() == deviceCode) {
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public Computer[] findComputerByModel(String model) {
        Predicate<Computer> predicate = computer -> computer.getModel().equals(model);
        return findComputerByPredicate(predicate);
    }

    private Computer[] findComputerByPredicate(Predicate<Computer> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(computers[i])) {
                count++;
            }
        }
        Computer[] result = new Computer[count];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (predicate.test(computers[i])) {
                result[j++] = computers[i];
            }
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }
}
