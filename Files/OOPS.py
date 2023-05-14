class Person:
    def __init__(self,name,dob,add):
        self.name = name
        self.dob = dob
        self.add = add

    def show(self):
        print(self.name)
        print(self.dob)
        print(self.add)

p1 = Person("Ram","1-1-1","NA")
p1.show()

p2 = Person("Shyam","1-2-1","NAA")
p2.show()

p3 = p1
p3.dob  = "2-2-1"
p3.show()
