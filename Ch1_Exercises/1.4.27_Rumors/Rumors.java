public class Rumors { 
    public static void main(String[] args) {
    	int N = Integer.parseInt(args[0]);
        int sum = 0;
        int trials = 100000;
        int sucCnt = 0;
        for (int i = 0; i < trials; i++) {
            boolean[] party = new boolean[N];
            boolean flag = true;
            party[0] = true;
            int cnt = 0;
            while(flag) {
                int r = (int) (Math.random() * N);
                //System.out.println("r: " + r);
                if (party[r]) {
                    flag = false;
                    //System.out.println("failed");
                    break;
                } 
                party[r] = true;
                cnt++;
            }
            sum += cnt;
            if (flag) sucCnt++;    
            flag = true;   
            //System.out.println(sucCnt + " " + cnt + " " + sum);
            //System.out.println();
        }
        System.out.println("Probability everyone hear rumor: " + 100* (double)sucCnt / trials + "%");
        System.out.println("Estimate of expected number of people hear rumor: " + (double)sum / trials);
    }
}