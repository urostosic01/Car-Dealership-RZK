# Car-Dealership-RZK

Projekat iz predmeta Razvoj zasnovan na komponentama

## O projektu
Aplikacija je kreirana za potrebe fakultetskog projekta i predstavlja simulaciju autoplaca korišćenjem REST tehnologija. O funkcionalnostima sledi više u nastavku teksta. 
  ### Korišćene tehnologije
  <ul>
    <li>Spring Boot</li>
    <li>Java</li>
    <li>MySQL</li>
    
  </ul>

## Primena
Aplikacija simulira kupovinu novih automobila na autoplacu. Korisnik može da se registruje, pregleda dostupne automobile, poručuje ih i osigurava nakon kupovine. Projekat se može modifikovati za potrebe drugih autokuća i osiguranja.

## Funkcionalnosti
Podeljene su i implementirane po servisima.

### Autoplac
- [x] Prikaz dostupnih proizvođača automobila
- [x] Prikaz dostupnih modela po proizvođaču
- [x] Prikaz kupovine/korpe
- [x] Prikaz automobila iz korpe
- [x] Prikaz svih automobila na placu
 
### Clan
- [x] Login
- [x] Registracija
      
### Banka
- [x] Kreiranje novog računa
- [x] Provera stanja po korisniku/broju računa
- [x] Promena stanja računa 

### Osiguranje
- [x] Prikaz svih osiguranja za korisnika
- [x] Dodavanje osiguranja

### Autoplac-Radnja (Kupovina)
- [x] Kreiranje korpe za korisnika
- [x] Dodavanje vozila u korpu
- [x] Kupovina svih vozila iz korpe
- [x] Statistika vozila (Prosečna cena i godište) 

### U procesu izrade
- [ ] Dodavanje front-end-a aplikacije
- [ ] Kreiranje odvojenih baza podataka za banku i osiguravajuću kuću
- [ ] Dodavanje zaštite (Spring Security)
- [ ] Dodavanje rada sa tokenima

## Kontakt
Uroš Tošić - urostosic01@gmail.com

Link projekta: https://github.com/urostosic01/Car-Dealership-RZK

## Dodatno

### Config-server 
Kreiran za potrebe rada sa lokalnom bazom i generisanje modela. 
### Naming-server 
Instanca Eureka Naming Servera koji čuva informacije o svim dostupnim mikroservisima, njihovim portovima i IP adresama. Takođe obezbeđuje load balancing.
### API-gateway
Obezbeđuje centralizovanu komunikaciju između klijenta i dostupnih mikroservisa. 
### Šema baze podataka 
<p align="center">
  <img src="https://github.com/urostosic01/Car-Dealership-RZK/blob/main/RZK_db.png" alt="db_shema">
</p>

