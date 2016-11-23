# Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
# In the diagram below, the red region denotes his house, where s is the start point and t is the end point.
# The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees
# are located on a single point, where the apple tree is at point a and the orange tree is at point b.

# When a fruit falls from its tree, it lands d units of distance from its tree of origin
# along the x-axis. A negative value of d means the fruit fell d units to the tree's left,
# and a positive value of d means it falls d units to the tree's right.

# Given the value of d for m apples and n oranges, can you determine how many apples and
# oranges will fall on Sam's house (i.e., in the inclusive range [s,t] )? Print the number of
# apples that fall on Sam's house as your first line of output, then print the number of
# oranges that fall on Sam's house as your second line of output.




# ====== Test values======
# So I don't have to type input variables every time.

# s = 7
# t = 11

# a = 5
# b = 15

# apple = [-2, 2, 1]
# orange = [5, -6]

# ========================

# Inputs
s,t = gets.strip.split(' ')
s = s.to_i
t = t.to_i
a,b = gets.strip.split(' ')
a = a.to_i
b = b.to_i
m,n = gets.strip.split(' ')
m = m.to_i
n = n.to_i
apple = gets.strip
apple = apple.split(' ').map(&:to_i)
orange = gets.strip
orange = orange.split(' ').map(&:to_i)

apple_count = 0
orange_count = 0


apple.each do |app|
	if ((app + a) >= s && (app + a) <= t)
		apple_count += 1
	end
end

orange.each do |ora|
	if ((ora + b) >= s && (ora + b) <= t)
		orange_count += 1
	end
end

puts apple_count
puts orange_count