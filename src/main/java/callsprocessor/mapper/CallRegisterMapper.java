package main.java.callsprocessor.mapper;

import callsprocessor.model;

public class CallRegisterMapper {
    private final CallsFileReader reader;
    
    public RegisterMapper(final CallsFileReader reader) {
        this.reader = reader;
    }

    public List<CallRegister> toModelList() {
        List<CallRegister> callRegisters = new ArrayList<>();
        List<String> lines = reader.readAllLines();

        for (String line: lines) {
            String[] lineParts = lines.split(',');
            String serviceNumber = lineParts[0];
            System.out.println("serviceNumber " + serviceNumber);
            // WIP: Extract informaction from each line of file..
            //callRegister.add(new CallRegister());
        } 

        return callRegisters;
    }
}