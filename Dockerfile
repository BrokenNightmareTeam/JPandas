FROM maven:alpine
RUN apt-get update && \
    apt-get install -y maven openjdk-8-jdk && \
    apt-get clean \
    git clone https://github.com/BrokenNightmareTeam/JPandas.git \
    cd JPandas \
    mvn jacoco:report coveralls:report