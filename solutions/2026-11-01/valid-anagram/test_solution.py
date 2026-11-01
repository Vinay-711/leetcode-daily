from solution import Solution
s=Solution()
assert s.isAnagram('aabb', 'baba')
assert not s.isAnagram('ab', 'aa')
assert not s.isAnagram('a', 'aa')
assert s.isAnagram('z'*50000, 'z'*50000)
print('4 checks passed')
