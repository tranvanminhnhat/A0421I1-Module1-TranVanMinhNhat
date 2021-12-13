package com.codegym.service;

import com.codegym.model.ElectronicMailBox;

import java.util.List;
import java.util.Map;

public interface IElectronicMailBoxService {
    List<ElectronicMailBox> findAll();

    ElectronicMailBox findBySignature(String signature);

    void save(ElectronicMailBox electronicMailBox);
}
