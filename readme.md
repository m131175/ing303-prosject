## Sett opp prosjekt

Klon ned prosjektet ved hjelp av HTTPS eller SSH. 
Vi jobber på hversine brancher i prosjektet, så man kan pushe sine siste endringer uten å forstyrre andre sitt arbeid.


#### Terminal
```
git clone https://github.com/m131175/ing303-prosject.git
```

#### Opprett lokal branch og push den til github. 
```
Opprette ny lokal branch

#1
git branch m131175 (bruk navn eller github brukernavn)
git checkout m131175

eller

#2
git checkout -b m131175

Push den til github

git push -u origin m131175 (navnet på ditt lokale repo)
```

#### For å pushe endringer til github etter at branch er pusha opp
```
git push origin m131175 (navnet på repoet du skal pushe til)
```