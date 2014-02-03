//The atmospheres of the gas giant planets(Jupiter, Saturn, Uranus, and Neptune) are
//mostly comprised of hydrogen(H 2) followed by helium(He).The atmospheres of
//the terrestrial planets are mostly comprised of carbon dioxide(CO 2) followed by
//nitrogen(N 2) for Venus and Mars, and for Earth, mostly Nitrogen(N 2) followed by
//Oxygen(O 2).Write a program that outputs this information in a chart with four
//columns for the type of planet, the name of the planet, its primary atmospheric gas,
//and secondary atmospheric gas.

#include<iostream>

using namespace std;

int main()
{
    cout << "Type of planet\tName of planet\tPrimary gas\tSecondary gas" << "\n";
    cout << "Terrestrial\tVenus\t\tCO2\t\tN2" << "\n";
    cout << "Terrestrial\tEarth\t\tN2\t\tO2" << "\n";
    cout << "Terrestrial\tMars\t\tCO2\t\tN2" << "\n";
    cout << "Gas giant\tJupiter\t\tH2\t\tHe" << "\n";
    cout << "Gas giant\tSaturn\t\tH2\t\tHe" << "\n";
    cout << "Gas giant\tUranus\t\tH2\t\tHe" << "\n";
    cout << "Gas giant\tNeptune\t\tH2\t\tHe" << "\n";


    return 0;
}
