# bakrommet.net

VM 2018 nærmer seg. Hvem er den beste VM-tipperen?

## Kom i gang med utvikling

* Sett opp `auth0.properties`. Se `sample`-filen for nødvendig info (hentes fra auth0.com).
* Start appen med `./mvnw spring-boot:run` eller via IntelliJ
* Applikasjonen starter på [localhost:8080](http://localhost:8080)

### Heroku

* Installer [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli) og følg trinnene under Getting Started
* Klargjør for deploy med `heroku git:remote -a bakrommet`
* Deploy til Heroku med `git push heroku master`

## Teknologien

* I bunnen av alt ligger [Spring Boot](https://projects.spring.io/spring-boot/)
* [Thymeleaf](http://www.thymeleaf.org/) brukes til generering av HTML
* For autentisering av brukere har vi tatt i bruk [Auth0](https://auth0.com)
* Appen hostes på [Heroku](https://heroku.com)

Lær hvordan Spring Boot og Thymeleaf kan brukes sammen her: https://spring.io/guides/gs/serving-web-content/
