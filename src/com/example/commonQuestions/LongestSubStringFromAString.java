package com.example.commonQuestions;

import java.util.HashMap;

public class LongestSubStringFromAString {
	public static void main(String[] args) {
		String sampleString = "FJKSDAFGJSHFSDGFYERFVDSBFDSFLJKGHDLASJKFGSDHFDSKFDSFLDJKJG";
		String maxLengthSubString = getMaxLengthSubStringApproach_ONE(sampleString);
		System.out.println(maxLengthSubString);
	}

	private static String getMaxLengthSubStringApproach_ONE(String sampleString) {
		int stringLength = sampleString.length();
		int currentStringLength = 1;
		int maxLength = 1;
		int previousIndex = 0;
		int beginIndex = 0;
		HashMap<Character, Integer> visitedCharMap = new HashMap<>();
		for (int i = 1; i < stringLength; i++) {
			previousIndex = visitedCharMap.getOrDefault(sampleString.charAt(i), -1);
			if (previousIndex == -1 || (i - previousIndex > currentStringLength)) {
				currentStringLength++;
			} else {
				if (currentStringLength > maxLength) {
					maxLength = currentStringLength;
					beginIndex = previousIndex;
				}
				currentStringLength = i - previousIndex;
			}
			visitedCharMap.put(sampleString.charAt(i), i);
		}
		return sampleString.substring(beginIndex, (beginIndex + maxLength));
	}

}
