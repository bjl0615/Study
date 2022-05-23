def incSortArr(list, finished, endOfArray):
    if (finished == (endOfArray - 1)):
        return list

    max = finished
    for i in range(finished, endOfArray, 1):
        if(list[max] < list[i]):
            max = i

    tmp = list[finished]
    list[finished] = list[max]
    list[max] = tmp

    return incSortArr(list, finished + 1, endOfArray)


list = [30, 27, 54, 1465, 123, 123, 76, 631, 0, 1]
list1 = incSortArr(list, 0, 10)
for i in list1:
    print(i, end=" ")
