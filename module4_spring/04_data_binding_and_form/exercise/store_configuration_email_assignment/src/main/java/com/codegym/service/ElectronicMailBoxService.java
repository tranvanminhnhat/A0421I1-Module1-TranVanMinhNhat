package com.codegym.service;

import com.codegym.model.ElectronicMailBox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectronicMailBoxService implements IElectronicMailBoxService{
    private static Map<String, ElectronicMailBox> electronicMailBoxes;

    static {
        electronicMailBoxes = new HashMap<>();
        electronicMailBoxes.put("MinhNhat", new ElectronicMailBox("Vietnamese", 10, true, "MinhNhat"));
        electronicMailBoxes.put("John", new ElectronicMailBox("English", 5, false, "John"));
        electronicMailBoxes.put("Buraham", new ElectronicMailBox("Laos", 15, true, "Buraham"));
    }

    @Override
    public List<ElectronicMailBox> findAll() {
        return new ArrayList<>(electronicMailBoxes.values());
    }

    @Override
    public ElectronicMailBox findBySignature(String signature) {
        return electronicMailBoxes.get(signature);
    }

    @Override
    public void save(ElectronicMailBox electronicMailBox) {
        electronicMailBoxes.put(electronicMailBox.getSignature(), electronicMailBox);
    }
}
