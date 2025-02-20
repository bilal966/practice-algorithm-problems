package com.xgeek.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 */
public class FindSubStringConcatinations {

	public static void main(String[] args) {
		FindSubStringConcatinations obj= new FindSubStringConcatinations();
		String s = "wordgoodgoodgoodbestword";//"barfoofoobarthefoobarman"
		String[] words= {"word","good","best","word"};//{"bar","foo","the"}
		System.out.println(obj.findSubstring(s,words));

	}

	public List<Integer> findSubstring(String s, String[] words) {
		if(words.length==0 || words.length>=5000|| s.length()==0 ||s.length()>=10000 || words[0].length()>=30) 
			return Collections.emptyList();

		// 1
		Map<String, Integer> fqMap = new HashMap<>();
		for(String w: words){
			fqMap.put(w, fqMap.getOrDefault(w, 0)+1);
		}

		List<Integer> result = new ArrayList<>();
		int count=words.length, len=words[0].length();
		//2
		for(int i=0; i<=s.length()-(count*len); i++){

			//3
			Map<String, Integer> seen = new HashMap<>();
			//4
			for(int j=0; j<count; j++){
				//bar foo foo bar the foo barman
				int nextIdx = i+j*len;
				System.out.println(nextIdx);
				//5
				String candidate = s.substring(nextIdx,nextIdx+len);

				//6
				if(!fqMap.containsKey(candidate))
					break;
				//7
				seen.put(candidate, seen.getOrDefault(candidate, 0)+1);

				if(seen.get(candidate)>fqMap.get(candidate)){

					break;
				}
				//8
				if(j == count-1){
					result.add(i);
				}
			}
		}
		//9
		return result;
	}

}
