class Person:
    objCount = 0
    def __init__(self,name,dob):
        self.name = name
        self.dob = dob

        Person.objCount +=1
    def show(self):
        print(self.name)
        print(self.dob)

p1 = Person("Amit","Rohini Sector 17")
print(Person.objCount)
p2 = Person("Ramesh","Rohini Sector 16")
print(Person.objCount)

p1.show()
p2.show()