class Osoba:
    def __init__(self, imie, nazwisko, wiek):
        self.imie = imie
        self.nazwisko = nazwisko
        self.wiek = wiek

    def __str__(self):
        return f"{self.imie} {self.nazwisko}, {self.wiek} lat"

ludzie = [
    Osoba("Jan", "Kowalski", 70),
    Osoba("Piotr", "Wiśniewski", 68),
    Osoba("Maria", "Zielińska", 35),
    Osoba("Ola", "Kowalski", 30)
]

print("Przed sortowaniem:")
for osoba in ludzie:
    print(osoba)

for i in range(len(ludzie)):
    min_idx = i
    for j in range(i + 1, len(ludzie)):
        if ludzie[j].wiek < ludzie[min_idx].wiek:
            min_idx = j
    ludzie[i], ludzie[min_idx] = ludzie[min_idx], ludzie[i]

print("\nPo sortowaniu:")
for osoba in ludzie:
    print(osoba)
