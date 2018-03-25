N = 7


def printSolution(sol):
    for i in sol:
        for j in i:
            print(str(j) + " ", end="")
        print(" ")

def isSafe(maze, x, y):
    if x >= 0 and x <= N and y >= 0 and y <= N and maze[x][y] == 1:
        return True
    return False

def solveMaze(maze):
    sol = [[0 for j in range(8)] for i in range(8)]

    if solveMazeUtil(maze, input1, input2, sol) == False:
        print("Solution doesn't exist");
        return False
    printSolution(sol)
    return True

def solveMazeUtil(maze, x, y, sol):
    if x == N - 1 and y == N - 3:
        sol[x][y] = "x"
        return True

    if isSafe(maze, x, y) == True:
        sol[x][y] = "z"

        if solveMazeUtil(maze, x + 1, y, sol) == True:
            return True

        if solveMazeUtil(maze, x, y + 1, sol) == True:
            return True

        if solveMazeUtil(maze, x, y - 1, sol) == True:
            return True
        return False

if __name__ == "__main__":
    maze = [[1, 1, 1, 0, 1, 1, 1, 1],
            [1, 1, 0, 0, 0, 1, 1, 0],
            [1, 1, 1, 1, 1, 1, 1, 0],
            [1, 1, 1, 1, 1, 1, 1, 0],
            [0, 0, 0, 1, 1, 1, 1, 0],
            [1, 1, 1, 0, 0, 1, 1, 0],
            [1, 1, 1, 1, 1, 1, 0, 1],
            [1, 1, 1, 1, 0, 0, 1, 1]]

    input1 = int(input("masukan input 0-3 : "))
    input2 = int(input("masukan input2 0-7 : "))
    solveMaze(maze)







