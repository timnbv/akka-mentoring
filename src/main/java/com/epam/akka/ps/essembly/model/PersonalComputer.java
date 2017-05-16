package com.epam.akka.ps.essembly.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tim Ryzhov
 */

public class PersonalComputer {

    private  String cpu;
    private String gpu;
    private int ramModulesNum;
    private String cooler;
    private String motherBoard;
    private List<String> peripherals = new ArrayList<>();
    private String os;


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRamModulesNum() {
        return ramModulesNum;
    }

    public void setRamModulesNum(int ramModulesNum) {
        this.ramModulesNum = ramModulesNum;
    }

    public String getCooler() {
        return cooler;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public List<String> getPeripherals() {
        return peripherals;
    }

    public void addPeriheral(String peripheral) {
        peripherals.add(peripheral);
    }

    public void setPeripherals(List<String> peripherals) {
        this.peripherals = peripherals;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
