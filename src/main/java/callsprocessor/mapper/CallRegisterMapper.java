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
            callRegisters.add(new CallRegister(lineParts[0], lineParts[1], lineParts[2], lineParts[3], 
            lineParts[4], lineParts[5], lineParts[6]));
        } 

        System.out.println("cantidad de registros " + callRegisters.size());
        return callRegisters;
    }
}