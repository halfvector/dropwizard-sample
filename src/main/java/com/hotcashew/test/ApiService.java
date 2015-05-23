package com.hotcashew.test;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ApiService extends Application<ApiConfiguration> {
    public static void main(String[] args) throws Exception {
        new ApiService().run(args);
    }

    @Override
    public String getName() {
        return "test-test";
    }

    @Override
    public void initialize(Bootstrap<ApiConfiguration> bootstrap) {
    }

    @Override
    public void run(ApiConfiguration configuration, Environment environment) {
    }
}