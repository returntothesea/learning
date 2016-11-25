# When you select a contiguous block of text in a PDF viewer,
# the selection is highlighted with a blue rectangle. In a new kind
# of PDF viewer, the selection of each word is independent of
# the other words; this means that each rectangular selection
# area forms independently around each highlighted word.

# In this type of PDF viewer, the width of the rectangular
# selection area is equal to the number of letters in the word
# times the width of a letter, and the height is the maximum
# height of any letter in the word.

# Consider a word consisting of lowercase English alphabetic
# letters, where each letter is 1mm wide. Given the height of each
# letter in millimeters (mm), find the total area that will be highlighted
# by blue rectangle in mm^2 when the given word is selected in our new PDF viewer.


letters = ('a'..'z').to_a		# All the letters of the alphabet

h = gets.strip					# Inputs
h = h.split(' ').map(&:to_i)
word = gets.strip
l = word.length
word = word.split("")
max = 0

dic = Hash.new					# New dictionary

x = 0
letters.each do |let|			# For each of the letters, add the value of h as the value of the letter's key
	dic[let] = h[x]
	x += 1
end

word.each do |y|				# Cycle through to figure out the tallest letter of the word
	if (max < dic[y])
		max = dic[y]
	end
end

puts max * l 					# Print the product of the tallest letter and the length of the word to get total area