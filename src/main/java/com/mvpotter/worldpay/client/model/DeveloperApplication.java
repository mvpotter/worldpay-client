package com.mvpotter.worldpay.client.model;

/**
 * contains developer Id and version information related to the integration..
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class DeveloperApplication {

    /**
     * developer ID of integrator as assigned by Worldpay.
     */
    private String developerId;

    /**
     * version number of the integrator's application.
     */
    private String version;

    public DeveloperApplication(final String developerId, final String version) {
        this.developerId = developerId;
        this.version = version;
    }

    /**
     * @return {@link #developerId}
     */
    public String getDeveloperId() {
        return developerId;
    }

    /**
     * @param developerId {@link #developerId}
     */
    public void setDeveloperId(final String developerId) {
        this.developerId = developerId;
    }

    /**
     * @return {@link #version}
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version {@link #version}
     */
    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "DeveloperApplication{" +
                "developerId='" + developerId + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

}
