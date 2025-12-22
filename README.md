# firstw - Ausführen

Schritte zum Starten:

1. Projektverzeichnis öffnen:
   cd C:\Users\LENOVO\Desktop\Tobias\tp_inj_dep\firstw

2. Starten (Windows):
   - Doppelklick auf run.bat oder in der Konsole: run.bat

   Alternativ:
   - Mit Maven: mvn spring-boot:run
   - Oder mit IDE (Run -> MicroServicePersonneApplication)

3. Prüfen:
   - Browser: http://localhost:8081/ws/api/personnes  (oder /ws/api/personnes bei context-path=/ws)
   - H2-Console: http://localhost:8081/ws/h2-console

Hinweis: Wenn Probleme beim Build auftreten, Maven-Output lesen und fehlende Abhängigkeiten prüfen.

