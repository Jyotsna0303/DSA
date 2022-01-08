#!/usr/bin/env python3

def subsequence(str1, str2):
    if len(str1) < len(str2):
        return False
    len1= len(str1)
    len2= len(str2)
    i ,j= 0,0
    while i < len1 and j < len2 :
        if str1[i] == str2[j]:
            j +=1
        i += 1
    return j == len2 # if true that means subsequence exists otherwise not

def main():
    print(f'Subsquence : {subsequence("ABCDE","ABE")}')

if __name__== '__main__' : main()