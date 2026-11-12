# trips-and-users

[Original practice problem](https://leetcode.com/problems/trips-and-users/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The solution processes the input `Trips` and `Users` tables by first converting them into strongly-typed Java objects (`Trip` and `User` classes). It then creates a hash map to efficiently look up the banned status of users. Trips are filtered to include only those within the specified date range ('2013-10-01' to '2013-10-03') and where both the client and driver are not banned. The filtered trips are then grouped by their `request_at` date. For each day, the total number of eligible requests and the number of cancelled requests are counted. The cancellation rate is calculated, rounded to two decimal places using `BigDecimal` for precision, and stored. Finally, the results are collected into a list of string lists, sorted by date, and returned.Time complexity is O(T + U) where T is the number of trips and U is the number of users, due to parsing, filtering, and grouping operations. Space complexity is O(T + U) to store the parsed objects, user banned status map, and intermediate filtered/grouped lists.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
