package com.hotcashew.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xeiam.dropwizard.sundial.SundialConfiguration;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ApiConfiguration extends Configuration {
    @Valid
    @NotNull
    public SundialConfiguration sundialConfiguration = new SundialConfiguration();

    @JsonProperty("cookieDomain")
    public String cookieDomain;

    @Valid
    @NotNull
    @JsonProperty("database")
    private DataSourceFactory datasourceFactory = new DataSourceFactory();

    @Valid
    @NotNull
    @JsonProperty("environment")
    private String environment;

    @JsonProperty("sundial")
    public SundialConfiguration getSundialConfiguration() {
        return sundialConfiguration;
    }

    public String getEnvironment() {
        return environment;
    }

    public DataSourceFactory getDataSourceFactory() {
        return datasourceFactory;
    }
}