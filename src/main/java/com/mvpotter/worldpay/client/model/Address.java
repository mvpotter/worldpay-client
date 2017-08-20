package com.mvpotter.worldpay.client.model;

/**
 * billing address of the account holder.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class Address {

    /**
     * street address.
     */
    private String line1;

    /**
     * 	city where address is located.
     */
    private String city;

    /**
     * state where address is located; valid values are 2-character state abbreviations.
     */
    private String state;

    /**
     * 5- or 9-digit zip code.
     */
    private String zip;

    /**
     * country name. Defaults to US.
     */
    private String country;

    /**
     * company name.
     */
    private String company;

    /**
     * phone number.
     */
    private String phone;

    /**
     * @return {@link #line1}
     */
    public String getLine1() {
        return line1;
    }

    /**
     * @param line1 {@link #line1}
     */
    public void setLine1(final String line1) {
        this.line1 = line1;
    }

    /**
     * @return {@link #city}
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city {@link #city}
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * @return {@link #state}
     */
    public String getState() {
        return state;
    }

    /**
     * @param state {@link #state}
     */
    public void setState(final String state) {
        this.state = state;
    }

    /**
     * @return {@link #zip}
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip {@link #zip}
     */
    public void setZip(final String zip) {
        this.zip = zip;
    }

    /**
     * @return {@link #country}
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country {@link #country}
     */
    public void setCountry(final String country) {
        this.country = country;
    }

    /**
     * @return {@link #company}
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company {@link #company}
     */
    public void setCompany(final String company) {
        this.company = company;
    }

    /**
     * @return {@link #phone}
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone {@link #phone}
     */
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}