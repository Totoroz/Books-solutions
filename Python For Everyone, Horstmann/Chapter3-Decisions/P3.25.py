# Write a program that computes taxes for the following schedule.
# if your status is single and
# if the taxable income is over   but not over        the tax is          of the amount over
#     $0                              $8,000                  10%                 $0
#  $8,000                             $32,000              $800 +  15%           $8,000
#  $32,000                                                 $4,400 + 25%          $32,000
#
# if your status is Married and
# if the taxable income is over    but not over        the tax is           of the amount over
#  $0                              $16,000                  10%                     $0
#  $16,000                         $64,000                 $1,600 + 15%            $16,000
#  $64,000                                                  $8,800 + 25%           $64,000

status = str(input("Are you single or married?: "))

if status == "married" or status == "single":
    income = float(input("Enter your income: $"))

    tax = 0

    if status == "single":
        if income > 0 and income <= 8000:
            tax = income * 0.10

        elif income > 8000 and income <= 32000:
            tax = (income * 0.15) + 800

        elif income > 32000:
            tax = (income * 0.25) + 4400

        else:
            print("Invalid income input")

    else:
        if income > 0 and income <= 16000:
            tax = income * 0.10

        elif income > 16000 and income <= 64000:
            tax = (income * 0.15) + 1600

        elif income > 64000:
            tax = (income * 0.25) + 8800

        else:
            print("Invalid income input")


    if(income > 0):
        print("Your tax is: $%f" % tax)

else:
    print("Invalid input")