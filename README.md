# Examensarbete – ScoreHub

## Projektbeskrivning
ScoreHub är en Java Spring Boot-applikation för att hantera fotbollslag och matcher.  
Applikationen erbjuder ett REST API för att skapa och hämta lag och matcher, med datalagring i PostgreSQL via Spring Data JPA.

## Work in Progress
Detta dokument uppdateras löpande under projektets gång.

---

## Funktionalitet (nuvarande status)

### Implementerat
- Skapat Spring Boot-projekt med Maven.
- Konfigurerat PostgreSQL som databas.
- Implementerat domänmodeller:
  - `Team`
  - `Match`
- Skapat repositories med Spring Data JPA.
- Implementerat `DataLoader` för att skapa testdata (lag och matcher).
- Skapat REST controllers:
  - **GET /teams** – hämta alla lag  
  - **POST /teams** – skapa nytt lag  
  - **GET /matches** – hämta alla matcher  
  - **POST /matches** – skapa ny match
- Testat samtliga endpoints i Postman.
- Versionshantering med Git och GitHub.
- Projektplanering med GitHub Projects (backlog, pågående, klart).

---

## Planerat arbete
- Förbättra validering och felhantering i API:t.
- Utöka dokumentation av API och datamodeller.
- Skriva reflektion kring utvecklingsprocessen.
- Förbereda integration med extern datakälla (football-data.org).
- Slutföra README inför inlämning.

---

## Extern API-integration (framtida arbete)
Som ett nästa steg planeras integration med **football-data.org (gratisversion)** för att kunna hämta verklig match- och lagdata istället för enbart testdata.

---

## Teknikstack
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Git & GitHub
- Postman

## Status
Projektets backend är färdig och testad.  
Samtliga REST-endpoints fungerar enligt plan.

Projektet fokuserar i denna version på backendutveckling.
Frontend och extern API-integration är planerade som framtida steg.

## Reflektion
Detta projekt har gett mig en djupare förståelse för hur en backend byggs upp med Spring Boot.
Jag har lärt mig hur REST API:er designas, hur entiteter och relationer fungerar i JPA samt
hur en databas kopplas till applikationen via PostgreSQL.

En utmaning i projektet var att hantera relationer mellan matcher och lag samt
att säkerställa att korrekt data skickas via API:t. Genom testning i Postman
har jag fått en bättre förståelse för hur backend och klient samverkar.

Om mer tid fanns skulle projektet utökas med en frontend samt integration
med ett externt API för att hämta verklig fotbollsdata.
