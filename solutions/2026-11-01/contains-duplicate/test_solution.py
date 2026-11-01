import random
from solution import Solution
rng = random.Random(711)
s = Solution()
for values, expected in [([7], False), ([-1,-1], True), ([0,1,2], False), ([-10**9,10**9], False)]:
    assert s.containsDuplicate(values) == expected
for _ in range(200):
    values = [rng.randint(-100,100) for _ in range(rng.randint(1,100))]
    ordered = sorted(values)
    expected = any(ordered[i] == ordered[i-1] for i in range(1,len(ordered)))
    before = values[:]
    assert s.containsDuplicate(values) == expected
    assert values == before
assert not s.containsDuplicate(list(range(100000)))
print('205 cases passed, including randomized and maximum-length input')
