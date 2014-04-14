# Design and implement a class Country that stores the name of the country, its popula-
# tion, and its area. Then write a program that reads in a set of countries and prints
# •    The country with the largest area.
# •    The country with the largest population.
# •    The country with the largest population density (people per square kilometer (or mile)).


class Country():
    def __init__(self, name, population, area):
        self._name = name
        self._population = population
        self._area = area

    def get_name(self):
        return self._name

    def get_population(self):
        return self._population

    def get_area(self):
        return self._area

    def get_population_density(self):
        return int(self._population / self._area)

    def pretty_info(self):
        return "Name: {}, Population: {}, Area: {}, Population Density: {}".format(self.get_name(), self.get_population(), self.get_area(), self.get_population_density())


class Continent():
    def __init__(self, name):
        self._name = name
        self._countries = set()

    def get_name(self):
        return self._name

    def add_country(self, country):
        self._countries.add(country)

    def show_largest_area_country(self):
        largest = self._countries[0]
        for i in range(1, len(self._countries)):
            if self._countries[i].get_area() > largest.get_area():
                largest = self._countries[i]
        return largest.pretty_info()

    def show_largest_population_country(self):
        largest = self._countries[0]
        for i in range(1, len(self._countries)):
            if self._countries[i].get_population() > largest.get_population():
                largest = self._countries[i]
        return largest.pretty_info()

    def show_largest_population_density_country(self):
        largest = self._countries[0]
        for i in range(1, len(self._countries)):
            if self._countries[i].get_population_density() > largest.get_population_density():
                largest = self._countries[i]
        return largest.pretty_info()
