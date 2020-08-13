package main.java.callsprocessor.model;

public class CallRegister {
    public String serviceNumber;
    public String billType;
    public String callType;
    public String originNumber;
    public String companyDestination;
    public String startDateTime;
    public String endDateTime;

    /**
     * This is a constructor;
     * @param serviceNumber
     * @param billType
     * @param callType
     * @param originNumber
     * @param companyDestination
     * @param startDateTime
     * @param endDateTime
     */
    public CallRegister(final String serviceNumber, final String billType, final String callType,
            final String originNumber, final String companyDestination, final String startDateTime,
            final String endDateTime) {
        
        this.serviceNumber = serviceNumber;
        this.billType = billType;
        this.callType = callType;
        this.originNumber = originNumber;
        this.companyDestination = companyDestination;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime; 
    } 
}