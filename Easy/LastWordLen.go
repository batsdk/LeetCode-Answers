// Question
// * https://leetcode.com/problems/length-of-last-word/

// Answer in Go
func lengthOfLastWord(s string) int {
	wordsArray := strings.Split(strings.TrimSpace(s), " ")
	length := len(wordsArray[len(wordsArray)-1])
	return length
}