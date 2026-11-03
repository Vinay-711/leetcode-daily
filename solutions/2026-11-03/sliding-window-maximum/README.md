# Sliding Window Maximum

Problem: [sliding-window-maximum](https://leetcode.com/problems/sliding-window-maximum/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://leetcode.com/problems/sliding-window-maximum/submissions/2188814012/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Maintain indices in a deque with decreasing values. Expire indices left of the current window and discard smaller trailing candidates before appending each new index. The front always holds the current maximum. Each index enters and leaves once.

Complexity: O(n) time and O(n) auxiliary space for the index buffer and output.

## Verification

Run `python3 solutions/2026-11-03/sliding-window-maximum/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
