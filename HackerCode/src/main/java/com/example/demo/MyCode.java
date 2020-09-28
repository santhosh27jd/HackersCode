package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCode {

	private int id;
	private String name;
	
	public MyCode() {
		// TODO Auto-generated constructor stub
		System.out.println("MyCode is created");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void test() {
		int[] a = {1,2,1,2,1,3,2};
		int n = 7;
		int v = 1/2;
		//System.out.println(v);
		String path = "UDDDUDUU";
		//getValley(path);
		//sockMerchant(n, a);
		int[] cloud = {0,0,1,0,0,1,0};
		//{0,0,1,0,0,1,0};
		//jumpingOnClouds(cloud);
		
		String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
		long no = 736778906400l;
	
		String ss = "abcac";
		long nn = 10;
		//repeatedString(s, no);
		          
		//String s = "abc";
		//long no = 10;
		//anotherRepeatedString(s, no);
		//int [][] arra= {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
		int [][] arra= {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
		//hourglassSum(arra);
		//1 1 1 0 0 0
		//0 1 0 0 0 0
		//1 1 1 0 0 0
		//0 0 2 4 4 0
		//0 0 0 2 0 0
		//0 0 1 2 4 0
		
		int[] ar = {1,2,3,4,5};
		//rotLeft(ar,0);
		int q[] = {7,1,3,2,4,5,6};
		//int[] q = {5,1,2,3,7,8,6,4};
		//int[] q = {1,2,5,3,7,8,6,4};
		//{2,5,1,3,4};
		//1 2 5 3 4 7 8 6
		//int[] q = {2,5,1,3,4};
		//minimumBribes(q);
		String aa = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		//String aa ="cde";
		//String b = "abc";
		//makeAnagram(aa,b);
		String ax = "AAABBB";
		//alternatingCharacters(ax);
		
		String ay = "abcc";
		isValid(ay);
	}
	
	 static String isValid(String s) {
		 String valid = "NO";
		 char[] c = s.toCharArray();
		 Arrays.sort(c);
		 HashMap<Character, Integer> hash = new HashMap<>();
			for(char x : c) {
				int chac = 1;
				if(hash.containsKey(x)) {
					chac = chac +hash.get(x);
				}
				hash.put(x, chac);
			}
		System.out.println(hash.toString());
		
		for(int i=0; i<c.length; i++) {
			int nextIndex = i +1;
			int charlen = hash.get(c[i]);
			if(nextIndex < c.length && charlen == hash.get(c[nextIndex])) {
				valid = "YES";
			}else if(hash.get(c[nextIndex]) > charlen + 1){
				valid = "YES";
			}
		}
		 
		return valid;

	    }
	
	 static int alternatingCharacters(String s) {
		 int deletion = 0;
		 char[] a = s.toCharArray();
		 for(int index = 0; index < a.length; index ++) {
			 int nextindex = index + 1;
			 	if(nextindex < a.length && a[index] == a[nextindex]) {
			 		deletion ++;
			 	}
		 }
		 
		 System.out.println(deletion);
		 
		 return deletion;

	    }
	 

	
	static int makeAnagram(String a, String b) {
		char[] aVal = a.toCharArray();
		char[] bVal = b.toCharArray();
		int count = 0;
		Arrays.sort(aVal);
		Arrays.sort(bVal);
		System.out.println(aVal);
		System.out.println(bVal);
		HashMap<Character, Integer> hash = new HashMap<>();
		for(char x : aVal) {
			int chac = 1;
			if(hash.containsKey(x)) {
				chac = chac +hash.get(x);
			}
			hash.put(x, chac);
		}
		System.out.println(hash.toString());
		
		HashMap<Character, Integer> hash1 = new HashMap<>();
		for(char x : bVal) {
			int chac = 1;
			if(hash1.containsKey(x)) {
				chac = chac +hash1.get(x);
			}
			hash1.put(x, chac);
		}
		System.out.println(hash1.toString());
		
		for(char cc ='a'; cc<='z'; cc++ ) {
			int val = 0;
			int val1 = 0;
			if(hash.containsKey(cc)) {
				 val =hash.get(cc);
			}
			if(hash1.containsKey(cc)) {
				 val1 =hash1.get(cc);
			}
			if(val != val1) {
				if(val > val1){
					count = count + (val - val1);
				}else if(val1 > val) {
					count =  count + (val1 - val);
				}
			}
			
		}
		System.out.println(count);
			return count;
    }
	static void miniBribe(int[] q) {
		// index logic
		//Quick sort
	}
	
	 static void minimumBribes(int[] q) {
		 // Sorting
		 int minimumBribe=0;
		 String chaotic = "Too chaotic";
		 int bribecount = 0;
		 HashMap<Integer,Integer> hash = new LinkedHashMap<Integer,Integer>();
		 int currentIndx =0;
		 for(int i=0; i<q.length; i++) {
			 // perform sorting
			 int val= q[i];
			 currentIndx = i;
			 for(int j= i+1; j < q.length; j ++) {
				 int nextIndex =j;
				 if(nextIndex < q.length && val < q[nextIndex]) {
					 continue;
				 }else if(nextIndex < q.length){
					 // swap
						 if(!hash.containsKey(val)) {
							 bribecount =0;
						 }else {
							 bribecount = hash.get(val);
						 }
						 bribecount ++;
						 hash.put(val, bribecount);
					 
					 System.out.println("Bribe count for "+val + " is " + bribecount);
					
						 int tmp =  q[nextIndex];
						 q[j] = val;
						 q[currentIndx] = tmp;
						 currentIndx = nextIndex;
						 i--;
						 break;
				 }
			 }
		 }
		 System.out.println(hash.toString());
		 boolean isCatoc = false;
		 Collection<Integer> key = hash.values();
		 Iterator<Integer> it =key.iterator();
		 while(it.hasNext()) {
			int val = it.next();
			if(val > 2) {
				isCatoc = true;
				break;
			}else {
				minimumBribe = minimumBribe +val;
			}
		 }
		 if(isCatoc) {
			 System.out.println("-----"+chaotic);
		 }else {
			 System.out.println("-----"+minimumBribe);
		 }
		 hash.clear();
		 for(int c : q) {
			 System.out.println("-----"+c);
		 }
		 
	 }
	
	static int[] rotLeft(int[] a, int d) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int j=0; j<a.length; j++) {
			list.add(a[j]);
		}
		
		System.out.println(list.toString());
		System.out.println("-----");
		
		
		List<Integer> slist = list.subList(0, d);
		List<Integer> slist1 = list.subList(d, list.size());
		
		System.out.println(slist.toString());
		System.out.println(slist1.toString());
		
		List<Integer> lnist = new ArrayList<Integer>();
		lnist.addAll(slist1);
		lnist.addAll(slist);
		
		
		System.out.println("-----");
		
		System.out.println(lnist.toString());
		int[] x = new int[lnist.size()];
		for(int j=0; j<x.length; j++) {
			x[j] = lnist.get(j);
		}
		
		return x;
    }
	
	static int hourglassSum(int[][] arr) {
		int sum = 0;
		List<Integer> list = new LinkedList<Integer>();
		for(int n = 0;n< 4; n++) {
			int c = 0;
			for(int i = 4;i> 0; i--) {
				int hoursum = getHourGlass(n,c,arr);
				list.add(hoursum);
				c = c + 1;
				//System.out.println(""+hoursum);
			}
		}
		Collections.sort(list);
		if(!list.isEmpty()) {
			sum = list.get(list.size()-1);
		}
		System.out.println(sum);
		return sum;
    }
	
	static int getHourGlass(int row, int col, int arr[][]){
		int hoursum= 0;
		int outerloop = 0;
		for(int k=row; k<6; k++) {
			if(k == row + 3) {
				break;
			}
			int innerloop = 0;
			for(int l= col ; l<6; l++) {
				if(outerloop == 1 && innerloop == 1) {
					//System.out.println("***********"+arr[k][l]);
					hoursum = hoursum + arr[k][l];
				}else if(outerloop  != 1){
					if(l == col + 3) {
						break;
					}
						//System.out.println(arr[k][l]);
						hoursum = hoursum + arr[k][l];
				}
				
				innerloop = innerloop + 1;
			}
			outerloop = outerloop + 1;
		}
		return hoursum;
	}
	
	static long repeatedString(String s, long n) {
		long repeatedACount = 0;
		
		if(s.length() == 0) {
			return repeatedACount;
		}
		
		if(s.length() == 1 && s.equals("a")) {
			return n;
		}
		
		for(char c: s.toCharArray()) {
			if(c == 'a'){
				repeatedACount ++;
			}
		}
		
		long repeatedStr = n/s.length();
		long remainingStr = n - (repeatedStr*s.length());
		
		int remainACount = 0;
		char[] arr =s.toCharArray();
		for(int k=0; k <remainingStr; k++) {
			if(k < remainingStr && arr[k] == 'a') {
				remainACount++;
			}
		}
		
		long value = (repeatedACount * repeatedStr) + remainACount;
		
		System.out.println(value);
		
		return value;
    }
	
	static long anotherRepeatedString(String s, long n) {
		long count = 0;
		long len = s.length();
		long div = n/len;
		long totlen = len * div;
		long rem = n - totlen;
		
		if(s.length() == 0) {
			return count;
		}
		
		if(s.length() == 1 && s.equals("a")) {
			return n;
		}

		StringBuilder sb = new StringBuilder();

		for(long j = 0;  j < div; j++) {
			sb.append(s);
		}
		
		for(int j = 0;  j < rem; j++) {
			sb.append(s.charAt(j));
		}
		
		for(char c: sb.toString().toCharArray()) {
			if(c == 'a'){
				count ++;
			}
		}
		
		System.out.println(sb.toString());
		System.out.println(count);
		return count;
    }
	

	
	static int jumpingOnClouds(int[] cloud) {
		int jumpCount = 0; // min jump count
        int len = cloud.length;
        for (int i=0; i<len; ) {
            int twoindex = i+2;
            int oneindex = i+1;
            
            if(twoindex < len && cloud[twoindex] == 0) { // shortest path
                    i = twoindex;
                    jumpCount = jumpCount + 1;
                
            }else if (oneindex < len && cloud[oneindex] == 0) { // normal path
                    i = oneindex;
                    jumpCount = jumpCount + 1;
                
            }else {
            	break;
            }
        }
        System.out.println(jumpCount);
		return jumpCount;
    }
	
	static int getValley(String path) {
		int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : path.toCharArray()){
            if(c == 'U') 
            	lvl++;
            if(c == 'D')
            	lvl--;
            
            // if we just came UP to sea level
            if(lvl == 0 && c == 'U')
                v++;
        }
        System.out.println(v);
        return v;
	}
	
	
    static int sockMerchant(int n, int[] ar) {
    	
    	
    	int count = 1;
    	HashMap<Integer, Integer> hash = new LinkedHashMap<Integer, Integer>();
    		for(int i=0; i<ar.length; i++) {
    			int val = ar[i];
    			if(!hash.isEmpty()) {
    				if(hash.containsKey(val)) {
    					continue;
    				}
    			}
    			for(int j=i+1; j<ar.length; j++) {
    				if(val == ar[j]) {
    					count ++;
    				}
    			}
    			hash.put(val, count);
    			count = 1;
    		}
    		System.out.println(hash);
    		Collection<Integer> value = hash.values();
    		Iterator<Integer> it = value.iterator();
    		int paircount = 0;
    		while(it.hasNext()) {
    			int val = it.next();
    			int div = val/2;
    			paircount = paircount + div;
    		}
    		System.out.println(paircount);
        return 0;
    }
	
	public void show() {
		System.out.println("I am Alien");
		//getNthFib(1);
		
		int[][] matrix =  { {1,0,0,1,0},
							{1,0,1,0,0},
							{0,0,1,0,1},
							{1,0,1,0,1},
							{1,0,1,1,0}
						  };
		//riverSizes(matrix);
		
		List<String> customers = new ArrayList<String>();
		customers.add("10");
		customers.add("yellowshirt");
		customers.add("redhat");
		customers.add("blackshirt");
		customers.add("bluepant");
		customers.add("redhat");
		customers.add("pinkhat");
		customers.add("blackShirt");
		customers.add("yellowshirt");
		customers.add("greenpant");
		customers.add("greenpant");
		
		
		
		//mostActive(customers);
		featuredProduct(customers);
		String str = "aeoibsddaeiouudb"; 
        //findSubstring(str); 
	}
	
	public  int getNthFib(int n) {
	    // Write your code here.
		int firstElement = 0;
		int secElement = 1;
		int lastElement = 0;
		int preElement = 0;
		
		if(n == 1) {
			return 0;
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(firstElement);
		arr.add(secElement);
		
		for(int i=0; i<n; i++) {
			
			if(arr.size() == n) {
				  return lastElement;
			}
			
			if(i >= 2) {
				lastElement = arr.get(arr.size() -1);
				preElement = arr.get(arr.size() -2);
				arr.add(preElement + lastElement);
			}
			
		}
		if(arr.size() > 0) {
			lastElement = arr.get(arr.size() -1);
		}
		
		System.out.println(arr.toString());
		System.out.println(lastElement);	
		
		int[][] matrix =  {
				{1,0,0,1,0},
				{1,0,1,0,0},
				{0,0,1,0,1},
				{1,0,1,0,1},
				{1,0,1,1,0}
			  };
	    return lastElement;
	}
	Hashtable<String,String> hash = new Hashtable<String,String>();
	Map<String,Integer> riverSizeMap = new HashMap<String,Integer> ();
	public List<Integer> riverSizes(int[][] matrix) {
	    // Write your code here.
		
		int row = matrix.length;
		int column = matrix[0].length;
		System.out.println(row +""+column);
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				int val = matrix[i][j];
				String key = i+","+j;
				if(isVisited(key)){
					continue;
				}
				if(val == 1) { // its river
					hash.put(key, "Visited");
					//if 1st row, dont check up
					if(i == 0) {
						int riverSize = checkRight(matrix,i, j);
						if(riverSize > 0) {
							riverSizeMap.put(key, riverSize);
						}
						
					}else if(i == row){
						// last row
					}else {
						// check all
					}
				}
			}
		}
		return new ArrayList<Integer>();
	  }
	
	private boolean isVisited(String indexes) {
		String val= hash.get(indexes);
		if(val.equals("Visited")) {
			return true;
		}
		return false;
	}
	
	private int checkUp(int[][] matrix,int rowIndex, int colIndex) {
		
		return 0;
		
	}
	private int checkDown(int[][] matrix,int rowIndex, int colIndex) {
		return 0;
	}
	private int checkRight(int[][] matrix,int rowIndex, int colIndex) {
		if(colIndex < matrix[0].length - 1) {
			int column = colIndex + 1;
			int val = matrix[rowIndex][column];
			if(val == 1) {
				String key = rowIndex+","+column;
				hash.put(key, "Visited");
				val = val + checkRight(matrix, rowIndex, column);
				return val;
			}
		}
		return 0;
	}
	private int checkLeft(int[][] matrix,int rowIndex, int colIndex) {
		return 0;
	}
	
	public static List<String> mostActive(List<String> customers) {
		List<String> finalval = new ArrayList<String>();
	    // Write your code here
	    if(customers.isEmpty()){
	        return new ArrayList<String>();
	    }
	    Map<String, Integer> map= new HashMap<String, Integer>();
	        for(int i=1; i<customers.size(); i++){
	            if(i ==0){
	                String firstValue = customers.get(i);
	                char c = firstValue.charAt(0);
	                if(!Character.isUpperCase(c)){
	                    // is not valid first string
	                }
	            }
	            int count = getTrade(customers.get(i),customers);
	            map.put(customers.get(i), count);
	        }
	        System.out.println(map.toString());
	        Set<String> set = map.keySet();  

	        Object[]val = set.toArray();



	        for(int j=0;j<set.size();j++){
	           int count = map.get(val[j]);
	           float percentage = (count * 100)/ 21;
	           System.out.println(percentage);
	           if(percentage > 5){
	            finalval.add((String)val[j]);
	           }
	        }
	               
	        return null;
	    }
	
	private static int getTrade(String val, List<String> customers){
        int count = 0;
        if(!customers.isEmpty()){
            for(int i=0; i<customers.size(); i++){
                if(val.equals(customers.get(i))){
                    count = count + 1;
                }
            }
            
        }
        return count;
    }
	
	
	  public static String featuredProduct(List<String> products) {
		    // Write your code here
		    String lastValue = "";
		    Collections.sort(products);
		    System.out.println(products);
		   //   Map<String, Integer> map= new HashMap<String, Integer>();
		  	HashMap<String, Integer> hash = new LinkedHashMap<String, Integer>();
		            for(int i=1; i<products.size(); i++){
		                int count = getCount(products.get(i),products);
		                hash.put(products.get(i), count);
		            }
System.out.println(hash.toString());
					


				Set<String> val = hash.keySet();
					Map<String, Integer> map= new HashMap<String, Integer>();
				Collection<Integer> sds = hash.values();
				
				
				Object[] ss = val.toArray();
				for(int i=0; i<ss.length; i++) {
					String sk = (String) ss[i];
					
				}
				
				
		    return lastValue;
		    }
		        private static int getCount(String val, List<String> prod){
		        int count = 0;
		        if(!prod.isEmpty()){
		            for(int i=0; i<prod.size(); i++){
		                if(val.equals(prod.get(i))){
		                    count = count + 1;
		                }
		            }
		            
		        }
		        return count;
		    }
	
	
	 // Returns true if x is vowel. 
    static boolean isVowel(char x) { 
        // Function to check whether a character is 
        // vowel or not 
        return (x == 'a' || x == 'e' || x == 'i' 
                || x == 'o' || x == 'u'); 
    } 
  
    static void findSubstring(String str) { 
        HashSet<Character> hash = new HashSet<Character>();  
            // To store vowels 
  
        // Outer loop picks starting character and 
        // inner loop picks ending character. 
        int n = str.length(); 
        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n; j++) { 
  
                // If current character is not vowel, 
                // then no more result substrings 
                // possible starting from str[i]. 
                if (isVowel(str.charAt(j)) == false) 
                    break; 
  
                // If vowel, then we insert it in hash 
                hash.add(str.charAt(j)); 
  
                // If all vowels are present in current 
                // substring 
               // if (hash.size() == 5) 
                   // System.out.print(str.substring(i, j + 1) + " "); 
            } 
            hash.clear(); 
        } 
        
        String input = "a";
        int len = 0;
        int ren = 1;
        StringBuffer  strb = new StringBuffer();

        for(int i=0; i< len; i ++){ // left
        	
            char c = input.charAt(0);
            String str1 = input.substring(1);
            strb.append(str1);
            strb.append(c);
            input = strb.toString();
            strb = null;
            System.out.println(input);
        }
        System.out.println("--------");
        if(len == 0) {
        	strb.append(input);
        }
        String ss = strb.toString();
        
       
        StringBuffer strR = new StringBuffer();
       
        
        for(int j=0; j< ren; j ++){ // right
        	
            char c = ss.charAt(ss.length()-1);
            String str2 = ss.substring(0, ss.length() - 1);
            strR.append(c);
            strR.append(str2);
            ss = strR.toString();
            System.out.println(ss);
        }
        System.out.println(strR.toString());
        
        
    } 
  
}
