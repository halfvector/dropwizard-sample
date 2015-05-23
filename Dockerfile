FROM java:8

ADD build/distributions/dropwizard-test.tar /srv/

# expose all ports, including admin panel
EXPOSE 80
EXPOSE 81
EXPOSE 8000
EXPOSE 8001

WORKDIR /srv/dropwizard-test/

CMD /srv/dropwizard-test/bin/dropwizard-test server /srv/dropwizard-test/config/localhost.yml