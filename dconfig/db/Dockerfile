FROM postgres:9.4
COPY ./coffeeshop_db/ docker-entrypoint-initdb.d/
RUN docker-entrypoint.sh