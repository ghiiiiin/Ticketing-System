

N=8

#cetak langkah jalurnya
def printSolution(sol):
    for i in sol:
        for j in i:
            print (str(j) + " ",end="")
        print("")

#fungsi cek jika x, y valid
#index fornya N*N Maze
def isSafe(maze, x, y):
    if x >= 0 and x < N and y >= 0 and y < N and maze[x][y] == 1:
        return True

    return False


def solveMaze (maze):
    #matriks 8x8
    sol = [[0 for j in range (8)] for i in range(8)]

    if solveMazeUtil(maze, 0, 1, sol) == False:
        print ("doesnt exist")
        return False

    printSolution(sol)
    return True

#fungsi pengecekan perlangkah
def solveMazeUtil(maze,x, y, sol):
    #titik koordinat finish
    if x == N - 2 and y == N - 4:
        sol[x][y] =1
        return True

#cek jiak maze[x][y] valid
    if isSafe(maze,x,y) == True:
        sol[x][y] =1 #nandain kalo koordinat merupakan path benar

        #pindah ke bawah
        if solveMazeUtil(maze, x+1, y, sol) == True:
            return True

        # jika kebawah tidak bisa, maka pindah ke kanan
        if solveMazeUtil(maze, x, y + 1, sol) == True:
            return True

        #jika kekanan dan kebawah tidak bisa, maka pindah ke kiri
        if solveMazeUtil(maze, x, y-1, sol)== True:
            return True

        #x,y bukan jalurnya
        sol[x][y] = 0
        return False

if __name__ == "_____main____":
    maze = {[1,1,1,0,1,1,1,1],
            [1,1,0,0,0,1,1,0],
            [1,1,1,1,1,1,1,0],
            [1,1,1,1,1,1,1,0],
            [0,0,0,1,1,1,1,0],
            [1,1,1,0,0,1,1,0],
            [1,1,1,1,1,1,0,1],
            [1,1,1,1,0,0,1,1]}

    solveMaze(maze)







