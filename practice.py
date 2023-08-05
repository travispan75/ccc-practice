import math

def spiral(start, end):
    difference = y - x + 1
    smallestSquare = int(math.sqrt(difference))
    gridSize = (smallestSquare + 2)
    grid = [["  "]*gridSize for i in range(gridSize)]
    center = round(smallestSquare/2)
    currentNumber = start
    currentPosX = center
    currentPosY = center
    index = 0
    while currentNumber <= end and index < 4:
        if index == 0:
            grid[currentPosX][currentPosY] = currentNumber
            currentNumber += 1
        elif index == 1:
            currentPosX += 1
            grid[currentPosX][currentPosY] = currentNumber
            currentNumber += 1
        elif index == 2:
            currentPosY += 1
            grid[currentPosX][currentPosY] = currentNumber
            currentNumber += 1
        elif index == 3:
            currentPosX -= 1
            grid[currentPosX][currentPosY] = currentNumber
            currentNumber += 1
            currentPosX -= 1
        index += 1
    numTilEdge = 2
    temp = numTilEdge
    while currentNumber <= end:
        for i in range(4):
            if i == 3:
                numTilEdge = temp + 2
            while numTilEdge > 0 and currentNumber <= end:
                if i == 0:
                    grid[currentPosX][currentPosY] = currentNumber
                    currentNumber += 1
                    numTilEdge -= 1
                    currentPosY -= 1
                elif i == 1:
                    grid[currentPosX][currentPosY] = currentNumber
                    currentNumber += 1 
                    numTilEdge -= 1
                    currentPosX += 1
                elif i == 2:
                    grid[currentPosX][currentPosY] = currentNumber
                    currentNumber += 1
                    numTilEdge -= 1
                    currentPosY += 1
                elif i == 3:
                    grid[currentPosX][currentPosY] = currentNumber
                    currentNumber += 1
                    numTilEdge -= 1
                    currentPosX -= 1
            numTilEdge = temp + 1
        temp += 2
        numTilEdge = temp
    for i in range(len(grid)):
        for j in range(len(grid[i])):
            print(grid[i][j], end = "")
            print(' ', end = "")
        print()

x = int(input())
y = int(input())
spiral(x, y)
