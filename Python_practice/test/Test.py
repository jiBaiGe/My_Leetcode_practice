# coding=gbk
'''
Created on 2018年1月21日

@author: ye

import turtle

def paint(rad, angle, len,neckrad):
    for i in range(len):
         turtle.circle(rad,angle)
         turtle.circle(-rad, angle)
    turtle.circle(rad, angle/2)
    turtle.fd(rad)
    turtle.circle(neckrad+1, 180)
    turtle.fd(rad*2/3)

def main ():
    turtle.setup(1300,800,0,0)
    pythonsize = 30
    turtle.pensize(pythonsize)
    turtle.pencolor("blue")
    turtle.seth(-40)
    paint(40, 80, 5, pythonsize/2)    
    
main()        

print ("hello world")

-------------------------

import copy

a = [1,2,3,4]
a.append(5)
b = a
print(b)
--------------------------
'''
def dosth() :
    print("I will do")

a = {
    "num" : {1,2,3,4},
    "text" : "hello",
    "fun" : dosth()
    }

#a["fun"] = dosth()
