class ComplexNumber:
    def __init__(self, x, y):
        self.__x = x
        self.__y = y

    def __str__(self):
        return str(self.__x) + "+" + str(self.__y) + "i"

    def setXandY(self, x, y):
        self.__x = x
        self.__y = y

    def getXandY(self):
        return [self.__x, self.__y]
    
    def __add__(self,other):
        newReal = self.__x + other.__x
        newImg = self.__y + other.__y
        newCom = ComplexNumber(newReal,newImg)
        return newCom


    # def show(self):
    #     print(self.__x,"+",self.__y,"i")
z1 = ComplexNumber(2, 3)
z2 = ComplexNumber(4,5)
print(z1+z2)
print(2+3)
