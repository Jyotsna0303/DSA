from collections import Counter

def checkanagram(str1, str2):
    if len(str1) != len(str2):
        return False

    if sorted(str1) == sorted(str2):
        return True
    return False

def checkanagramCounter (str1, str2):
    if len(str1) != len(str2):
        return False

    if Counter(str1)==Counter(str2) :
        return True
    else:
        return False

def main() :
    print(f'anagram:{checkanagram("silent", "listen")}')


if __name__=='__main__' : main()

#collections is a module in python
# Collections module provides the user with specialized container datatypes, thus, providing an alternative to Python’s general-purpose built-ins like dictionaries, lists, and tuples.
# Counter is a sub-class that is used to count hashable objects. It implicitly creates a hash table of an iterable when invoked.
