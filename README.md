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
