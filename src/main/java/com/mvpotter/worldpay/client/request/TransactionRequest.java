package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.LevelTwoData;

import java.util.Arrays;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class TransactionRequest {

    /**
     * transaction identifier.
     */
    private String referenceTransactionId;

    /**
     * level two tax information. the status field inside of the levelTwoData object is required if you are updating level two tax information.
     */
    private LevelTwoData levelTwoData;

    /**
     * signature image.
     */
    private byte[] signatureImage;

    /**
     * @return {@link #referenceTransactionId}
     */
    public String getReferenceTransactionId() {
        return referenceTransactionId;
    }

    /**
     * @param referenceTransactionId {@link #referenceTransactionId}
     */
    public void setReferenceTransactionId(final String referenceTransactionId) {
        this.referenceTransactionId = referenceTransactionId;
    }

    /**
     * @return {@link #levelTwoData}
     */
    public LevelTwoData getLevelTwoData() {
        return levelTwoData;
    }

    /**
     * @param levelTwoData {@link #levelTwoData}
     */
    public void setLevelTwoData(final LevelTwoData levelTwoData) {
        this.levelTwoData = levelTwoData;
    }

    /**
     * @return {@link #signatureImage}
     */
    public byte[] getSignatureImage() {
        return signatureImage;
    }

    /**
     * @param signatureImage {@link #signatureImage}
     */
    public void setSignatureImage(final byte[] signatureImage) {
        this.signatureImage = signatureImage;
    }

    @Override
    public String toString() {
        return "TransactionRequest{" +
                "referenceTransactionId='" + referenceTransactionId + '\'' +
                ", levelTwoData=" + levelTwoData +
                ", signatureImage=" + Arrays.toString(signatureImage) +
                '}';
    }

}
