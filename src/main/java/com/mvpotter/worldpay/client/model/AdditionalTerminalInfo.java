package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class AdditionalTerminalInfo {

    /**
     * terminal identifier.
     */
    private String terminalId;

    /**
     * city where the terminal is located.
     */
    private String terminalCity;

    /**
     * state where the terminal is located.
     */
    private String terminalState;

    /**
     * 	additional terminal location information.
     */
    private String terminalLocation;

    /**
     * 	store number where the terminal is located.
     */
    private String storeNumber;

    /**
     * the serial number of the POS terminal used.
     */
    private String deviceSerialNumber;

    /**
     * Indicates the input capability of the terminal. Valid values for this parameter are:<br>
     * <br>
     * 0 - Contact <br>
     * 1 - Contactless <br>
     * 1 - Manual; no terminal<br>
     * 2 - Magnetic stripe reader capability<br>
     * 5 - Integrated circuit card (ICC) capability<br>
     * 6 - Key entry only capability<br>
     * A - PAN auto-entry via contactless magnetic stripe<br>
     * B - Magnetic stripe reader and key entry capability<br>
     * C - Magnetic stripe reader, ICC, and key entry capability<br>
     * D - Magnetic stripe reader and ICC capability<br>
     * E - ICC and key entry capability<br>
     * H - ICC Reader and Contactless Capability<br>
     * M - PAN auto-entry via contactless chip
     */
    private String POSTerminalInputCapabilityInd;

    /**
     * The version number of the kernel used to process the chip data in the transaction.
     */
    private String kernalVersionNo;

    /**
     * Value to indicate if the transaction originated from a cardholder activated terminal. Possible values are:<br>
     * <br>
     * 0 - Not a CAT Transaction <br>
     * 1 - ATM with PIN <br>
     * 2 - Self-service terminal<br>
     * 3 - Limited-amount terminal<br>
     * 4 - In-flight commerce<br>
     * 6 - Electronic commerce<br>
     * 7 - Transponder transaction
     */
    private Integer CATIndicator;

    /**
     * @return {@link #terminalId}
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * @param terminalId {@link #terminalId}
     */
    public void setTerminalId(final String terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * @return {@link #terminalCity}
     */
    public String getTerminalCity() {
        return terminalCity;
    }

    /**
     * @param terminalCity {@link #terminalCity}
     */
    public void setTerminalCity(final String terminalCity) {
        this.terminalCity = terminalCity;
    }

    /**
     * @return {@link #terminalState}
     */
    public String getTerminalState() {
        return terminalState;
    }

    /**
     * @param terminalState {@link #terminalState}
     */
    public void setTerminalState(final String terminalState) {
        this.terminalState = terminalState;
    }

    /**
     * @return {@link #terminalLocation}
     */
    public String getTerminalLocation() {
        return terminalLocation;
    }

    /**
     * @param terminalLocation {@link #terminalLocation}
     */
    public void setTerminalLocation(final String terminalLocation) {
        this.terminalLocation = terminalLocation;
    }

    /**
     * @return {@link #storeNumber}
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * @param storeNumber {@link #storeNumber}
     */
    public void setStoreNumber(final String storeNumber) {
        this.storeNumber = storeNumber;
    }

    /**
     * @return {@link #deviceSerialNumber}
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * @param deviceSerialNumber {@link #deviceSerialNumber}
     */
    public void setDeviceSerialNumber(final String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    /**
     * @return {@link #POSTerminalInputCapabilityInd}
     */
    public String getPOSTerminalInputCapabilityInd() {
        return POSTerminalInputCapabilityInd;
    }

    /**
     * @param POSTerminalInputCapabilityInd {@link #POSTerminalInputCapabilityInd}
     */
    public void setPOSTerminalInputCapabilityInd(final String POSTerminalInputCapabilityInd) {
        this.POSTerminalInputCapabilityInd = POSTerminalInputCapabilityInd;
    }

    /**
     * @return {@link #kernalVersionNo}
     */
    public String getKernalVersionNo() {
        return kernalVersionNo;
    }

    /**
     * @param kernalVersionNo {@link #kernalVersionNo}
     */
    public void setKernalVersionNo(final String kernalVersionNo) {
        this.kernalVersionNo = kernalVersionNo;
    }

    /**
     * @return {@link #CATIndicator}
     */
    public Integer getCATIndicator() {
        return CATIndicator;
    }

    /**
     * @param CATIndicator {@link #CATIndicator}
     */
    public void setCATIndicator(final Integer CATIndicator) {
        this.CATIndicator = CATIndicator;
    }

    @Override
    public String toString() {
        return "AdditionalTerminalInfo{" +
                "terminalId='" + terminalId + '\'' +
                ", terminalCity='" + terminalCity + '\'' +
                ", terminalState='" + terminalState + '\'' +
                ", terminalLocation='" + terminalLocation + '\'' +
                ", storeNumber='" + storeNumber + '\'' +
                ", deviceSerialNumber='" + deviceSerialNumber + '\'' +
                ", POSTerminalInputCapabilityInd='" + POSTerminalInputCapabilityInd + '\'' +
                ", kernalVersionNo='" + kernalVersionNo + '\'' +
                ", CATIndicator=" + CATIndicator +
                '}';
    }

}
