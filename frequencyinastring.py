#!/usr/bin/env python3

#naive method
def frequency(str1) :
    all_freq={}
    print(type(all_freq)) #dict
    for i in str1:
        if i in all_freq:
            all_freq[i] += 1
        else:
            all_freq[i] = 1
    print(type(all_freq)) #dict
    print(all_freq) #{'g': 2, 'e': 4, 'k': 2, 's': 2, 'f': 1, 'o': 1, 'r': 1}


#using Counter

from collections import Counter
def freqCounter(str1):
    res=Counter(str1)
    print(type(res)) #collections.Counter
    print(res) #Counter({'e': 4, 'g': 2, 'k': 2, 's': 2, 'f': 1, 'o': 1, 'r': 1}) #order is different

def main():
    frequency('geeksforgeeks')
    freqCounter('geeksforgeeks')

if __name__== '__main__' : main()