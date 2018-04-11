FROM maven:3.5.3-jdk-10-slim
RUN mvn jacoco:report coveralls:report
