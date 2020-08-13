package main.java.callsprocessor.mapper;

import java.util.ArrayList;
import java.util.List;
import main.java.callsprocessor.model.CallRegister;
import callsprocessor.*;

public class CallRegisterMapper {
    private final CallsFileReader reader;
    
    public CallRegisterMapper(final CallsFileReader reader) {
        this.reader = reader;
    }

    public List<CallRegister> toModelList() {
        List<CallRegister> callRegisters = new ArrayList<>();
        List<String> lines = reader.readAllLines();

        for (String line: lines) {
            String[] lineParts = line.split(",");
            String serviceNumber = lineParts[0];
            System.out.println("serviceNumber " + serviceNumber);
            // WIP: Extract informaction from each line of file..
            //callRegister.add(new CallRegister());
        } 

        return callRegisters;
    }
}