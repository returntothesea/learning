# A day is "beautiful" if the absoluge value of the difference between x and reversed(x)
# is evenly divisible by k.

# Given i, j, and k, count and print the number of "beautiful" days in the inclusive
# range between i and j.


# Get input
d1,d2,num = gets.strip.split(' ')
d1 = d1.to_i
d2 = d2.to_i
num = num.to_i

# Running total of "beautiful" days
total = 0

# Check method to see if a day meets "beautiful" criteria
def check(i, k)
	n = i.to_s.reverse.to_f
	i = i.to_f
	x = (i - n) / k
	return x == x.floor
end

# Check the days in the range and add one to total if a day
# meets the criteria
while d1 <= d2 do
	if (check(d1, num))
		total += 1
	end
	d1 += 1
end

# Print result
puts total




