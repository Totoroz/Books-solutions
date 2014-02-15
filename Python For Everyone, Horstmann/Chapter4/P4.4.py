# Complete the program in How To 4.1 on page 182. Your program should read twelve
# temperature values and print the month with the highest temperature.

temperatures = []
maxTemperatureMonth = 1

for i in range(13):
    temperatureInput = float(input("Enter a temperature: "))
    temperatures.append(temperatureInput)

maxTemperature = max(temperatures)

# could be implemented in the previous loop but this is more readable
for i in range(13):
    if maxTemperature == temperatures[i]:
        maxTemperatureMonth = i

print("Max temperature month:", maxTemperatureMonth)
print("Max temperature:", maxTemperature)