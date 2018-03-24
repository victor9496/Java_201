public class TypingJob {
    public int bestTime(int[] pages) {
        // TODO complete bestTime(int[])
    	
        return bestTime(pages,0,0,0,0);
    }
    
    /**
     * returns minimum number of  minutes to type papers in pages
     * starting with index-th paper and given minutes assigned to typists
     * @param pages number of pages for each paper
     * @param index of paper to start with. That is, consider papers[index,papers.length-1]
     * @param t1 number of pages typed so far by typist 1
     * @param t2 number of pages typed so far by typist 2
     * @param t3 number of pages typed so far by typist 3
     * @return minimum number of pages to type all papers given current
     * assignment
     */
    public int bestTime(int[] pages, int index, int t1, int t2, int t3) {
        // TODO complete bestTime(int[], int, int, int, int)
    	if(pages == null || pages.length == 0) {
    		return 0;
    	}
    	
    	if(index >= pages.length) return Math.max(t1, Math.max(t2, t3));
    	
	
	int type1 = bestTime(pages, index + 1,t1 + pages[index], t2,t3);
	int type2 = bestTime(pages, index + 1,t1, t2 + pages[index],t3);
	int type3 = bestTime(pages, index + 1,t1, t2,t3 + pages[index]);
	
	return Math.min(type1, Math.min(type2, type3));
    }

    public static void main(String[] args) {
        // TODO add test cases
        int[][] tests = {
        		{1,2,3,4,5,6,7},
        		{3,3,3,5,9,10,10},
        		{100, 35, 13, 83, 4, 95, 62, 13, 100, 70}};
        TypingJob obj = new TypingJob();
        for (int[] t: tests) {
        		System.out.println(obj.bestTime(t));
        }
    }
}
