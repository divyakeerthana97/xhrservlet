package com.kg.xhrservlet.model;

/**
 * Country
 */
public class Country {
    private String countryid;
    private String countryname;

    /**
     * @return the countryid
     */
    public String getCountryid() {
        return countryid;
    }
    /**
     * @param countryid the countryid to set
     */
    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }
    /**
     * @return the countryname
     */
    public String getCountryname() {
        return countryname;
    }
    /**
     * @param countryname the countryname to set
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
    @Override
    public String toString() {
        return countryid+" ->"+countryname;
    }
}