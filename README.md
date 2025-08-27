# British Spoken Time

![Build](https://github.com/hadeoh/british-spoken-time-formatter/actions/workflows/ci.yml/badge.svg)
[![codecov](https://codecov.io/github/hadeoh/british-spoken-time-formatter/graph/badge.svg?token=1KS7OIB6IL)](https://codecov.io/github/hadeoh/british-spoken-time-formatter)

A Java program that converts digital time (`HH:mm`) into its **British spoken form**. This was implemented as a console app for interaction with client.

For example:

- `07:30 → half past seven`
- `09:45 → quarter to ten`
- `12:00 → noon`
- `00:00 → midnight`
- `06:32 → six thirty two`

---

## Features
- Converts `HH:mm` into spoken British English.
- Handles special cases: **midnight** (`00:00`), **noon** (`12:00`).
- Implements **Strategy + Factory design patterns** for clean extensibility.
- Falls back to **digital form** for irregular minutes (`6:32 → six thirty two`).
- Fully tested with **JUnit 5** (unit + integration tests).
- CI/CD with **GitHub Actions** + **Codecov** for coverage.
- Configurable logging with **SLF4J + Logback**.

---

## Setup & Run

1. ### Clone Repository
        git clone https://github.com/hadeoh/british-spoken-time-formatter.git
        cd british-spoken-time-formatter
2. ### Build & Run
    #### Compile:
        mvn clean compile
    #### Run app:
        mvn exec:java -Dexec.mainClass="org.playground.BritishSpokenTimeConsoleApp"
   #### Run tests:
        mvn test
3. ### Design Decisions

   - Strategy Pattern: Each minute rule is encapsulated in its own class (OClockStrategy, QuarterPastStrategy, etc.).

   -  Factory Pattern: Picks the correct strategy at runtime based on the input minutes.

   -  Clean separation of concerns: Easy to extend.

4. ### Possible Extensions

   -  Wrap this logic in a Spring Boot REST API (/spoken-time?time=07:35).

   -  Add support for seconds (07:35:45).

   -  Add multi-language support (German, Czech, etc., where “half ten” = 9:30).