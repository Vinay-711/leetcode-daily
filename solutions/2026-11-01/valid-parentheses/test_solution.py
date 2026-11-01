from solution import Solution
s=Solution()
for text, expected in [('()',True),('([])',True),('([)]',False),(']',False),('(',False),('()[]{}',True),('('*5000+')'*5000,True)]:
    assert s.isValid(text) == expected
print('7 checks passed')
