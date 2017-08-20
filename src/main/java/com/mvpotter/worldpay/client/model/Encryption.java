package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class Encryption {

    /**
     * type of encryption that has been applied to the cardholder information.
     */
    private EncryptionMode encryptionMode;

    /**
     * @return {@link #encryptionMode}
     */
    public EncryptionMode getEncryptionMode() {
        return encryptionMode;
    }

    /**
     * @param encryptionMode {@link #encryptionMode}
     */
    public void setEncryptionMode(final EncryptionMode encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    @Override
    public String toString() {
        return "Encryption{" +
                "encryptionMode=" + encryptionMode +
                '}';
    }

}
