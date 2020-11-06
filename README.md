# Micronaut with Autonomous Database

JAVA Micronaut framework connecting with Oracle Autonomous Database

This project uses Universal Connection Pool and Hibernate.

Define the following environment variables:

- `DB_SERVICE` with the service, for example `mydb_high`, `mydb_low`, etc.
- `DB_USER` database user name
- `DB_PASSWORD` database user password
- `TNS_ADMIN` pointing to your unzipped Wallet folder

Run the application with:

`./gradlew run`

Test with `curl`:

`curl -s localhost:8080/documents`

- [Micronaut Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

