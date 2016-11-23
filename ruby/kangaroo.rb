# There are two kangaroos on an x-axis ready to jump in the
# positive direction (i.e, toward positive infinity). The first
# kangaroo starts at location x1 and moves at a rate of v1 meters per
# jump. The second kangaroo starts at location x2 and moves at a rate
# of v2 meters per jump. Given the starting locations and movement
# rates for each kangaroo, can you determine if they'll ever land
# at the same location at the same time?

x1,v1,x2,v2 = gets.strip.split(' ')
x1 = x1.to_i
v1 = v1.to_i
x2 = x2.to_i
v2 = v2.to_i


# If the rate at which the distance between the kangaroos is closing can
# add up to the original distance between them, you know they'll meet.

if v1 <= v2
	puts "NO"
else
	if ((x2 - x1) % (v1 - v2) == 0)
		puts "YES"
	else
		puts "NO"
	end
end
