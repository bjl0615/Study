def issamestring(str1 , str2) :
    str1len = 0
    str2len = 0

    for i in range(i , len(str1) , 1) :
        str1len = i
    for i in range(0, len(str2), 1):
        str2len = i

    if(str1len != str2len) :
        return False
    
    for i in range(0 , str1len, 1) :
        if(str1[i] != str2[i]) :
            return False
    return True

str1 = ['a','p','p','l','e']
str2 = ['a','a','p','p','l','e']
str3 = ['a','p','p','l']
str4 = ['a','p','p','l','e']

print(issamestring(str1 , str2))
print(issamestring(str1, str3))
print(issamestring(str1, str4))
print(issamestring(str2, str3))
print(issamestring(str2, str4))
