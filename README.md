# M223: Punchclock
Dies ist eine Beispielapplikation für das Modul M223.

## Loslegen
Folgende Schritte befolgen um loszulegen:
1. Sicherstellen, dass JDK 12 installiert und in der Umgebungsvariable `path` definiert ist.
1. Ins Verzeichnis der Applikation wechseln und über die Kommandozeile mit `./gradlew bootRun` oder `./gradlew.bat bootRun` starten
1. Unittest mit `./gradlew test` oder `./gradlew.bat test` ausführen.
1. Ein ausführbares JAR kann mit `./gradlew bootJar` oder `./gradlew.bat bootJar` erstellt werden.

Folgende Dienste stehen während der Ausführung im Profil `dev` zur Verfügung:
- REST-Schnittstelle der Applikation: http://localhost:8081
- Dashboard der H2 Datenbank: http://localhost:8081/h2-console

Beschreibung:

Die Applikation beginnt im Login Screen. Dort kann sich der Benutzer anmelden oder
mit einem Knopf auf die Registrierungs Seite gelangen, um sich dort zu registrieren.
Nach dem Login oder der Registrierung kann der Benutzer ein Startdatum, eine Startzeit,
ein Schlussdatum, eine Schlusszeit, eine Abteilung und einen Zweck angeben.
Diese Eingaben werden danach in einer Liste unter den Eingabefeldern angezeigt.