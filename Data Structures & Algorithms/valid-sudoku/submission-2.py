class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        for i in range(9):
            numSet = set()
            for c in board[i]:
                if c in numSet:
                    return False
                elif c != ".":
                    numSet.add(c)
            numSet = set()
            for j in range(9):
                if board[j][i] in numSet:
                    return False
                elif board[j][i] != ".":
                    numSet.add(board[j][i])
        
        for i in range(0,9,3):
            for j in range(0,9,3):
                numSet = set()
                for k in range(3):
                    for l in range(3):
                        if board[i + k][j + l] in numSet:
                            return False
                        elif board[i + k][j + l] != ".":
                            numSet.add(board[i + k][j + l])
            
        return True