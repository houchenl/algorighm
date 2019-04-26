
def solve(array):
    length = len(array)

    # lengthArray store the longest increase subsequence of each element in array[]
    # set the longest increase subsequence of each element to 1 by default
    lengthArray = [1] * length
    # previousElementArray store the previous element's index in array[]
    # set index to 0 by default
    # previousElementArray = [0 for i in range(length)]
    previousElementArray = [0] * length

    # loop array[], for each element in array[], find out the length of longest increase subsequence for it,
    # and find out it's preview element's index in the increase subsequence
    i = 1
    while i < length:
        # for each element in array[], compare it with all previous element in array[]
        j = 0
        while j < i:
            if array[j] < array[i]:
                size = lengthArray[j] + 1
                if (size >= lengthArray[i]):  # always record the latest element
                    lengthArray[i] = size
                    previousElementArray[i] = j
            j += 1
        i += 1

    maxLength = 0
    maxIndex = 0
    i = 0
    while i < len(lengthArray):
        if lengthArray[i] > maxLength:
            maxLength = lengthArray[i]
            maxIndex = i
        i += 1
    print('longest increase subsequence length is', maxLength)  # longest increase subsequence length is 5

    result = [0] * maxLength
    index = maxIndex
    k = maxLength - 1
    while k >= 0:
        result[k] = array[index]
        index = previousElementArray[index]
        k -= 1

    for item in result:
        print(item)  # 1 2 5 6 9

solve([3,1,2,5,0,6,4,9])
