from cmath import sqrt
import math
import sys
from typing import Final

MAX_PLAYERS : Final = 5
MAX_POSITIONS : Final = 3
X : Final = 0
Y : Final = 1
Z : Final = 2


playPos = [
[0.0, 0.0, 0.0],
[10.1, 15.3, 0.0],
[15.1, 20.3, 0.0],
[15.1, 20.3, 30.0],
[10.1, 10.3, 0.0]
]

def getDistance(mx, my, mz, tX, tY, tZ) :
    return math.sqrt(math.pow(mx - tX, 2) + math.pow(my - tY, 2) + math.pow(mz - tZ, 2))

def getPlayerPos(playerID) :
    return playPos[playerID]

def setPlayerPos(playerID, x, y, z) :
    playPos[playerID][X] = x
    playPos[playerID][Y] = y
    playPos[playerID][Z] = z
    return True

def isPlayerOnPlayer(playerID, tergetPlayerID) :
    if(playPos[playerID][X] == playPos[tergetPlayerID][X]) :
        if(playPos[playerID][Y] > playPos[tergetPlayerID][Y]) :
            if(playPos[playerID][Z] > playPos[tergetPlayerID][Z]) :
                return True

def isPlayerNearby(playerID, targetPlayerID, radian) :
    if(getDistance(playPos[playerID][X], playPos[playerID][Y], playPos[playerID][Z], playPos[targetPlayerID][X], playPos[targetPlayerID][Y], playPos[targetPlayerID][Z]) <= radian) :
        return True
    return False    

if(setPlayerPos(0, 10.1, 15.3, 10.0) == False) :
    sys.exit()

player0Pos = getPlayerPos(0)

for i in range(0 , MAX_POSITIONS , 1) :
    print(player0Pos[i])
   
print(isPlayerOnPlayer(0, 1))

for i in range(0 , MAX_PLAYERS , 1) :
    for j in range(0 , MAX_PLAYERS , 1) :
        if(i == j) : continue
        print(i , j , end = "\n")
        print(getDistance(playPos[i][X] , playPos[i][Y] , playPos[i][Z] , playPos[j][X] , playPos[j][Y] , playPos[j][Z]), end = " ")
        print("\t", isPlayerNearby(i , j , 10))
