class Person:
    def __init__(self, name, dob):
        self.__name = name
        self.__dob = dob
    def show(self):
        print(self.name)
        print(self.dob)
    def getName(self):
        return self.__name
    def setName(self,name):
        self.__name = name
    
    def getDob(self):
        return self.__dob
    def setDob(self,dob):
        self.__dob = dob
    
    def __str__(self):
       return "Name: " + self.name + "\n" + "DOB: "+self.dob
p1 = Person("amit","1111")
p1.setName("Yash")
print(p1.getName())
p1.setDob("1-2-3")
print(p1.getDob())