FROM maven:alpine
RUN git clone https://github.com/BrokenNightmareTeam/JPandas.git && \
    cd JPandas && \
    mvn jacoco:report coveralls:report
