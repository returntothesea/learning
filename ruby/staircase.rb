# Write a program that prints a staircase of size N.

# Input Format
# A single integer, N , denoting the size of the staircase.

# Output Format
# Print a staircase of size N using # symbols and spaces.


n = gets.strip.to_i

stair_count = 1
space_count = n - 1

n.times do
	puts (" " * space_count) + ("#" * stair_count)
	stair_count += 1
	space_count -= 1
end