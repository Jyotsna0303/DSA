#!/usr/bin/env python3
def reversestring(str1):
    words=str1.split()
    reversedList= []
    for word in words:
        reversedList.insert(0,word)

    return " ".join(reversedList)

def main():
    print(reversestring("Welcome to geeksforgeeks"))

if __name__== '__main__' : main()