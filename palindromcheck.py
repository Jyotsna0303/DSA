#!/usr/bin/env python3

def checkpalindrome(str1):
    begin=0
    end=len(str1)-1
    while( begin  < end ):
        if str1[begin]!=str1[end]:
            return False
        begin += 1
        end -= 1
    return True

def main():
    print(f'palindrome :{checkpalindrome("ABBAC")}')

if __name__=='__main__' :main()