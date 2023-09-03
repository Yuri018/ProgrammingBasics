package computers.model;

import java.util.Objects;

public class Computer implements Comparable<Computer>{
    private long deviceCode;
    private String model;
    private String operatingSystem;
    private int diskCapacity;

    public Computer(long deviceCode, String model, String operatingSystem, int diskCapacity) {
        this.deviceCode = deviceCode;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.diskCapacity = diskCapacity;
    }

    public long getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(long deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(int diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    @Override
    public String toString() {
        return "Computer: " + "deviceCode = " + deviceCode + ", model = " +
                model + ", operatingSystem = " + operatingSystem + ", diskCapacity = " + diskCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return deviceCode == computer.deviceCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceCode);
    }

    @Override
    public int compareTo(Computer o) {
        int result = this.operatingSystem.compareTo(o.operatingSystem);
        return result != 0 ? result : Integer.compare(this.diskCapacity, o.diskCapacity);
    }
}
