# French country names are feminine when they end with the letter e, masculine oth­
# erwise, except for the following which are masculine even though they end with e:
#     • le Belize
#     • le Cambodge
#     • le Mexique
#     • le Mozambique
#     • le Zaïre
#     • le Zimbabwe
# Write a program that reads the French name of a country and adds the article: le for
# masculine or la for feminine, such as le Canada or la Belgique.
# However, if the country name starts with a vowel, use l’; for example, l’Afghanistan.
# For the following plural country names, use les:
#     • les Etats­Unis
#     • les Pays­Bas

country = str(input("Enter a country in french: "))

vowel = False
plural = False
feminine = False

# checks

if country == "Etats-Unis" or country == "Pays-Bas":
    plural = True

elif country.startswith("a") or country.startswith("A") or country.startswith("e") or country.startswith("E") \
    or country.startswith("i") or country.startswith("I") or country.startswith("o") or country.startswith("O") \
    or country.startswith("u") or country.startswith("U"):
    vowel = True

elif country != "Belize" and country != "Cambodge" and country != "Mexique" \
    and country != "Mozambique" and country != "Zaïre" and country != "Zimbabwe":

    if country.endswith("e"):
        feminine = True

# assigning prefixes
if vowel == True:
    country = "l’" + country

elif plural == True:
    country = "les " + country

elif feminine == True:
    country = "la " + country

else:
    country = "le " + country

# output
print(country)
