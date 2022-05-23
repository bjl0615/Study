a=input("단어를 입력하세요:")

def is_palindrome(word) :
    left = len(word)//2
    for i in range(left) :
        right = -i-1
        if word[left] != word[right] :
            return False
    return True

print(is_palindrome(a))