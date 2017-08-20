package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.DeveloperApplication;

/**
 * General Worldpay request.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class WorldPayRequest {

    /**
     * contains developer Id and version information related to the integration.
     */
    private DeveloperApplication developerApplication;

    /**
     * @return {@link #developerApplication}
     */
    public DeveloperApplication getDeveloperApplication() {
        return developerApplication;
    }

    /**
     * @param developerApplication {@link #developerApplication}
     */
    public void setDeveloperApplication(final DeveloperApplication developerApplication) {
        this.developerApplication = developerApplication;
    }

    @Override
    public String toString() {
        return "WorldPayRequest{" +
                "developerApplication=" + developerApplication +
                '}';
    }

}
