package com.mvpotter.worldpay.client.model;

/**
 * Customer data and Vault token.
 *
 * @author mvpotter
 * @since 06/08/2017
 */
public class VaultData {

    /**
     * vault token.
     */
    private Token token;

    /**
     * company of the customer.
     */
    private String company;

    /**
     * first name of the customer.
     */
    private String firstName;

    /**
     * last name of the customer.
     */
    private String lastName;

    /**
     * email address of the customer.
     */
    private String email;

    /**
     * 	phone number of the customer.
     */
    private String phone;

    /**
     * @return {@link #token}
     */
    public Token getToken() {
        return token;
    }

    /**
     * @param token {@link #token}
     */
    public void setToken(final Token token) {
        this.token = token;
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
     * @return {@link #firstName}
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName {@link #firstName}
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return {@link #lastName}
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName {@link #lastName}
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return {@link #email}
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email {@link #email}
     */
    public void setEmail(final String email) {
        this.email = email;
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
        return "VaultData{" +
                "token=" + token +
                ", company='" + company + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
