public int solution(int[] people, int limit) {
		int num = people.length;
		int heavyPointer = people.length-1;
		int lightPointer = 0;
		int answer = 0;
		
		Arrays.sort(people);
		
		
		while(num!= 0) {
			if(2 <= num && people[heavyPointer] + people[lightPointer] <= limit) {
				lightPointer++;
				heavyPointer--;
				num -=2;
				answer+=1;
			}else {
				heavyPointer--;
				num-=1;
				answer+=1;
			}
		}        
        return answer;
    }