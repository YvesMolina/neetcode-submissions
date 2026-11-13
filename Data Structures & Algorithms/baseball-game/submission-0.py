class Solution:
    def calPoints(self, operations: List[str]) -> int:
        
        stack = []
        score = 0

        for operation in operations:
            if operation == "C":
                remove = stack.pop()
                score -= remove
            elif operation == "D":
                cur = stack[-1] * 2
                score += cur
                print("D", cur)
                stack.append(cur)
            elif operation == "+":
                print(stack[-1], stack[-2])
                cur = stack[-1] + stack[-2]
                score += cur
                print("+", cur)
                stack.append(cur)
            else:
                stack.append(int(operation))
                score += int(operation)
        
        return score

