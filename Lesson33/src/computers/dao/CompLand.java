package computers.dao;

import computers.model.Computer;

public interface CompLand {
    boolean addComputer(Computer computer);
    Computer removeComputer(long deviceCode);
    Computer findComputerByDeviceCode(long deviceCode);
    Computer[] findComputerByModel(String model);
    int size();
}
