package callsprocessor.model;

public class CallRegister {
    public String serviceNumber;
    public String billType;
    public String callType;
    public String originNumber;
    public String companyDestination;
    public Date startDateTime;
    public Date endDateTime;

    /**
     * 
     * @param serviceNumber
     * @param billType
     * @param callType
     * @param originNumber
     * @param companyDestination
     * @param startDateTime
     * @param endDateTime
     */
    public CallRegister(final String serviceNumber, final String billType, final String callType,
            final String originNumber, final String companyDestination, final Date startDateTime,
            final Date endDateTime) {
        
        this.serviceNumber = serviceNumber;
        this.billType = billType;
        this.callType = callType;
        this.originNumber = originNumber;
        this.companyDestination = companyDestination;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime; 
    } 
}